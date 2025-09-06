import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[20_000_001];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int index = Integer.parseInt(st.nextToken());
            arr[index + 10_000_000]++;
        }

        int M = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            int num = Integer.parseInt(st.nextToken());
            sb.append(arr[num + 10_000_000]).append(" ");
        }
        System.out.println(sb);
    }
}
