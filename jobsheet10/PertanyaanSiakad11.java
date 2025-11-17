package jobsheet10;

import java.util.Scanner;

public class PertanyaanSiakad11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah siswa: ");
        int jumlahSiswa = sc.nextInt();
        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMatkul = sc.nextInt();
        System.out.println("\n==================================");
        int[][] nilai = new int[jumlahSiswa][jumlahMatkul];
        
        System.out.println("Input nilai per siswa:");
        for (int i = 0; i < nilai.length; i++) { // i < jumlahSiswa
            System.out.println("\nInput nilai mahasiswa ke-" + (i + 1));
            double totalPerSiswa = 0;

            for (int j = 0; j < nilai[i].length; j++) { // j < jumlahMatkul
                System.out.print("  Nilai mata kuliah " + (j + 1) + ": ");
                nilai[i][j] = sc.nextInt();
                totalPerSiswa += nilai[i][j];
            }
            double rataRataPerSiswa = totalPerSiswa / jumlahMatkul;
            System.out.println("  Nilai rata-rata mahasiswa: " + rataRataPerSiswa);
        }

        System.out.println("\n==================================");
        System.out.println("Rata - rata nilai setiap mata kuliah:");
    
        for (int j = 0; j < jumlahMatkul; j++) { 
            double totalPerMatkul = 0;

            for (int i = 0; i < jumlahSiswa; i++) { 
                totalPerMatkul += nilai[i][j];
            }
            double rataRataMatkul = totalPerMatkul / jumlahSiswa;
            System.out.println("Mata kuliah " + (j + 1) + ": " + rataRataMatkul);
        }
        sc.close();
        System.out.println("==================================");
    }
}
    
