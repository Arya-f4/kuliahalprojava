import java.util.Scanner;
import java.lang.Math;

class soal_nomor_1 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int option;

        System.out.println("pilih salah satu konversi dibawah ini: ");
        System.out.println("1 Celcius ke fahrenheit dan  reamur");
        System.out.println("2 Fahrenheit ke celcius dan  reamur");
        System.out.println("3 Reamur ke celcius dan fahrenheit");
        option = input.nextInt();
        switch (option) {
            case 1:
                
            celciustofahrenheittoreamur();
                break;
            case 2:

            fahrenheittocelciustoreamur();
                break;
            case 3:

            reamurtocelciustofahrenheit();
                break;
        
            default:
            System.out.println("dahlah");
                break;
            
        }
           }
    
    public static void celciustofahrenheittoreamur() {
        System.out.println("masukkan Celcius dalam  bentuk angka untuk di konversi ke Fahrenheit, dan Reamur");
        double celcius, reamur, fahrenheit;

        celcius = input.nextDouble();
        fahrenheit = celcius * 9 / 5 + 32;
        reamur = celcius * 0.8;
        System.out.println("Hasil dari konversi celcius ke fahrenheit adalah");
        System.out.println(fahrenheit);
        System.out.println("Hasil dari konversi celcius ke reamur adalah");
        System.out.println(reamur);
    }
    
    public static void fahrenheittocelciustoreamur() {
        System.out.println("masukkan fahrenheit dalam  bentuk angka untuk di konversi ke celcius ,dan reamur");
        double celcius, reamur, fahrenheit;

        fahrenheit = input.nextDouble();
        reamur = (fahrenheit - 32) / 2.25;
        celcius = (double) 5 / 9 * (fahrenheit - 32);
        System.out.println("Hasil konversi Fahrenheit ke Celcius adalah");
        System.out.println(celcius);
        System.out.println("Hasil konversi dari fahrenheit ke reamur adalah");
        System.out.println(reamur);
    }
    
    public static void reamurtocelciustofahrenheit() {
        System.out.println("masukkan reamur dalam  bentuk angka untuk di konversi ke celcius ,dan fahrenheit");
        double celcius, reamur, fahrenheit;

        reamur = input.nextDouble();
        fahrenheit = reamur * 9 / 4 + 32;
        celcius = reamur * 5 / 4;
        System.out.println("Hasil konversi Reamur ke Celcius adalah");
        System.out.println(celcius);
        System.out.println("Hasil konversi dari reamur ke fahrenheit adalah");
        System.out.println(fahrenheit);
    }
}

