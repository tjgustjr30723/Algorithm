import java.math.BigInteger;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        BigInteger[] arr = new BigInteger[T];
        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            arr[i] = (cul(M).divide(cul(N).multiply(cul(M - N))));
        }
        for (BigInteger i : arr) {
            System.out.println(i);
        }
    }
     private static BigInteger cul(int num) {
        BigInteger sum = BigInteger.valueOf(1);
         for (int j = 2; j <= num; j++) {
             sum = sum.multiply(BigInteger.valueOf(j));
         }
        return sum;
    }
}