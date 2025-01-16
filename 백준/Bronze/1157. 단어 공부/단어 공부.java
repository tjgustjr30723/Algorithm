import java.util.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toUpperCase();
        Study s1 = new Study(s);
        s1.check();
    }
}
class Study {
    private String s;
    
    public Study(String s) {
        this.s = s;
    }
    
    public void check() {
        char[] charArray = s.toCharArray();
        Arrays.sort(charArray);
        String str = new String(charArray);

        int max = 0, count = 1;
        char c = str.charAt(0);
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                if (count > max) {
                    max = count;
                    c = str.charAt(i - 1);
                } else if (count == max) {
                    c = '?';
                }
                count = 1;
            }
        }
        if (count > max) {
            c = str.charAt(str.length() - 1);

        } else if (count == max) {
            c = '?';
        }
        System.out.println(c);
    }
}