import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[][] arr = new char[5][15];  // 최대 길이 15로 설정

        for (int i = 0; i < 5; i++) {
            String line = sc.next();
            for (int j = 0; j < line.length(); j++) {
                arr[i][j] = line.charAt(j);
            }
        }
        for (int j = 0; j < 15; j++) {
            for (int i = 0; i < 5; i++) {
                if (arr[i][j] != '\0') {  // 기본값 '\0'인지 확인 후 출력
                    System.out.print(arr[i][j]);
                }
            }
        }
    }
}