import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb1 = new StringBuilder(sc.next());
        StringBuilder sb2 = new StringBuilder(sc.next());
        compare(sb1, sb2);
    }
    public static void compare(StringBuilder sb1, StringBuilder sb2) {
        int A = Integer.parseInt(sb1.reverse().toString());
        int B = Integer.parseInt(sb2.reverse().toString());
        if (A >= B) {
            System.out.println(A);
        }
        else System.out.println(B);
    }
}