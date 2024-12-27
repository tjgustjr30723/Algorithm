import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();

        sum(num1);

    }
    public static void sum(int num1) {
        int sum = 0;
        for (int i = 1; i <= num1; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}