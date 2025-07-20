import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[][] arr = new String[5][15];

        String[] str;
        int max = 0;
        for (int i = 0; i < 5; i++) {
            str = br.readLine().split("");
            if (max < str.length) {
                max = str.length;
            }
            for (int j = 0; j < str.length; j++) {
                arr[i][j] = str[j];
            }
        }

        for (int i = 0; i < max; i++) {
            for (int j = 0; j < 5; j++) {
                if (arr[j][i] == null) {
                    continue;
                }
                sb.append(arr[j][i]);
            }
        }

        System.out.println(sb);
    }
}
