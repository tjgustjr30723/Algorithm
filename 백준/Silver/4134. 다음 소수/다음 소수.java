import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int count = Integer.parseInt(br.readLine());
        for (int i = 0; i < count; i++) {
            long n = Long.parseLong(br.readLine());
            if (n == 0 || n == 1) {
                sb.append(2).append("\n");
                continue;
            }
            while (true) {
                boolean flag = true;

                for (int j = 2; j <= Math.sqrt(n); j++) {
                    if (n % j == 0) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    sb.append(n).append("\n");
                    break;
                }
                n++;
            }
        }
        System.out.println(sb);
    }
}