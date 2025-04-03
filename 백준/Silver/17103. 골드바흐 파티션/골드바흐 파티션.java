import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            int n = Integer.parseInt(br.readLine());
            int count = 0;
            boolean[] prime = new boolean[n + 1];
            for (int j = 2; j <= n; j++) {
                if (prime[j]) {
                    continue;
                }
                for (int k = j + j; k <= n; k += j) {
                    prime[k] = true;
                }
            }
            for (int j = 2; j <= n / 2; j++) {
                if (!prime[j] && !prime[n - j]) {
                    count++;
                }
            }
            sb.append(count).append("\n");
        }
        System.out.println(sb);
    }
}