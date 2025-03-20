import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        Map<Integer, Integer> map = new HashMap<>();
        int N = Integer.parseInt(br.readLine());
        int[] arr1 = new int[N];
        int[] arr2 = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr1[i] = arr2[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr1);
        int count = 0;
        for (int i = 0; i < N; i++) {
            if (!map.containsKey(arr1[i])) {
                map.put(arr1[i], count);
                count++;
            }
        }
        StringBuilder sb= new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(map.get(arr2[i])).append(" ");
        }
        System.out.println(sb);
    }
}