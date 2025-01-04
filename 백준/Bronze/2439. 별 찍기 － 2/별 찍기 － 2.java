import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int line = sc.nextInt();
        for (int i = line; i > 0; i--) {
            for (int j = 0; j < i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = i - 1; k < line; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}