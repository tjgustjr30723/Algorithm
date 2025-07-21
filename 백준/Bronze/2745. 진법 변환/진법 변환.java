import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String str = st.nextToken();
        int N = Integer.parseInt(st.nextToken());

        int sum = 0;
        int a;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                a = str.charAt(i) - 55;
            } else {
                a = str.charAt(i) - 48;
            }
            for (int j = str.length() - 1; j > i; j--){
                a *= N;
            }
            sum += a;
        }
        System.out.println(sum);

    }
}
