import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            int n = Integer.parseInt(br.readLine());
            List<Integer> list = new ArrayList<>();
            int count = 0;
            boolean[] prime = new boolean[n + 1];
            for (int j = 2; j <= n; j++) {
                if (prime[j]) {
                    continue;
                }
                for (int k = j + j; k <= n; k += j) {
                    prime[k] = true;
                }
                list.add(j);
            }
            for (int j = 0; j < list.size(); j++) {
                int index = list.get(j);
                if (!prime[n - index] && (n - index) > index || (n - index) == index) {
                    count++;
                }
            }
            list.clear();
            sb.append(count).append("\n");
        }
        System.out.println(sb);
    }
}