import java.util.Scanner;

public class soal_nomor_4 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Masukkan jam <=24 :");
        int hours = input.nextInt();
         System.out.println("Masukkan menit <=60 :");
        int minutes = input.nextInt();
        System.out.println("Sudut antara jarum jam dan jarum menit: " + calculateAngle(hours, minutes) + " derajat");
    }

    static double calculateAngle(int h, int m) {
        if (h <0 || m < 0 || h >24 || m > 60) {
            System.out.println("Input tidak valid");
            return -1;
        }

        if (h == 24) {
            h = 0;
        }

        if (m == 60) {
            m = 0;
            h += 1;
            if(h>24) {
                h = h-24;
            }
        }

        double hour_angle = 0.5 * (h * 60 + m);
        double minute_angle = 6 * m;

        double angle = Math.abs(hour_angle - minute_angle);

        angle = Math.abs(Math.min(360 - angle, angle));

        return angle;
    }
}
