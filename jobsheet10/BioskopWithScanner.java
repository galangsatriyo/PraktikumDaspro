package jobsheet10;

import java.util.Scanner;

public class BioskopWithScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String [][] penonton = new String[4][2];

        while (true) {
            System.out.println("Masukan nama: ");
            String nama = sc.nextLine();
            System.out.println("Masukan baris: ");
            int baris = sc.nextInt();
            System.out.println("Masukan kolom: ");
            int kolom = sc.nextInt();
            sc.nextLine();

            penonton[baris-1][kolom-1] = nama;

            System.out.println("Input penonoton lainya (Y/N): ");
            String next = sc.nextLine();

            if (next.equalsIgnoreCase("N")) {
                break;
            }
        }
    }
}
