import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int A1, A2, B1,B2;
        st = new StringTokenizer(br.readLine());
        A1 = Integer.parseInt(st.nextToken());
        B1 = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        A2 = Integer.parseInt(st.nextToken());
        B2 = Integer.parseInt(st.nextToken());

        int f_A, f_B;
        f_B = B1 * B2;
        f_A = (A1 * B2) + (A2 * B1);
        StringBuilder sb = new StringBuilder();
        int num = gcd(f_A, f_B);
        if (num != 1){
            f_A /= num;
            f_B /= num;
        }
        sb.append(f_A).append(" ").append(f_B);
        System.out.println(sb);

    }
    private static int gcd(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}