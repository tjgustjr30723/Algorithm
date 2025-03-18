import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Set<String> set = new HashSet<>();
        String[] str = br.readLine().split("");
        int sum = 0;
        for (int i = 1; i <= str.length; i++) {
            sum += i;
        }
        int count1 = 0;
        int count2 = 1;
        for (int i = 0; i < sum; i++) {
            if (count1 == str.length || count1 + count2 > str.length) {
                count1 = 0;
                count2++;
                if (count2 > str.length) {
                    break;
                }
            }
            for (int j = count1; j < count1 + count2; j++) {
                sb.append(str[j]);
            }
            String s = sb.toString();
            set.add(s);
            sb.delete(0, sb.length());
            count1++;
        }
        System.out.println(set.size());
    }
}