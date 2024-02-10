
import java.util.*;
import java.lang.Math;

class Program {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double panjang, lebar, tinggi, volume, permukaan;

        System.out.println("Masukkan Panjang untuk menghitung balok");
        panjang = input.nextDouble();
        System.out.println("Masukkan Lebar untuk menghitung balok");
        lebar = input.nextDouble();
        System.out.println("Masukkan Tinggi untuk menghitung balok");
        tinggi = input.nextDouble();
        volume = panjang * lebar * tinggi;
        permukaan = panjang * lebar * 2 + panjang * tinggi * 2 + lebar * tinggi * 2;
        System.out.println("Jumlah Volume Hasil dari perhitungan balok tersebut adalah :");
        System.out.println(volume);
        System.out.println("Hasil dari perhitungan seluruh permukaan balok tersebut adalah:");
        System.out.println(permukaan);
    }
}
