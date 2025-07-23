import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringBuilder result = new StringBuilder();

        int n;
        int sum;
        while(true) {
            sum = 0;
            sb.delete(0, sb.length());
            n = Integer.parseInt(br.readLine());
            if (n == -1) break;
            result.append(n);
            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    sum +=i;
                    sb.append(i);
                    if (sum < n) {
                        sb.append(" + ");
                    }
                }
            }
            if (sum == n) {
                sb.append('\n');
                result.append(" = ");
                result.append(sb);
            } else {
                result.append(" is NOT perfect.").append("\n");
            }
        }
        System.out.println(result);
    }
}
