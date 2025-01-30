import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Study study = new Study(s);
        study.check();
    }
}
class Study {
    private String s;

    public Study(String s) {
        this.s = s;
    }

    public void check() {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i > 1 && s.charAt(i) == '=' && s.charAt(i - 1) == 'z' && s.charAt(i - 2) == 'd') {
                count--;
                continue;
            }
            if (i > 0 && s.charAt(i) == '=') {
                if (s.charAt(i - 1) == 'c' || s.charAt(i - 1) == 's' || s.charAt(i - 1) == 'z') {
                    continue;
                }
            }
            if (i > 0 && s.charAt(i) == '-') {
                if (s.charAt(i-1) == 'c' || s.charAt(i - 1) == 'd'){
                    continue;
                }
            }
            if (i > 0 && s.charAt(i) == 'j') {
                if (s.charAt(i-1) == 'l' || s.charAt(i - 1) == 'n'){
                    continue;
                }
            }
            count++;
        }
        System.out.println(count);
    }
}