import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();
        int fx = cul(x1, x2, x3);
        int fy = cul(y1, y2, y3);

        System.out.println(fx + " " + fy);
    }
    private static int cul(int n1, int n2, int n3) {
        if (n1 == n2) {
            return n3;
        }
        else {
            if (n1 == n3) {
                return n2;
            }
            else {
                return n1;
            }
        }
    }
}
