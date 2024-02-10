
import java.util.*;

public class alpro2_nomor_3 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        double hargabeli, hargajual, ongkos, persen, persenuntung, keuntungan;

        System.out.print("masukkan harga beli yang anda inginkan, jika harga beli perliternya 30.000 : ");
        hargabeli = input.nextDouble();
        System.out.print("masukkan presentase ongkos yang diinginkan : ");
        persen = input.nextDouble();
        System.out.print("masukkan keuntungan yang diinginkan : ");
        keuntungan = input.nextDouble();
        ongkos = hargabeli * persen / 100;
        hargajual = hargabeli + ongkos + keuntungan;
        persenuntung = (hargajual - hargabeli) / 100;
        System.out.print("berikut adalah presentase keuntungannya ");
        System.out.print(persenuntung);
        System.out.println("%");
    }
}
