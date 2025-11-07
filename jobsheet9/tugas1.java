
import java.util.Scanner;

public class tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = input.nextInt();  

        int[] nilai = new int[jumlah]; 

       
        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = input.nextInt();
        }

      
        int total = 0;
        int tertinggi = nilai[0];
        int terendah = nilai[0];

      
        for (int i = 0; i < jumlah; i++) {
            total += nilai[i]; 

            if (nilai[i] > tertinggi) {
                tertinggi = nilai[i];
            }
            if (nilai[i] < terendah) {
                terendah = nilai[i]; 
            }
        }

        double rataRata = (double) total / jumlah; 

       
        System.out.println("\n=== HASIL ===");
        System.out.println("Daftar nilai mahasiswa:");
        for (int i = 0; i < jumlah; i++) {
            System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilai[i]);
        }

        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah : " + terendah);
        System.out.println("Nilai rata-rata: " + rataRata);
    }
}