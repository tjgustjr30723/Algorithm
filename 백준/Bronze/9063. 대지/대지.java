import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        int N = sc.nextInt();
        int width = 0;
        
        if (N >= 2){
            for (int i = 0; i < N; i++){
                list1.add(sc.nextInt());
                list2.add(sc.nextInt());
            }
            width = (Collections.max(list1) - Collections.min(list1)) * ((Collections.max(list2) - Collections.min(list2)));
        }
        System.out.println(width);
    }
}