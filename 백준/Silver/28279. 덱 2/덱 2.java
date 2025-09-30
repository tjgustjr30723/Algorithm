import java.io.*;
import java.util.*;

class Main {
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();
    static Deque<Integer> stack = new ArrayDeque<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        while (N-- > 0) {
            st = new StringTokenizer(br.readLine());
            solution(st.nextToken());
        }
        System.out.println(sb);
    }

    private static void solution(String input) {
        char ch = input.charAt(0);

        switch (ch) {
            case '1': stack.addFirst(Integer.valueOf(st.nextToken())); break;
            case '2': stack.addLast(Integer.valueOf(st.nextToken())); break;
            case '3': sb.append((stack.isEmpty() ? -1 : stack.removeFirst())).append('\n'); break;
            case '4': sb.append((stack.isEmpty() ? -1 : stack.removeLast())).append('\n'); break;
            case '5': sb.append(stack.size()).append('\n'); break;
            case '6': sb.append((stack.isEmpty() ? 1 : 0)).append('\n'); break;
            case '7': sb.append((stack.isEmpty() ? -1 : stack.peekFirst())).append('\n'); break;
            case '8': sb.append((stack.isEmpty() ? -1 : stack.peekLast())).append('\n'); break;
        }
    }
}

