import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        int A = scanner1.nextInt();
        int B = scanner1.nextInt();
        int C = scanner1.nextInt();
        Cul cul = new Cul(A, B, C);
        cul.cul1(A, B, C);
        cul.cul2(A, B, C);
        cul.cul3(A, B, C);
        cul.cul4(A, B, C);
    }
}

class Cul {
    private int A;
    private int B;
    private int C;
    public Cul(int A, int B, int C) {
        this.A = A;
        this.B = B;
        this.C = C;
    }
    public void cul1(int A, int B, int C){
        System.out.println((A+B)%C);
    }
    public void cul2(int A, int B, int C){
        System.out.println(((A%C) + (B%C))%C);
    }
    public void cul3(int A, int B, int C){
        System.out.println((A*B)%C);
    }
    public void cul4(int A, int B, int C){
        System.out.println(((A%C) * (B%C))%C);
    }
}