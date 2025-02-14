import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 색종이 수
        boolean[][] arr = new boolean[100][100];

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            for (int j = x ; j < x + 10; j++) {
                for (int k = y ; k < y + 10; k++) {
                    if (arr[j][k]){
                        continue;
                    }
                    arr[j][k] = true;
                }
            }
        }
        int count = 0;
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if (arr[i][j]) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}