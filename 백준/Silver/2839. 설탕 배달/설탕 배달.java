import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int min_count = Integer.MAX_VALUE;
        for (int i = (N/5); i >= 0; i--) {
            int n = N;
            int count = 0;
            n -= 5 * i;
            count += i;
            count += (n/3);
            n -= 3 * (n/3);
            if (n == 0 && min_count > count) {
                min_count = count;
            }
        }

        if (min_count != Integer.MAX_VALUE) {
            System.out.println(min_count);
        }else System.out.println(-1);
    }
}