import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        check(s);
    }
    public static void check(String s) {
        int p = 1;
        for (int i = 0; i <= (s.length() / 2) - 1; i++) {
            if (s.charAt(i) != s.charAt(s.length() - (1 + i))) {
                p = 0;
                break;
            }
        }
        System.out.println(p);
    }
}