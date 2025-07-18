import java.io.*;
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[26];
        String s = br.readLine();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                arr[s.charAt(i) - 65]++;
            } else
                arr[s.charAt(i) - 97]++;
        }
        int max = -1;
        char c = '?';
        for (int i = 0; i < 26; i++) {
            if (arr[i] > max){
                max = arr[i];
                c = (char)(i+65);
            }else if (arr[i] == max){
                c = '?';
            }
        }
        System.out.println(c);
    }
}
