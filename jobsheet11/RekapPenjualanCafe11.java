
    import java.util.Scanner;

public class RekapPenjualanCafe11 {

    static Scanner sc = new Scanner(System.in);

    public static void inputNamaMenu(String[] menu) {
        System.out.println("\n=== Input Nama Menu ===");
        for (int i = 0; i < menu.length; i++) {
            System.out.print("Nama menu ke-" + (i + 1) + ": ");
            menu[i] = sc.nextLine();
        }
    }

    public static void inputData(int[][] penjualan, String[] menu) {
        System.out.println("\n=== Input Data Penjualan ===");

        for (int i = 0; i < penjualan.length; i++) {
            System.out.println("Menu: " + menu[i]);
            for (int j = 0; j < penjualan[i].length; j++) {
                System.out.print("  Hari ke-" + (j + 1) + " : ");
                penjualan[i][j] = sc.nextInt();
            }
        }
    }

    public static void tampilkanData(int[][] penjualan, String[] menu) {
        System.out.println("\n=== Tabel Penjualan ===");

        System.out.print("Menu/Hari\t");
        for (int i = 0; i < penjualan[0].length; i++) {
            System.out.print("H" + (i + 1) + "\t");
        }
        System.out.println();

        for (int i = 0; i < penjualan.length; i++) {
            System.out.print(menu[i] + "\t");
            for (int j = 0; j < penjualan[i].length; j++) {
                System.out.print(penjualan[i][j] + "\t");
            }
            System.out.println();
        }
    }
    public static void menuTertinggi(int[][] penjualan, String[] menu) {
        int maxTotal = -1;
        String menuTerbesar = "";

        for (int i = 0; i < penjualan.length; i++) {
            int total = 0;
            for (int j = 0; j < penjualan[i].length; j++) {
                total += penjualan[i][j];
            }

            if (total > maxTotal) {
                maxTotal = total;
                menuTerbesar = menu[i];
            }
        }

        System.out.println("\nMenu dengan total tertinggi: " + menuTerbesar +
                           " (" + maxTotal + ")");
    }

    public static void rataRata(int[][] penjualan, String[] menu) {
        System.out.println("\n=== Rata-rata Penjualan ===");

        for (int i = 0; i < penjualan.length; i++) {
            int total = 0;
            for (int j = 0; j < penjualan[i].length; j++) {
                total += penjualan[i][j];
            }
            double rata = (double) total / penjualan[i].length;

            System.out.println(menu[i] + " : " + rata);
        }
    }

    public static void main(String[] args) {

        System.out.print("Masukkan jumlah menu: ");
        int jumlahMenu = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Masukkan jumlah hari: ");
        int jumlahHari = sc.nextInt();

        String[] menu = new String[jumlahMenu];
        int[][] penjualan = new int[jumlahMenu][jumlahHari];

        sc.nextLine(); 
        inputNamaMenu(menu);

        inputData(penjualan, menu);
        tampilkanData(penjualan, menu);
        menuTertinggi(penjualan, menu);
        rataRata(penjualan, menu);
    }
}


