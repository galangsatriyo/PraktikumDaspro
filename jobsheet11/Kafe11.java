import java.util.Scanner;

public class Kafe11 {

    public static void menu(String namaPelanggan, boolean isMember, String kodePromo) {
        System.out.println("Selamat Datang, " + namaPelanggan + "!");

        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }

        if (kodePromo.equals("DISKON50")) {
            System.out.println("Kode Promo: DISKON50 (Diskon 50%)");
        } else if (kodePromo.equals("DISKON30")) {
            System.out.println("Kode Promo: DISKON30 (Diskon 30%)");
        } else {
            System.out.println("Kode Promo tidak valid.");
        }

        System.out.println("\n==== MENU RESTO KAFE ====");
        System.out.println("1. Kopi Hitam    - Rp 15,000");
        System.out.println("2. Cappuccino    - Rp 20,000");
        System.out.println("3. Latte         - Rp 22,000");
        System.out.println("4. Teh Tarik     - Rp 12,000");
        System.out.println("5. Roti Bakar    - Rp 10,000");
        System.out.println("6. Mie Goreng    - Rp 18,000");
        System.out.println("==========================");
        System.out.println("Silahkan pilih menu yang anda inginkan.\n");
    }

    public static int hitungTotalHarga(int pilihanMenu, int banyakItem, String kodePromo) {

        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};

        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;

        if (kodePromo.equals("DISKON50")) {
            System.out.println("Diskon 50% diterapkan.");
            hargaTotal = hargaTotal / 2;
        } else if (kodePromo.equals("DISKON30")) {
            System.out.println("Diskon 30% diterapkan.");
            hargaTotal = hargaTotal - (hargaTotal * 30 / 100);
        } else {
            System.out.println("Kode promo invalid, tidak ada diskon.");
        }

        return hargaTotal;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nama pelanggan: ");
        String nama = sc.nextLine();

        System.out.print("Apakah Anda member? (true/false): ");
        boolean isMember = sc.nextBoolean();

        sc.nextLine(); 

        System.out.print("Masukkan kode promo (DISKON50/DISKON30 atau lainnya): ");
        String kodePromo = sc.nextLine();

        menu(nama, isMember, kodePromo);


        System.out.print("Berapa jenis menu yang ingin dipesan? ");
        int jumlahJenis = sc.nextInt();

        int totalKeseluruhan = 0;

        for (int i = 1; i <= jumlahJenis; i++) {
            System.out.println("\n=== Pesanan ke-" + i + " ===");
            System.out.print("Masukkan nomor menu: ");
            int nomorMenu = sc.nextInt();

            System.out.print("Masukkan jumlah item: ");
            int jumlahItem = sc.nextInt();

            int subtotal = hitungTotalHarga(nomorMenu, jumlahItem, kodePromo);
            totalKeseluruhan += subtotal;

            System.out.println("Subtotal pesanan ke-" + i + ": Rp " + subtotal);
        }
        System.out.println("\n===============================");
        System.out.println("TOTAL KESELURUHAN PESANAN: Rp " + totalKeseluruhan);
        System.out.println("Terima kasih telah berbelanja.");
    }
}

