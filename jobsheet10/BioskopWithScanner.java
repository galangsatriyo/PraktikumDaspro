package jobsheet10;

import java.util.Scanner;

public class BioskopWithScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       String[][] penonton = new String[4][2];
        int pilihan;

        while (true) {
            System.out.println("\n===== MENU BIOSKOP =====");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine(); 

            if (pilihan == 1) {
                while (true) {
                    System.out.print("Masukkan nama: ");
                    String nama = sc.nextLine();

                    int baris, kolom;

                    while (true) {
                        System.out.print("Masukkan baris (1-4): ");
                        baris = sc.nextInt();
                        System.out.print("Masukkan kolom (1-2): ");
                        kolom = sc.nextInt();
                        sc.nextLine();

                        // CEK INDEKS
                        if (baris < 1 || baris > 4 || kolom < 1 || kolom > 2) {
                            System.out.println(">> Kursi tidak tersedia! Coba lagi.");
                        }
                        // CEK KURSI TERISI
                        else if (penonton[baris - 1][kolom - 1] != null) {
                            System.out.println(">> Kursi sudah terisi! Pilih kursi lain.");
                        } else {
                            break;
                        }
                    }

                    penonton[baris - 1][kolom - 1] = nama;
                    System.out.println(">> Kursi berhasil diisi!");

                    System.out.print("Input penonton lain? (Y/N): ");
                    String next = sc.nextLine();
                    if (next.equalsIgnoreCase("N"))
                        break;
                }

            } else if (pilihan == 2) {
                // MENU TAMPILKAN
                System.out.println("\n===== DAFTAR PENONTON =====");
                for (int i = 0; i < penonton.length; i++) {
                    for (int j = 0; j < penonton[i].length; j++) {
                        String isi = (penonton[i][j] == null) ? "***" : penonton[i][j];
                        System.out.print(isi + "\t");
                    }
                    System.out.println();
                }

            } else if (pilihan == 3) {
                System.out.println("Keluar program...");
                break;

            } else {
                System.out.println("Menu tidak valid!");
            }
        }
    }
}