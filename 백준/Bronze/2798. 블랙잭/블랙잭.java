import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int max = 0;
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        if (arr[0] + arr[1] + arr[2] > M) {
            System.out.println("출력 불가");
        }
        else {
            for (int i = 0; i < N; i++) {
                for (int j = i + 1; j < N; j++) {
                    for (int k = j + 1; k < N; k++) {
                        int sum = arr[i] + arr[j] + arr[k];
                        if (sum == M) {
                            System.out.println(M);
                            return;
                        }
                        else if (sum < M && sum > max) {
                            max = sum;
                        }
                    }
                }
            }
            System.out.println(max);
        }
    }
}