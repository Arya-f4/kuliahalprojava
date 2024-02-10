import java.util.*;
import java.lang.Math;
public class soal_nomor_1 {

    private static Scanner input = new Scanner(System.in);
  public static void main(String[] args) {
    double x1,x2,y1,y2,d,r1,r2;

System.out.println("Masukkan Pusat lingkaran 1 yaitu X1 :");
    x1 = input.nextDouble();
System.out.println("Masukkan titik luar lingkaran 1 yaitu Y1:");
    y1 = input.nextDouble();
    System.out.println("Masukkan Rusuk Lingkaran 1 yaitu R1:");
    r1 = input.nextDouble();

System.out.println("Masukkan Pusat lingkaran 2 yaitu X2 :");
    x2 = input.nextDouble();
    System.out.println("Masukkan titik luar lingkaran 2 yaitu Y2 :");
    y2 = input.nextDouble();
    System.out.println("Masukkan Rusuk lingkaran 2 Yaitu R2:");
    r2 = input.nextDouble();

    d = Math.sqrt(Math.pow(x2-x1, (double) 2)+Math.pow(y2-y1,(double)2));
    System.out.println(d);
    if (d>r1+r2) {
      System.out.println("Lingkaran tersebut dalam p1 atau saling lepas luar");
      
    }
    else if (d==r1+r2) {
      System.out.println("Lingkaran tersebut saling bersinggungan di luar P2");
      
    }
    else if (d<r1+r2 && d>r1-r2){
      System.out.println("Kedua lingkaran saling berpotongan atau P3");
    }
    else if (d == r1-r2){
      System.out.println("Kedua Lingkaran bersinggungan didalam atau P4");
    }
    else if(d<r1-r2){
      System.out.println("Kedua Lingkaran saling lepas di dalam");
    }



  }
}
