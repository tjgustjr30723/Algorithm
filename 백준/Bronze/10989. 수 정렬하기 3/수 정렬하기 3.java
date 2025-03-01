import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int[] arr1 = new int[N];
        int[] count = new int[10_000];
        int[] result = new int[N];
        for (int i = 0; i < N; i++) {
            arr1[i] = Integer.parseInt(br.readLine());
            count[arr1[i] - 1]++;
        }
        for (int i = 1; i < 10_000;i++) {
            count[i] += count[i - 1];
        }
        for (int i = N - 1; i >= 0; i--) {
            count[arr1[i] - 1]--;
            result[count[arr1[i] - 1]] = arr1[i];
        }
        for (int i : result) {
            bw.write(i + "\n");
        }
        bw.flush();
    }
}