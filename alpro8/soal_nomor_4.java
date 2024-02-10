
import java.util.*;
import java.lang.Math;

class Program {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int i, n, direction, rotation;

        System.out.println("Masukkan jumlah nilai array yang anda inginkan");
        n = input.nextInt();
        int[] arr = new int[n];

        for (i = 0; i <= n - 1; i++) {
            System.out.print("Inputkan nilai array ke-" + (i + 1) + " : ");
            arr[i] = input.nextInt();
        }
    System.out.println("Masukkan jumlah rotasi : ");
        rotation = input.nextInt();

    System.out.println("Masukkan jumlah arah rotasi : ");
        direction = input.nextInt();
        System.out.print("[ ");
        for (i = 0; i <= n - 1; i++) {
            System.out.print(arr[i]);
            System.out.print(" ");
        }
        System.out.println("]");
        rotate(arr, n, rotation, direction);
        System.out.print("Array setelah rotasi : ");
        System.out.print("[ ");
        for (i = 0; i <= n - 1; i++) {
            System.out.print(arr[i]);
            System.out.print(" ");
        }
        System.out.println("]");
    }
    
    public static void rotate(int[] arr, int n, int rotation, int direction) {
        int r, temp, i;

        for (r = 1; r <= rotation; r++) {
            if (direction == 1) {
                temp = arr[n - 1];
                for (i = n - 1; i >= 1; i--) {
                    arr[i] = arr[i - 1];
                }
                arr[0] = temp;
            } else {
                temp = arr[0];
                for (i = 0; i <= n - 2; i++) {
                    arr[i] = arr[i + 1];
                }
                arr[n - 1] = temp;
            }
        }
    }
}
