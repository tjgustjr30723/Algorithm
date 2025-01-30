import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] str = new String[N];
        for (int i = 0; i < N; i++) {
            str[i] = sc.next();
        }
        checker(str);
    }
    private static void checker(String[] str) {
        int count = str.length;
        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str[i].length() - 1; j++) {
                if (str[i].charAt(j) != str[i].charAt(j + 1)) {
                    if (str[i].indexOf(str[i].charAt(j) , j + 1) > 0) {
                        count--;
                        break;
                    }
                }
            }
        }
        System.out.println(count);
    }
}
