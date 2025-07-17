import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int Max = Integer.parseInt(br.readLine());
        int index = 1;
        for (int i = 2; i <= 9; i++) {
            int result = Math.max(Max, Integer.parseInt(br.readLine()));
            if (Max != result) {
                index = i;
                Max = result;
            }
        }
        System.out.println(Max + "\n" + index);
    }
}