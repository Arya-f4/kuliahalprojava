import java.util.*;

class soal_nomor_2 {
    private static Scanner input = new Scanner(System.in);

  public static void main(String[] args) {
        double x;
        int bin;
    System.out.println("Masukkan angka yang ingin dikonversikan menjadi Binary :");

        x = input.nextDouble();
        bin = convertBin((int) x);
    }
    
    public static int convertBin(int n) {
        int binary;

        if (n == 0) {
            binary = 0;
        } else {
            if (n % 2 == 0) {
                binary = 1;
                binary = convertBin((int) ((double) n / 2));
                System.out.print(0);
            } else {
                binary = 0;
                binary = convertBin((int) ((double) n / 2));
                System.out.print(1);
            }
        }
        
        return binary;
    }
}

