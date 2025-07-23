import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        int sum = 0;
        int first = 0;
        boolean flag;
        while(N >= M) {
            flag = true;
            if (M == 1) {
                M++;
                continue;
            } else if (M == 2) {
                sum += 2;
                M++;
                if (first != 1) {
                    first = 2;
                }
                continue;
            }
            for (int i = 2; i < M; i++) {
                if (M % i == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                sum += M;
                if (first == 0) {
                    first = M;
                }
            }
            M++;
        }
        if (sum == 0) {
            System.out.println(-1);
        } else{
            System.out.println(sum + "\n" + first);
        }
    }
}
