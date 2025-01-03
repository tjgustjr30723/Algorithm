import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int minute = sc.nextInt();
        int time = sc.nextInt();
        cook(hour, minute, time);
    }
    public static void cook(int hour, int minute, int time) {
        hour = (hour + ((minute + time) / 60)) % 24;
        minute = ((minute + time) % 60);
        System.out.println(hour + " " + minute);
    }
}