import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean[] arr = new boolean[246913];

        StringBuilder sb = new StringBuilder();
        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) break;
            int count = 0;
            for (int i = 2; i <= 2 * n; i++) {
                if (arr[i]) {
                    continue;
                }
                if (i > n) {
                    count++;
                }
                for (int j = i + i; j <= 2 * n; j += i) {
                    arr[j] = true;
                }
            }
            sb.append(count).append("\n");
        }
        System.out.println(sb);
    }
}