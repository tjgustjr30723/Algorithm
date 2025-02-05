import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();

        int a = Math.min(x, y);
        int b = Math.min(w - x, h - y);
        System.out.println(Math.min(a, b));
    }
}
