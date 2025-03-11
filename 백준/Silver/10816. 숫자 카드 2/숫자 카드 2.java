import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        Map<String, Integer> map = new HashMap<>();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            String num1 = st.nextToken();
            if (!map.containsKey(num1)) {
                map.put(num1, 0);
            } else map.put(num1, map.get(num1) + 1);
        }
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            String num2 = st.nextToken();
            if (map.containsKey(num2)) {
                sb.append(map.get(num2) + 1).append(" ");
            } else sb.append(0).append(" ");
        }
        System.out.println(sb);
    }
}