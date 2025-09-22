import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()); //명령어의 수
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < T; i++) {
            sb.append(solve(br.readLine())).append('\n');
        }

        System.out.println(sb);
    }
    
    public static String solve(String input) {
        Deque<Character> stack = new ArrayDeque<>();
        
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            
            if (c == '('){
                stack.push(c);
            }
            else if (stack.isEmpty()){
                return "NO";
            }
            else {
                stack.pop();
            }
        }
        
        if (stack.isEmpty()){
            return "YES";
        } else return "NO";
    }
}