import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Number number = new Number(str);
        number.print();
    }
}
class Number{
    private char[] c;
    public Number(String str) {
        this.c = str.toCharArray();
    }
    public void print() {
        int time = 0;
        for (int i = 0; i < c.length; i++) {
            if ('A' <= c[i] && c[i] <= 'Z') {
                if (c[i] == 'S' || c[i] == 'V') {
                    time -= 1;
                }
                else if (c[i] == 'W' || c[i] == 'X' || c[i] == 'Y' || c[i] == 'Z') {
                    time += 10;
                    continue;
                }
                time += (c[i] - 'A') / 3 + 3;
            }
        }
        System.out.println(time);
    }
}