import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int num;
        do {
            num = N % B;
            if (num <= 9) {
                sb.append((char) (num + 48));
            } else {
                sb.append((char) (num + 55));
            }
            N /= B;
        } while (N != 0);
        System.out.println(sb.reverse());

    }
}
