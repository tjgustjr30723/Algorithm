import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        ArrayList<Integer> list = new ArrayList<>();
        while (count != -1){
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            if (num1 == 0 && num2 == 0)
                break;
            list.add(num1 + num2);
        }
        for (int a: list){
            System.out.println(a);
        }
    }
}
