import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        Array array = new Array(size);
        array.set(scanner);
        array.PrintArray();
    }
}

class Array {
    private int[] arr;

    public Array(int size) {
        this.arr = new int[size];
    }
    public void set(Scanner scanner) {
        for (int i = 0; i < arr.length; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            arr[i] = a + b;
        }
    }
    public void PrintArray() {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Case #"+(i+1)+": "+arr[i]);
        }
    }


}