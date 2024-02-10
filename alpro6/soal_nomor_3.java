
import java.util.*;

class Program {
  private static Scanner input = new Scanner(System.in);

  public static void main(String[] args) {
    int[] dAFTAR = new int[20];
    int i, panjangTerpanjang, panjangSekarang, indeksTerpanjang, indeksSekarang;

    panjangTerpanjang = 0;
    panjangSekarang = 1;
    indeksTerpanjang = 0;
    indeksSekarang = 0;
    for (i = 0; i <= 19; i++) {
      dAFTAR[i] = input.nextInt();
    }
    for (i = 1; i <= 19; i++) {
      if (dAFTAR[i] > dAFTAR[i - 1]) {
        panjangSekarang = panjangSekarang + 1;
      } else {
        if (panjangSekarang > panjangTerpanjang) {
          panjangTerpanjang = panjangSekarang;
          indeksTerpanjang = indeksSekarang;
        }
        panjangSekarang = 1;
        indeksSekarang = i;
      }
    }
    for (i = indeksTerpanjang; i <= indeksTerpanjang + panjangTerpanjang - 1; i++) {
      System.out.print(dAFTAR[i]);
      System.out.print(" ");
    }
    System.out.print("(");
    System.out.print(panjangTerpanjang);
    System.out.println(")");
  }
}
