import java.util.Scanner;
public class BioskopWithScanner06 {
   public static void main(String[]Args){
    Scanner input06 = new Scanner(System.in);

    int baris, kolom;
    String nama, next;

    String[][] penonton = new String[4][2];

    while (true){
        System.out.print("Masukkan nama :");
        nama = input06.nextLine();
        System.out.println("Masukkan baris :");
        baris = input06.nextInt();
        System.out.print("Masukkan kolom ;");
        kolom = input06.nextInt();
        input06.nextLine();

        penonton[baris-1][kolom-1] = nama;
        System.out.print("Input Penonton Lainnya? (y/n) : ");
        next = input06.nextLine();

        if (next.equalsIgnoreCase("n")) {break;
        }
    }
   } 
}
