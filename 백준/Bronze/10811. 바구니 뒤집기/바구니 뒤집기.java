import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        Game game = new Game(N,M);
        game.change(sc);
    }
}

class Game {
    private int[] array;
    private int M;

    public Game (int N, int M) {
        this.array = new int[N];
        this.M = M;
        arrM(N);
    }
    public void arrM(int N) {
        for (int i = 0; i < N; i++) {
            array[i] = i + 1;
        }
    }

    public void change(Scanner sc) {
        for (int k = 0; k < M; k++) {
            int i = sc.nextInt() - 1;
            int j = sc.nextInt() - 1;
            if (i != j) {
                int n1 = i;
                int n2 = j;
                for (int j1 = 0; j1 < ((n2 - n1) / 2) + 1; j1++ ) {
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                    i++;
                    j--;
                }
            }


        }
        result();
    }
    public void result() {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}