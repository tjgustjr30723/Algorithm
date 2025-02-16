import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.nextLine();
        String[] str = N.split("");
        int n = Integer.parseInt(N);
        for (int i = n - (9 * str.length); i < n; i++) {
            int sum = 0, a = 1;
            while ((i / a) != 0) {
                sum += (i / a) % 10;
                a *= 10;
            }
            sum += i;
            if (sum == n) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(0);
    }
}