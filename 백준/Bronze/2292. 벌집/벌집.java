import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int count = 1;
        int num = 1;
        while (N > 1) {
            if (N > num && N <= num + (6 * count)) {
                count++;
                break;
            }
            num += (6 * count);
            count++;
        }
        System.out.println(count);
    }
}
