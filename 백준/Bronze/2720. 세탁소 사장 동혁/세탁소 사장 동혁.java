import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        Study study = new Study(T);
        study.test(sc);
        study.cul();
    }
}
class Study {
    private int T;
    private int[] price;
    public Study(int T) {
        this.T = T;
        price = new int[T];
    }
    public void test(Scanner sc) {
        for (int i = 0; i < T; i++) {
            price[i] = sc.nextInt();
        }
    }
    public void cul() {
        int[] coins = {25, 10, 5, 1};
        for (int i = 0; i < T; i++) {
            int p = price[i];
            int[] money = new int[4];

            for (int j = 0; j < 4; j++) {
                money[j] = p / coins[j];
                p %= coins[j];
            }

            for (int k : money) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}