import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        sc.nextLine();
        String num2 = sc.nextLine();
        int[] array = new int[num2.length()];

        ChangeStrToInt(num2, array);

        mulCul result = new mulCul(num1, array);
        result.cul();

    }

    public static void ChangeStrToInt(String num2, int[] array) {
        for (int i = 0; i < num2.length(); i++) {
            array[i] = num2.charAt(i) - '0';
        }
    }
}

class mulCul {
    private int num1;
    private int[] arr;
    public mulCul(int num1,int[] arr){
        this.num1 = num1;
        this.arr = arr;
    }
    public void cul(){
        int result = 0;
        int m = 1;
        for (int i = arr.length - 1; i > -1; i--) {
            arr[i] = num1*arr[i];
            System.out.println(arr[i]);
            result += arr[i] * m;
            m *= 10;
        }
        System.out.println(result);
    }
}
