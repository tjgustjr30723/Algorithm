import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Deque<Character> stack = new ArrayDeque<>();

        while(true) {
            String s = br.readLine();
            if (s.length() == 1 && s.contains(".")) break;
            boolean flag = true;
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c == '.') break;
                if (c == '(' || c == '['){
                    stack.push(c);
                } else if (c == ')') {
                    if (stack.isEmpty() || stack.peek() == '[') {
                        flag = false;
                        break;
                    }
                    stack.pop();
                } else if (c == ']') {
                    if (stack.isEmpty() || stack.peek() == '(') {
                        flag = false;
                        break;
                    }
                    stack.pop();
                }
            }
            if (flag && stack.isEmpty()){
                sb.append("yes").append("\n");
            } else {
                sb.append("no").append("\n");
            }
            stack.clear();
        }
        System.out.println(sb);
    }
}