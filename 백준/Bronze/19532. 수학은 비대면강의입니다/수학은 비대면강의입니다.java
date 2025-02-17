import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        for (int i = 0; i < 6; i++) {
            arr[i] = sc.nextInt();
        }
        int cul = arr[0] * arr[4] - arr[3] * arr[1];
        if (cul != 0) {
            double x = (double)(arr[2] * arr[4] - arr[1] * arr[5]) / cul;
            double y = (double)(arr[0] * arr[5] - arr[3] * arr[2]) / cul;
            if (x % 1 == 0.0 && y % 1 == 0.0 && x >= -999 && x <= 999 && y >= -999 && y <= 999){
                System.out.println((int)x + " " + (int)y);
            }
        }
    }
}
