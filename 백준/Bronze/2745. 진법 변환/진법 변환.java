import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.next());
        int N = sc.nextInt();
        Study study = new Study(N, sb);
        study.cul();
    }
} 
class Study {
    private String s;
    private int N;
    public Study(int N, StringBuilder sb) {
        this.s = sb.reverse().toString();
        this.N = N;
    }

    public void cul() {
        int num = 1;
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int digit;
            if (Character.isDigit(c)) {
                digit = c - '0'; // 숫자 처리
            } else {
                digit = c - 'A' + 10; // 알파벳 처리
            }
            sum += digit*num;
            num *= N;
        }
        System.out.println(sum);
    }
}