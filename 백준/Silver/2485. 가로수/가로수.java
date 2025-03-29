import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int num = arr[1] - arr[0]; // 첫 번째 값으로 초기화
        for (int i = 1; i < arr.length - 1; i++) {
            num = gcd(num, arr[i + 1] - arr[i]); // 모든 요소의 최대공약수 계산
        }
        System.out.println(((arr[N - 1] - arr[0]) / num) - (N - 1));
    }

    private static int gcd(int a, int b) {
        while (b != 0) {
            int t = a % b;
            a = b;
            b = t;
        }
        return a;
    }
}

