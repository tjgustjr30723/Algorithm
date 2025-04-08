import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int K = Integer.parseInt(br.readLine()); //명령어의 수
        Deque<Integer> stack = new ArrayDeque<>();
        int sum = 0;
        while (K-- > 0) {
            int n = Integer.parseInt(br.readLine());
            if (n != 0) {
                stack.push(n);
                sum += n;
            } else {
                sum -= stack.pop();
            }
        }
        System.out.println(sum);
    }
}