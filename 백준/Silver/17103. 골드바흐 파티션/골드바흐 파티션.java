import java.io.*;

public class Main {
    public static boolean[] prime = new boolean[1000001];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        isPrime();
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            int n = Integer.parseInt(br.readLine());
            int count = 0;
            for (int j = 2; j <= n / 2; j++) {
                if (!prime[j] && !prime[n - j]) {
                    count++;
                }
            }
            sb.append(count).append("\n");
        }
        System.out.println(sb);
    }
    private static void isPrime() {
        prime[0] = prime[1] = true;
        for (int j = 2; j <= Math.sqrt(prime.length - 1); j++) {
            if (prime[j]) {
                continue;
            }
            for (int k = j + j; k < prime.length; k += j) {
                prime[k] = true;
            }
        }
    }
}