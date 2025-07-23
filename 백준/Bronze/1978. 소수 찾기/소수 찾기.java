import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int count = 0;
        for (int i = 0; i < N; i++) {
            if (arr[i] == 1) {
                continue;
            } else if (arr[i] == 2) {
                count++;
                continue;
            }
            for (int j = 2; j < arr[i]; j++) {
                if (arr[i] % j == 0) {
                    count--;
                    break;
                }
            }
            count++;
        }
        System.out.println(count);
    }
}
