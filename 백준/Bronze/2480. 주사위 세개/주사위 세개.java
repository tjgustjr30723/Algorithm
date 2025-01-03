import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        Game game = new Game(num1, num2, num3);
        game.start();

    }

}
class Game {
    private int num1;
    private int num2;
    private int num3;

    public Game(int num1, int num2, int num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }

    public void start() {
        if (num1 == num2 && num2 == num3) {
            N1();
        }
        else if (num1 != num2 && num2 != num3 && num3 != num1) {
            N3();
        }
        else
            N2();
    }

    public void N1() {
        System.out.println(10000 + num1 * 1000);
    }

    public void N2() {
        if (num1 == num2 || num1 == num3) {
            System.out.println(1000+num1*100);
        }
        if (num2 == num3) {
            System.out.println(1000+num2*100);
        }
    }

    public void N3() {
        int[] arr = {num1, num2, num3};
        int max = num1;
        for (int i = 1; i < 3; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max * 100);
    }
}