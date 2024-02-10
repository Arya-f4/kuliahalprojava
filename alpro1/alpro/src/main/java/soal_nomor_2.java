
import java.util.*;
import java.lang.Math;

class Program {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int n, a, b, c, d, e;

        System.out.println("Masukkan angka yang anda inginkan yang dimana terdiri dari 4 digit");
        n = input.nextInt();
        a = (int) ((double) n / 1000);
        b = (int) ((double) (n % 1000) / 100);
        c = (int) ((double) (n % 100) / 10);
        d = n % 10;
        e = a + b + c + d;
        System.out.println("Output hasil dari modulus 4 bilangan tersebut adalah");
        System.out.println(e);
    }
}
