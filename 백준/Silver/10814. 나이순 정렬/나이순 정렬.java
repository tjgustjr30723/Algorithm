import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());

        StringBuilder[] strs = new StringBuilder[201];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int age = Integer.parseInt(st.nextToken());
            if (strs[age] == null) {
                strs[age] = new StringBuilder();
                strs[age].append(age).append(" ").append(st.nextToken()).append("\n");
                continue;
            }
            strs[age].append(age).append(" ").append(st.nextToken()).append("\n");
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 201; i++) {
            if (strs[i] != null) {
                sb.append(strs[i]);
            }
        }
        System.out.println(sb);
    }
}
