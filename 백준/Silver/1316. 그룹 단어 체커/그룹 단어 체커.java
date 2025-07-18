import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 0;
        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            List<Character> list = new ArrayList<>();
            char ch = s.charAt(0);
            list.add(ch);
            boolean flag = true;
            for (int j = 1; j < s.length(); j++) {
                if (s.charAt(j) != ch){
                    if (list.contains(s.charAt(j))){
                        flag = false;
                        break;
                    }
                    ch = s.charAt(j);
                    list.add(ch);
                }
            }
            if (flag){
                count++;
            }
        }
        System.out.println(count);
    }
}
