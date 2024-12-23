import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);

        int N = scanner1.nextInt();
        for (int i = 1; i < 10; i++) {
            table(N, i);
        }
    }
    public static void table(int N, int i){
        System.out.println(N + " * " + i + " = " + N*i);
    }
}