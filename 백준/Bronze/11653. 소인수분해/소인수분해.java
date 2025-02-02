import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int i = 2;
        if (N == 1) return;
        
        while(true) {
            if (N % i== 0) {
                System.out.println(i);
                if (N / i == 1){
                    break;
                }
                N /= i;
            }
            else i++;
        }
    }
}