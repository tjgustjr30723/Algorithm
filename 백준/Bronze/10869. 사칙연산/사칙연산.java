import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);

        int A = scanner1.nextInt();
        int B = scanner1.nextInt();

        System.out.println(add(A,B));
        System.out.println(sub(A,B));
        System.out.println(mul(A,B));
        System.out.println(div1(A,B));
        System.out.println(div2(A,B));
    }
    public static int add(int a, int b) {
        return a + b;
    }
    public static int sub(int a, int b) {
        return a - b;
    }
    public static int mul(int a, int b) {
        return a * b;
    }
    public static int div1(int a, int b) {
        return a / b;
    }
    public static int div2(int a, int b) {
        return a % b;
    }
}