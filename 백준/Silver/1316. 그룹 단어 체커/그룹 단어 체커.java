import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 0;
        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            boolean[] visited = new boolean[26];
            char ch = s.charAt(0);
            boolean flag = true;
            visited[ch - 'a'] = true;
            for (int j = 1; j < s.length(); j++) {
                char ch1 = s.charAt(j);
                if (ch1 != ch){
                    if (visited[ch1 - 'a']){
                        flag = false;
                        break;
                    }
                    visited[ch1 - 'a'] = true;
                }
                ch = s.charAt(j);
            }
            if (flag){
                count++;
            }
        }
        System.out.println(count);
    }
}
