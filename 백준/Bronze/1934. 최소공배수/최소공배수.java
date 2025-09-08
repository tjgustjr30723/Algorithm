import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            sb.append((A * B) / cul(A, B)).append("\n");
        }
        System.out.println(sb);
    }

    private static Integer cul(int A, int B) {
        int r = A % B;
        while (r != 0) {
            A = B;
            B = r;
            r = A % B;
        }
        return B;
    }

}
