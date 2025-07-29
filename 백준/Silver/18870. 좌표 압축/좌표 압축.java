import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] origin  = new int[N];
        int[] sorted  = new int[N];

        Map<Integer, Integer> map = new HashMap<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            sorted[i] = origin[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(sorted);
        int i = 0;
        for (int num : sorted) {
            if (!map.containsKey(num)) {
                map.put(num, i);
                i++;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < N; j++) {
            int value = map.get(origin[j]);
            sb.append(value).append(" ");
        }
        System.out.println(sb);
    }
}
