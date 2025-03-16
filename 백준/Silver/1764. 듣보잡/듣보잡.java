import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        Set<String> set = new HashSet<>();
        for (int i = 0; i < N; i++) {
            set.add(br.readLine());
        }
        Set<String> set1 = new TreeSet<>();
        for (int i = 0; i < M; i++) {
            String s = br.readLine();
            if(set.contains(s)) {
                set1.add(s);
            }
        }
        System.out.println(set1.size());
        for (String s : set1) {
            sb.append(s).append("\n");
        }
        System.out.println(sb);
    }
}