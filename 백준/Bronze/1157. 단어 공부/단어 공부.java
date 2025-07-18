import java.io.*;
import java.util.*;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        char[] chars = str.toUpperCase().toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (char c : chars) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int max = Collections.max(map.values());

        long count = map.entrySet().stream()
                .filter(e -> e.getValue() == max)
                .count();

        if (count > 1) {
            System.out.println("?");
        } else {
            for (Map.Entry<Character, Integer> entry : map.entrySet()) {
                if (entry.getValue() == max) {
                    System.out.println(entry.getKey());
                    break;
                }
            }
        }
    }
}
