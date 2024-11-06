import java.util.Scanner;

public class BioskopWithScanner12 {
    public static void main(String[] args) {
        
        Scanner sc12 = new Scanner(System.in);
        
        String[][] penonton = new String[4][2];
        int baris, kolom;
        String nama, next;
        int pilihan;

        while (true) {
            // Menampilkan menu
            System.out.println("\nMenu:");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            pilihan = sc12.nextInt();
            sc12.nextLine(); 

        
            if (pilihan == 1) {
               
                while (true) {
                    System.out.print("Masukkan nama: ");
                    nama = sc12.nextLine();

                    System.out.print("Masukkan baris (1-4): ");
                    baris = sc12.nextInt();

                    System.out.print("Masukkan kolom (1-2): ");
                    kolom = sc12.nextInt();
                    sc12.nextLine(); 

                    if (baris < 1 || baris > 4 || kolom < 1 || kolom > 2) {
                        System.out.println("Input tidak valid! Masukkan baris antara 1-4 dan kolom antara 1-2.");
                    } else if (penonton[baris - 1][kolom - 1] != null) {
                        System.out.println("Kursi sudah terisi! Silakan pilih kursi lain.");
                    } else {
                       
                        penonton[baris - 1][kolom - 1] = nama;
                        System.out.println("Data penonton berhasil disimpan.");
                        break; 
                    }
                }
            }
         
            else if (pilihan == 2) {
                System.out.println("Daftar penonton:");
                for (int i = 0; i < penonton.length; i++) {
                    for (int j = 0; j < penonton[i].length; j++) {
                        if (penonton[i][j] != null) {
                            System.out.println("Baris " + (i + 1) + ", Kolom " + (j + 1) + ": " + penonton[i][j]);
                        } else {
                            System.out.println("Baris " + (i + 1) + ", Kolom " + (j + 1) + ": ***");
                        }
                    }
                }
            }
            
            else if (pilihan == 3) {
                System.out.println("Program selesai.");
                
                break;
            }
         
            else {
                System.out.println("Pilihan tidak valid. Silakan pilih menu 1, 2, atau 3.");
            }
        }
    }
}
