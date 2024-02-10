import java.util.*;
import java.lang.Math;

class soal_nomor_3 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double a, b, c, d, e, be, ce, de, x1, x2, y1, y2, x, y;

        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();
        d = input.nextDouble();
        e = input.nextDouble();
        be = b - d;
        ce = c - e;
        de = be * be - 4 * a * ce;
        if (d > 0) {
            x1 = (-be + Math.sqrt(de)) / (2 * a);
            x2 = (-be - Math.sqrt(de)) / (2 * a);
            y1 = a * (x1 * x1) + b * x1 + c;
            y2 = a * (x2 * x2) + b * x2 + c;
            System.out.print(x1);
            System.out.print(" ,");
            System.out.print(y1);
            System.out.print("|");
            System.out.print(x2);
            System.out.print(" ,");
            System.out.print(y2);
            System.out.println("Hasil Terpotong dua titik");
        }
        if (de == 0) {
            x = -be / (2 * a);
            y = a * (x * x) + b * x + c;
            System.out.print(x);
            System.out.print(" ,");
            System.out.print(y);
            System.out.println("Hasil Garis Menyinggung");
        }
        if (de < 0) {
            System.out.println("Saling lepas");
        }
    }
}
