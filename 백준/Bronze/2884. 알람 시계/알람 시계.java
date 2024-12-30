import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Clock clock = new Clock();
        int hour = scanner.nextInt();
        int minute = scanner.nextInt();
        clock.setting(hour, minute);
    }
}

class Clock {
    private int Hour;
    private int Minute;

    public void setting(int hour, int minute) {
        if (minute < 45) {
            if (hour == 0){
                Hour = 23;
            }
            else Hour = hour - 1;
            Minute = minute + 60 - 45;
        }
        else {
            Hour = hour;
            Minute = minute - 45;
        }
        System.out.println(Hour + " " + Minute);
    }
}