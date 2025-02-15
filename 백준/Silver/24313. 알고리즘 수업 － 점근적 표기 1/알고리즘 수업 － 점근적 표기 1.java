import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a1 = sc.nextInt();
        int a0 = sc.nextInt();
        int c = sc.nextInt();
        int n0 = sc.nextInt();
        boolean result = false;
        if (c >= a1) {
            if (a1 == c) {
                result = (0 >= a0);
            } else if (a0 == 0) {
                result = true;
            } else if (a1 == 0) {
                result = ((c * n0) >= a0);
            } else result = (n0 >= (a0 / (c - a1)));
        }
        if (result){
            System.out.println(1);
        }else System.out.println(0);
    }
}