import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        for (int i = 1; i <= N; i++) {
            for (int j = N - i; j > 0; j--) {
                sb.append(" ");
            }
            for (int k = 0; k < ((2*i) - 1); k++) {
                sb.append("*");
            }
            sb.append("\n");
        }

        for (int i = N-1; i > 0; i--) {
            for (int j = i; j < N; j++) {
                sb.append(" ");
            }
            for (int j = ((2*i) - 1); j > 0; j--) {
                sb.append("*");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
