import java.util.Scanner;
public class BioskopWithScanner06 {
   public static void main(String[]Args){
    Scanner input06 = new Scanner(System.in);

    int baris, kolom;
    String nama, next;

    String[][] penonton = new String[4][2];

    while (true) {
        System.out.println("Menu : ");
        System.out.println("Input data penonton ");
        System.out.println("Tampilkan daftar penonton");
        System.out.println("Exit");
        System.out.print("Pilih menu (1/2/3) : ");
        int menu = input06.nextInt();
        
        switch (menu) {
            case 1:
            System.out.print("Masukkan nama : ");
            nama = input06.next();
            do {
            System.out.print("Masukkan baris : ");
            baris = input06.nextInt();
            System.out.print("Masukkan kolom : ");
            kolom = input06.nextInt();
            input06.nextLine();
               
            if (isValidSeat(baris, kolom, penonton)){
                penonton[baris - 1][kolom - 1] = nama;
                System.out.println("Data penonton telah dimasukkan.");
            break;
                }else {
                System.out.println("Kursi telah terisi. Silahkan pilih kursi lain.");
                }    

            }while (true);
            break;
    
            case 2 :
            System.out.println("Daftar Penonton : ");
            for (int i = 0; i < 4; i++){
                for(int j = 0; j < 2; j++){
                    if (penonton[i][j] != null){
                    System.out.println("Baris " + (i+1) + ", Kolom " + (j+1) + ": " + penonton[i][j]);
                    }else {
                    System.out.println("Baris " + (i+1) + ", Kolom" + (j+1) + ": ***");
                    }
                }
            }
            break;

            case 3 :
            System.out.println("Terima kasih, program telah selesai.");
            System.exit(0);
            default :
            System.out.println("Menu tidak valid. Silahkan pilih 1, 2, atau 3.");
            break;
            }
        }
    }

    static boolean isValidSeat(int baris, int kolom, String[][] penonton){
    if (baris >= 1 && baris <= 4 && kolom >= 1 && kolom <=2){
        if (penonton[baris - 1][kolom - 1] == null){
            return true;
            }
        }
    return false;
}
}


    

