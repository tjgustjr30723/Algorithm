import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<String> set = new HashSet<>();
        String s = br.readLine();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j < s.length() + 1; j++) {
                set.add(s.substring(i, j));
            }
        }
        System.out.println(set.size());
    }
}