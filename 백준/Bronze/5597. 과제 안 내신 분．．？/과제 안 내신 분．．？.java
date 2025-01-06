import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr2 = new int[28];

        for (int i = 0; i < 28; i++) {
            arr2[i] = sc.nextInt();
        }

        Arrays.sort(arr2);
        int j = 0;

        for (int k = 0; k < 30; k++) {
            if (k + 1 != arr2[j]) {
                System.out.println(k + 1);
                continue;
            }
            if (j != 27) {
                j++;
            }
        }
    }
}