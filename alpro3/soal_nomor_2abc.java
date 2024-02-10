import java.util.*;
import java.lang.Math;

public class soal_nomor_2 {
    private static Scanner input = new Scanner(System.in);


  public static void main(String[] args) {
    int n = input.nextInt();
    List<Integer> ganjilDigit = new ArrayList<>();
    while (n > 0) {
      int digit = n%10;
      if (digit%2 ==0) {
        ganjilDigit.add(digit);
        
      }
      n /= 10;
      
    }
    System.out.println("A."+ganjilDigit.size());
    System.out.print("B. ");
    for (int i = 0; i< ganjilDigit.size();i++){
      if (i > 0) {
        System.out.print(", ");
        
      }
      System.out.print(ganjilDigit.get(i));
    }
    System.out.println();
    System.out.print("C. ");
    for (int i = ganjilDigit.size()-1; i >= 0; i--) {
      System.out.print(ganjilDigit.get(i));
      
    }
    System.out.println();
    
  }
}
