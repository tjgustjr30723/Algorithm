import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        int count = 1;
        for (int i = 1; i < s.length(); i++) {
            char c = s.charAt(i);
            char d = s.charAt(i - 1);
            if (c == '=') {
                if (i >= 2 && (d == 'z' && s.charAt(i - 2) == 'd')) {
                    count -= 1;
                    continue;
                } else if (d == 'c' || d == 's' || d == 'z') {
                    continue;
                }
            } else if (c == '-') {
                if (d == 'd' || d == 'c') {
                    continue;
                }
            } else if (c == 'j') {
                if (d == 'l' || d == 'n') {
                    continue;
                }
            }
            count++;
        }
        System.out.println(count);
    }
}
