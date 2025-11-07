import java.util.Scanner;

public class tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah pesanan: ");
        int jumlah = input.nextInt();  
        input.nextLine(); 

        String[] namaPesanan = new String[jumlah]; 
        double[] hargaPesanan = new double[jumlah]; 

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nPesanan ke-" + (i + 1));
            System.out.print("Masukkan nama makanan/minuman: ");
            namaPesanan[i] = input.nextLine();
            System.out.print("Masukkan harga: ");
            hargaPesanan[i] = input.nextDouble();
            input.nextLine(); 
        }
        double total = 0;
        for (int i = 0; i < jumlah; i++) {
            total += hargaPesanan[i];
        }

        System.out.println("\n=== DAFTAR PESANAN KAFE ===");
        for (int i = 0; i < jumlah; i++) {
            System.out.println((i + 1) + ". " + namaPesanan[i] + " - Rp " + hargaPesanan[i]);
        }

        System.out.println("------------------------------");
        System.out.println("Total biaya: Rp " + (int) total);
    }
}

