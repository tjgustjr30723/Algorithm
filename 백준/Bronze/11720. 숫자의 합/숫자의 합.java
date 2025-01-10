import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        print(s, N);
    }
    private static void print(String s, int N) {
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += Integer.parseInt(s.substring(i, i + 1));
        }
        System.out.println(sum);
    }
}