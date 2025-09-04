import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st;
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String report = st.nextToken();
            if (report.equals("leave")) {
                map.remove(name);
                continue;
            }
            map.put(name, report);
        }
        Set<String> keys = map.keySet();
        List<String> keyList = new ArrayList<>(keys);
        Collections.sort(keyList, Collections.reverseOrder());

        StringBuilder sb = new StringBuilder();
        for (String key : keyList) {
            sb.append(key).append("\n");
        }
        System.out.println(sb);
    }
}
