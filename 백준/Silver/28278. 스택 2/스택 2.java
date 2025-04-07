import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Deque<Integer> stack = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            if (x == 1) {
                int y = sc.nextInt();
                stack.push(y);
            } else if (x == 2) {
                if (stack.isEmpty()) {
                    sb.append(-1).append("\n");
                    continue;
                }
                sb.append(stack.pop()).append("\n");
            } else if (x == 3) {
                sb.append(stack.size()).append("\n");
            } else if (x == 4) {
                if (stack.isEmpty()) {
                    sb.append(1).append("\n");
                } else sb.append(0).append("\n");
            } else {
                if (stack.isEmpty()) {
                    sb.append(-1).append("\n");
                    continue;
                }
                sb.append(stack.peek()).append("\n");
            }
        }
        System.out.println(sb);
    }
}