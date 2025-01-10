import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] c = {'a','b','c','d','e','f','g','h',
                'i','j','k','l','m','n','o','p','q',
                'r','s','t','u','v','w','x','y','z'};
        String s = sc.nextLine();
        print(s,c);
    }
    private static void print(String s, char[] c) {
        char[] cs = s.toCharArray();
        for (int i = 0; i < c.length; i++) {
            boolean inc = false;
            for (int j = 0; j < cs.length; j++) {
                if (cs[j] == c[i]) {
                    System.out.print(j + " ");
                    inc = true;
                    break;
                }
            }
            if (!inc) {
                System.out.print(-1 + " ");
            }
        }
    }
}