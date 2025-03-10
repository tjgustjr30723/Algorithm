import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            map.put(name, st.nextToken());
        }
        List<String> list = new ArrayList<>(map.keySet());
        list.sort(Collections.reverseOrder());
        for (String s : list) {
            if (map.get(s).equals("enter")) {
                sb.append(s).append("\n");
            }
        }
        System.out.println(sb);
    }
}