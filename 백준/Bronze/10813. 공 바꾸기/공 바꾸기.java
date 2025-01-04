import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = i + 1;
        }
        for (int c = 0; c < M; c++) {
            int i = sc.nextInt() - 1;
            int j = sc.nextInt() - 1;
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        for (int c = 0; c < N; c++) {
            System.out.print(arr[c] + " ");
        }
    }
}