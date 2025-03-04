import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int count = 0;
        Set<String> set = new HashSet<>();
        for (int i = 0; i < N; i++) {
            set.add(sc.next());
        }
        for (int i = 0; i < M; i++) {
            if (set.contains(sc.next())) {
                count++;
            }
        }
        System.out.println(count);
    }
}