import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<Dot> dots = new ArrayList<Dot>();
        for (int i = 0; i < N; i++) {
            dots.add(new Dot(sc.nextInt(), sc.nextInt()));
        }
        Collections.sort(dots);
        for (int i = 0; i < dots.size(); i++) {
            System.out.println(dots.get(i).toString());
        }
    }
}
class Dot implements Comparable<Dot> {
    private int x;
    private int y;

    public Dot(int x, int y) {
        this.x = x;
        this.y = y;
    }
    @Override
    public int compareTo(Dot o1) {
        if (this.y > o1.y) {
            return 1;
        } else if (this.y == o1.y) {
            if (this.x > o1.x) {
                return 1;
            } else if (this.x == o1.x) {
                return 0;
            }else return -1;
        }else return -1;
    }

    @Override
    public String toString() {
        return x + " " + y;
    }
}
