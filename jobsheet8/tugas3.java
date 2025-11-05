package jobsheet8;

import java.util.Scanner;

public class tugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       System.out.println("=== Program Laporan Penjualan Kopi Senja ===");

        // Input jumlah cabang
        System.out.print("Masukkan jumlah cabang: ");
        int jumlahCabang = sc.nextInt();

        int totalSemuaPelanggan = 0;
        int totalSemuaItem = 0;
        double totalSemuaPendapatan = 0;

        // Loop untuk setiap cabang
        for (int i = 1; i <= jumlahCabang; i++) {
            System.out.println("\nCabang " + i);
            System.out.print("Masukkan jumlah pelanggan hari ini: ");
            int jumlahPelanggan = sc.nextInt();

            int totalItemCabang = 0;
            double totalPendapatanCabang = 0;

            // Loop untuk setiap pelanggan di cabang ini
            for (int j = 1; j <= jumlahPelanggan; j++) {
                System.out.println("  Pelanggan ke-" + j);
                System.out.print("    Jumlah item yang dipesan: ");
                int item = sc.nextInt();
                System.out.print("    Harga per item: Rp ");
                double harga = sc.nextDouble();

                double totalHarga = item * harga;

                totalItemCabang += item;
                totalPendapatanCabang += totalHarga;
            }

            // Tampilkan hasil per cabang
            System.out.println("\n--- Ringkasan Cabang " + i + " ---");
            System.out.println("Total pelanggan       : " + jumlahPelanggan);
            System.out.println("Total item terjual    : " + totalItemCabang);
            System.out.println("Total pendapatan      : Rp " + totalPendapatanCabang);

            // Akumulasi total keseluruhan
            totalSemuaPelanggan += jumlahPelanggan;
            totalSemuaItem += totalItemCabang;
            totalSemuaPendapatan += totalPendapatanCabang;
        }

        // Ringkasan keseluruhan
        System.out.println("\n=== Ringkasan Penjualan Keseluruhan ===");
        System.out.println("Total seluruh pelanggan  : " + totalSemuaPelanggan);
        System.out.println("Total seluruh item       : " + totalSemuaItem);
        System.out.println("Total seluruh pendapatan : Rp " + totalSemuaPendapatan);

        sc.close();
    }
}