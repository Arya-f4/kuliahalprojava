
import java.util.*;
import java.lang.Math;

class Program {
  private static Scanner input = new Scanner(System.in);

  public static void main(String[] args) {
    int tanggal, tahun, i, n;
    String bulan;
    int[] digit = new int[8];

    System.out.println("Masukkan Tanggal : ");
    tanggal = input.nextInt();
    digit[0] = (int) ((double) tanggal / 10);
    digit[1] = tanggal % 10;
    System.out.println("Masukkan Bulan :");
    bulan = input.next();
    if (bulan.equals("januari")) {
      digit[0] = 0;
      digit[1] = 1;
    } else {
      if (bulan.equals("februari")) {
        digit[0] = 0;
        digit[1] = 2;
      } else {
        if (bulan.equals("Maret")) {
          digit[0] = 0;
          digit[1] = 3;
        } else {
          if (bulan.equals("April")) {
            digit[0] = 0;
            digit[1] = 4;
          } else {
            if (bulan.equals("Mei")) {
              digit[0] = 0;
              digit[1] = 5;
            } else {
              if (bulan.equals("Juni")) {
                digit[0] = 0;
                digit[1] = 6;
              } else {
                if (bulan.equals("Juli")) {
                  digit[0] = 0;
                  digit[1] = 7;
                } else {
                  if (bulan.equals("Agustus")) {
                    digit[0] = 0;
                    digit[1] = 8;
                  } else {
                    if (bulan.equals("September")) {
                      digit[0] = 0;
                      digit[1] = 9;
                    } else {
                      if (bulan.equals("Oktober")) {
                        digit[0] = 1;
                        digit[1] = 0;
                      } else {
                        if (bulan.equals("November")) {
                          digit[0] = 1;
                          digit[1] = 1;
                        } else {
                          if (bulan.equals("Desember")) {
                            digit[0] = 1;
                            digit[1] = 2;
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    System.out.println("Masukkan Tahun :");
    tahun = input.nextInt();
    for (i = 7; i >= 4; i--) {
      digit[i] = tahun % 10;
      tahun = (int) ((double) tahun / 10);
    }
    if (digit[7] == digit[0] && digit[6] == digit[1] && digit[5] == digit[2] && digit[4] == digit[3]
        && digit[3] == digit[4]) {
      System.out.println("Adalah Polindrome");
    } else {
      System.out.println("Bukan Polindrome");
    }
  }
}
