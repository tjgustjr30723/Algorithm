import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Map<Integer, String> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();
        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            map1.put(i + 1, str);
            map2.put(str, i + 1);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            String s = br.readLine();
            char c = s.charAt(0);
            if (c >= '0' && c <= '9') {
                sb.append(map1.get(Integer.parseInt(s))).append("\n");
            } else {
                sb.append(map2.get(s)).append("\n");
            }
        }
        System.out.println(sb);
    }
}
