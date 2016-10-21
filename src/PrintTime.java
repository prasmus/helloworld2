/**
 * Created by opilane on 21.10.2016.
 */
public class PrintTime {

    public static void printTime(int hour, int minute) {
        System.out.print(hour);
        System.out.print(":");
        System.out.println(minute);

    }

    public static void printTime() {
        int hour = 11;
        int minute = 59;
        printTime(hour, minute);
    }
}
