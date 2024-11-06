import java.util.Scanner;
public class BioskopWithScanner12 {
    public static void main(String[] args) {
        
        Scanner sc12 = new Scanner (System.in);
        
        String [][] penonton = new String [4][2];
        int baris, kolom;
        String nama, next;
        while (true) {
            System.out.println("Masukkan nama: ");
            nama = sc12.nextLine();
            System.out.println("Masukkan baris: ");
            baris = sc12.nextInt();
            System.out.println("Masukkan kolom: ");
            kolom = sc12.nextInt();
            sc12.nextLine();
            
            penonton[baris-1][kolom-1] = nama;

            System.out.println("Input penonton lainnya? (y/n): ");
            next = sc12.nextLine();

            if (next.equalsIgnoreCase("n")) {
                break;
            }

        }
    }

}
