import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();

        sum(count, sc); // Scanner 객체를 전달하여 sum()에서 사용하도록 변경
    }

    public static void sum(int count, Scanner scanner) {
        int[] arr = new int[count];
        for (int i = 0; i < count; i++) {
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            arr[i] = num1 + num2;
        }

        for (int a: arr){
            System.out.println(a);
        }
    }
}
