import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int[] arr ={a,b,c};
        Arrays.sort(arr);

        if (!isCul(arr)){
            System.out.println(arr[0] + arr[1] + (arr[0] + arr[1] - 1));
        }
        else System.out.println(arr[0] + arr[1] + arr[2]);
    }
    private static boolean isCul(int[] arr) {
        return arr[2] < arr[0] + arr[1];
    }
}
