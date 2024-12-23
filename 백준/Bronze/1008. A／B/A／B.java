import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);

        int A = scanner1.nextInt();
        int B = scanner1.nextInt();

        System.out.println(div(A,B));
    }
    public static double div(int a, int b) {
        double A = a;
        double B = b;
        return A / B;
    }
}