import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int count = 0;

        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt() % 42;
        }

        Arrays.sort(arr);

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 42; j++) {
                if (arr[i] == j) {
                    if (i >= 1 && arr[i] == arr[i-1]){
                        continue;
                    }
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);
    }
}