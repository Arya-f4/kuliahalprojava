
import java.util.*;
import java.lang.Math;

class Program {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double tinggi, alas, volumetp, permukaantp, radiusx, tinggiy, n;

        System.out.println("Data yang telah diketahui adalah tinggi kerucut = 10");
        System.out.println("Masukkan Radius Alas yang akan menjadi variabel X");
        radiusx = input.nextDouble();
        System.out.println("Masukkan Titik Potong yang akan memotong Titik puncak, yang dimana akan menjadi Y(jangan lebih dari 10)");
        tinggiy = input.nextDouble();
        if (tinggiy > 10) {
            System.out.println("Terlalu tinggi daripada tinggi kerucut");
            // Close
        }
        System.out.println("Hasil dari volume kerucut tersebut setelah dipotong titik Y adalah:");
        tinggi = 10 - tinggiy;
        n = Math.pow(radiusx, (double) 2) + Math.pow(tinggi, (double) 2);
        volumetp = (double) 1 / 3 * 22 / 7 * Math.pow(radiusx, (double) 2) * tinggi;
        permukaantp = (double) 22 / 7 * radiusx * (radiusx + Math.sqrt(n));
        System.out.println("Hasil dari volume kerucut yang terpotong adalah : ");
        System.out.println(volumetp);
        System.out.println("Hasil dari Luas Permukaan kerucut yang terpotong adalah:");
        System.out.println(permukaantp);
    }
}
