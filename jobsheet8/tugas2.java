package jobsheet8;

import java.util.Scanner;

public class tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Input n (Minimal 3, di soal dipakai n=3) dan n (angka, di soal dipakai n=5)
        // Kita simulasikan ukuran matriks 5x5, dengan n_angka=5 dan m_angka=3
        int N_SIZE = 5; // Ukuran matriks (5x5)
        int N_ANGKA = 5; // Angka di bingkai
        int M_ANGKA = 3; // Angka di tengah
        
        System.out.println("--- Tugas 2: Mencetak Pola Angka (n=" + M_ANGKA + ", n=" + N_ANGKA + ") ---");
        System.out.println("\n**Output Program :**");

        // Perulangan luar: mengontrol baris (i)
        for (int i = 1; i <= N_SIZE; i++) {
            String barisOutput = "";
            
            // Perulangan dalam: mengontrol kolom (j)
            for (int j = 1; j <= N_SIZE; j++) {
                
                // Logika pencetakan (menyesuaikan dengan contoh n=3, n=5):
                
                // 1. Bingkai (Baris 1, Baris N_SIZE, Kolom N_SIZE)
                // Angka 5 (N_ANGKA) dicetak di bingkai, kecuali kolom 1.
                if (i == 1 || i == N_SIZE || j == N_SIZE) {
                    barisOutput += N_ANGKA;
                } 
                // 2. Baris 2, 3, 4 (Baris selain 1 dan N_SIZE) dan Kolom 1-3
                // Angka 3 (M_ANGKA) dicetak di area kiri (kolom 1 sampai 3)
                else if (j >= 1 && j <= M_ANGKA) { // M_ANGKA = 3
                    barisOutput += M_ANGKA;
                } 
                // 3. Sisanya adalah spasi (Kolom 4, Baris 2-4)
                else {
                    barisOutput += " ";
                }
                
                barisOutput += " "; // Tambahkan spasi antar angka/karakter
            }
            System.out.println(barisOutput.trim());
        }
    }
}

