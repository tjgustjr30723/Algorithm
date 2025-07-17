import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Exam exam = new Exam(N, sc);
        exam.fix();
    }
}
class Exam{
    private double[] array;

    public Exam(int N, Scanner sc) {
        this.array = new double[N];
        init(sc);
    }
    public void init(Scanner sc) {
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextDouble();
        }
    }
    public double findMax() {
        double max = array[0];
        for (int k = 1; k < array.length; k++) {
            if (array[k] > max) {
                max = array[k];
            }
        }
        return max;
    }
    public void fix() {
        double sum = 0;
        double max = findMax();
        for (int i = 0; i < array.length; i++) {
            sum += (array[i] / max) * 100;
        }
        double average = sum / array.length;
        System.out.println(average);
    }
}