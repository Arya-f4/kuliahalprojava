
import java.util.*;
import java.lang.Math;

class Program {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int etape1, etape2, etape3, point1, point2, point3, totalpoint;

    point1 = 0;
    point2 = 0;
    point3 = 0;
        System.out.println("Masukkan urutan Etape 1");
        etape1 = input.nextInt();
        System.out.println("Masukkan urutan Etape 2");
        etape2 = input.nextInt();
        System.out.println("Masukkan urutan Etape 3");
        etape3 = input.nextInt();
        if (etape1 == 1) {
            point1 = 100;
        }
        if (etape2 == 1) {
            point2 = 100;
        }
        if (etape3 == 1) {
            point3 = 100;
        }
        if (etape1 == 2) {
            point1 = 95;
        }
        if (etape2 == 2) {
            point2 = 95;
        }
        if (etape3 == 2) {
            point3 = 95;
        }
        if (etape1 == 3) {
            point1 = 90;
        }
        if (etape2 == 3) {
            point2 = 90;
        }
        if (etape3 == 3) {
            point3 = 90;
        }
        if (etape1 == 4) {
            point1 = 85;
        }
        if (etape2 == 4) {
            point2 = 85;
        }
        if (etape3 == 4) {
            point3 = 85;
        }
        if (etape1 == 5) {
            point1 = 80;
        }
        if (etape2 == 5) {
            point2 = 80;
        }
        if (etape3 == 5) {
            point3 = 80;
        }
        if (etape1 == 6) {
            point1 = 75;
        }
        if (etape2 == 6) {
            point2 = 75;
        }
        if (etape3 == 6) {
            point3 = 75;
        }
        if (etape1 == 7) {
            point1 = 70;
        }
        if (etape2 == 7) {
            point2 = 70;
        }
        if (etape3 == 7) {
            point3 = 70;
        }
        if (etape1 == 8) {
            point1 = 65;
        }
        if (etape2 == 8) {
            point2 = 65;
        }
        if (etape3 == 8) {
            point3 = 65;
        }
        if (etape1 == 9) {
            point1 = 60;
        }
        if (etape2 == 9) {
            point2 = 60;
        }
        if (etape3 == 9) {
            point3 = 60;
        }
        if (etape1 >= 10) {
            point1 = 50;
        }
        if (etape2 >= 10) {
            point2 = 50;
        }
        if (etape3 >= 10) {
            point3 = 50;
        }
        totalpoint = point1 + point2 + point3;
        System.out.print("Total Point Dari yang anda dapatkan adalah :  ");
        System.out.println(totalpoint);
    }
}
