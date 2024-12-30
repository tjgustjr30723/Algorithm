import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        Array array = new Array(size);
        array.set(scanner);
        array.print();
    }
}

class Array {
    private int[] arr;

    public Array(int size) {
        this.arr = new int[size];
    }
    public void set (Scanner scanner) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
    }
    public void culMax(){
        int i = 0;
        int max = arr[i];
        while (i < arr.length - 1) {
            if (max < arr[i + 1]) {
                max = arr[i + 1];
            }
            i++;
        }
        System.out.print(max);
    }
    public void culMin(){
        int i = 0;
        int min = arr[i];
        while (i < arr.length - 1) {
            if (min > arr[i + 1]) {
                min = arr[i + 1];
            }
            i++;
        }
        System.out.print(min + " ");
    }
    public void print() {
        culMin();
        culMax();
    }
}