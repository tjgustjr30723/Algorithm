import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);

        int A = scanner1.nextInt();
        int B = scanner1.nextInt();

        System.out.println(add(A,B));
    }
    public static int add(int a, int b) {
        return a + b;
    }
}