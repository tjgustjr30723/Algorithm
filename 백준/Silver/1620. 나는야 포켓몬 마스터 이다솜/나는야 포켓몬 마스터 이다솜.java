import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        Map<Integer, String> map1 = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();
        for (int i = 0; i < N; i++) {
            String poketmon = sc.next();
            map1.put(i+1, poketmon);
            map2.put(poketmon, i+1);
        }
        String[] str = new String[M];
        for (int i = 0; i < M; i++) {
            String findPoketmon = sc.next();
            if (findPoketmon.charAt(0) >= '1' && findPoketmon.charAt(0) <= '9') {
                str[i] = map1.get(Integer.parseInt(findPoketmon));
            } else str[i] = String.valueOf(map2.get(findPoketmon));
        }
        for (int i = 0; i < M; i++) {
            System.out.println(str[i]);
        }
    }
}