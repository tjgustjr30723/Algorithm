import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int N, M;

        do {
            st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());

            if (N == 0 || M == 0) {
                break;
            }
            if (M % N == 0) {
                sb.append("factor").append('\n');
            } else if (N % M == 0) {
                sb.append("multiple").append('\n');
            } else
                sb.append("neither").append('\n');
        } while (true);
        System.out.println(sb);
    }
}
