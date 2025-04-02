import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = 1;
        while (true) {
            n = Integer.parseInt(br.readLine());
            if (n == 0) {
                break;
            }
            boolean[] prime = new boolean[2*n + 1];
            int count = 0;
            for (int i = 2; i <= 2*n; i++) {
                if (prime[i]) {
                    continue;
                }
                if (i > n) {
                    count++;
                }
                for (int j = i + i; j <= 2*n; j += i) {
                    prime[j] = true;
                }
            }
            sb.append(count).append("\n");
        }
        System.out.println(sb);
    }
}
