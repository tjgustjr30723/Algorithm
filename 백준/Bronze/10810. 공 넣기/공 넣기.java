import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int[N];
        Arrays.fill(arr, 0);
        for (int c = 0; c < M; c++) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            int k = sc.nextInt();
            for (int d = i; d <= j; d++) {
                arr[d - 1] = k;
            }
        }
        for (int c = 0; c < N; c++) {
            System.out.print(arr[c] + " ");
        }
    }
}