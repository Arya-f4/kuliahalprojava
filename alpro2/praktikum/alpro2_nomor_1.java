public class alpro2_nomor_1 {
    public static void main(String[] args) {
        double totalWarisanIbuDanAnak = 6;  // dalam milyar
        double bagianIbu = 1.0 / 6;
        double bagianAnak = 1.0 / 3;

        // Jumlah warisan ibu dan satu anak adalah jumlah dari 1/6 dan 1/3 dari total harta
        double totalHarta = totalWarisanIbuDanAnak / (bagianIbu + bagianAnak);

        System.out.println("Jumlah seluruh harta warisan: " + totalHarta + " milyar");
    }
}
