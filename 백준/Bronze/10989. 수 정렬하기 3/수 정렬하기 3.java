import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        int[] arr = new int[100001];
        for (int i = 0; i < N; i++) {
            arr[Integer.parseInt(br.readLine())]++;
        }
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr[i]; j++) {
                sb.append(i).append("\n");
            }
        }
        System.out.println(sb);
    }
}
