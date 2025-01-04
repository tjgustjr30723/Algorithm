import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];
        for (int i = 0; i < 9; i++) {
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        int maxCount = 1;
        for (int i = 1; i < 9; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxCount = i+1;
            }
        }
        System.out.println(max +"\n" + maxCount);
    }
}