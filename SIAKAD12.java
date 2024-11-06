import java.util.Scanner;

public class SIAKAD12 {
    public static void main(String[] args) {
        Scanner sc12 = new Scanner(System.in);

        System.out.print("Masukkan jumlah siswa: ");
        int jumlahSiswa = sc12.nextInt();
        
        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMataKuliah = sc12.nextInt();

        int[][] nilai = new int[jumlahSiswa][jumlahMataKuliah];
   
        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.println("\nInput nilai mahasiswa ke-" + (i + 1));
            double totalPerSiswa = 0;

            for (int j = 0; j < jumlahMataKuliah; j++) {
                System.out.print("Nilai mata kuliah " + (j + 1) + ": ");
                nilai[i][j] = sc12.nextInt();
                totalPerSiswa += nilai[i][j];
            }

            System.out.println("Nilai rata-rata mahasiswa ke-" + (i + 1) + ": " + totalPerSiswa / jumlahMataKuliah);
        }

        System.out.println("\n=============================");
        System.out.println("Rata-rata Nilai setiap mata kuliah:");

       
        for (int j = 0; j < jumlahMataKuliah; j++) {
            double totalPerMatkul = 0;
            for (int i = 0; i < jumlahSiswa; i++) {
                totalPerMatkul += nilai[i][j];
            }

            System.out.println("Mata kuliah " + (j + 1) + ": " + totalPerMatkul / jumlahSiswa);
        }

         }
}
