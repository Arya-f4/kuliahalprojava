
import java.util.*;
import java.lang.Math;

class soal_nomor_2 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int jarak, hargajarak, sisajarak, waktu, hargawaktu, sisawaktu, waktuharus, optioncuaca, cuaca, harga, hargatotal, potongancuaca;
        cuaca = 0;
        hargawaktu = 0;
        potongancuaca = 0;
        hargatotal = 0;
        System.out.print("Masukkan Jarak : ");
        jarak = input.nextInt();
        System.out.println();
        System.out.println("Masukkan Waktu : ");
        waktu = input.nextInt();
        System.out.println("Masukkan Cuaca");
        System.out.println("1. Cerah");
        System.out.println("2. Hujan");
        optioncuaca = input.nextInt();
        if (optioncuaca == 1) {
            cuaca = 1;
            System.out.println("Cerah Telah terpilih");
        }
        if (optioncuaca == 2) {
            cuaca = 2;
            System.out.println("Hujan Telah terpilih");
        }
        if (jarak <= 3) {
            harga = 10000;
            if (waktu >= 3) {
                waktuharus = jarak * 2;
                sisawaktu = waktu - waktuharus;
                hargawaktu = sisawaktu * 1000;
            }
            if (waktu < 3) {
                hargawaktu = 0;
            }
            if (cuaca == 2) {
                System.out.println("Harga telah dinaikkan dikarenakan Hujan sebanyak 15% ");
                potongancuaca = (int) ((hargawaktu + harga) * 0.15);
            }
            if (cuaca == 1) {
                System.out.println("Cuaca cerah, tidak ada harga yang ditambahkan");
                potongancuaca = 0;
            }
            hargatotal = harga + hargawaktu + potongancuaca;
        }
        if (jarak > 3) {
            sisajarak = jarak - 3;
            hargajarak = sisajarak * 2000 + 10000;
            if (waktu >= 3) {
                waktuharus = jarak * 2;
                sisawaktu = waktu - waktuharus;
                hargawaktu = sisawaktu * 1000;
            }
            if (waktu < 3) {
                hargawaktu = 0;
            }
            if (cuaca == 2) {
                System.out.println("Harga telah dinaikkan dikarenakan Hujan sebanyak 15% ");
                potongancuaca = (int) ((hargawaktu + hargajarak) * 0.15);
            }
            if (cuaca == 1) {
                System.out.println("Cuaca cerah, tidak ada harga yang ditambahkan");
                potongancuaca = 0;
            }
            hargatotal = hargajarak + hargawaktu + potongancuaca;
        }
        System.out.print("Anda mendapat karena hujan Tambahan Harga sebanyak :");
        System.out.println(potongancuaca);
        System.out.print("Total Harga yang anda harus bayar adalah : ");
        System.out.print(hargatotal);
        System.out.println(" Rupiah");
    }
}
