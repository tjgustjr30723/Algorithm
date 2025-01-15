import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Study study = new Study();
        study.input();
        study.cul();
    }
}
class Study {
    private String[] str = new String[20];

    public void input() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 20; i++) {
            str[i] = sc.nextLine();
        }
    }
    public void cul() {
        double finalScore = 0;
        double sum = 0;
        for (int i = 0; i < 20; i++) {
            String[] s = str[i].split(" ");
            if (s[2].equals("P")){
                continue;
            }
            double score = Double.parseDouble(s[1]);
            if (s[2].equals("A+")) {
                finalScore += score * 4.5;
            }
            else if (s[2].equals("A0")) {
                finalScore += score * 4.0;
            }
            else if (s[2].equals("B+")) {
                finalScore += score * 3.5;
            }
            else if (s[2].equals("B0")) {
                finalScore += score * 3.0;
            }
            else if (s[2].equals("C+")) {
                finalScore += score * 2.5;
            }
            else if (s[2].equals("C0")) {
                finalScore += score * 2.0;
            }
            else if (s[2].equals("D+")) {
                finalScore += score * 1.5;
            }
            else if (s[2].equals("D0")) {
                finalScore += score;
            }
            else if (s[2].equals("F")) {
                finalScore += 0;
            }
            sum += score;
        }
        System.out.println(finalScore / sum);
    }
}