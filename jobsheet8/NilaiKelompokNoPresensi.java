package jobsheet8;

import java.util.Scanner;

public class NilaiKelompokNoPresensi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double rataNilai;
        double nilaiTertinggi = 0;
        int kelompokTertinggi = 0;

        int i = 1;
        while (i <= 6) {
            System.out.println("Kelompok " + i);

            int totalNilai = 0;
            for (int j = 1; j <= 5; j++) {
                System.out.print("Nilai dari kelompok penilai " + j + ":");
                int nilai = sc.nextInt();
                totalNilai += nilai;
            }
            rataNilai = totalNilai / 5;
            System.out.println("Kelompok " + i + ": Nilai rata rata = " + rataNilai);
            System.out.println();

            if (rataNilai > nilaiTertinggi) {
                nilaiTertinggi = rataNilai;
                kelompokTertinggi = i;
            }

            i++;

        }
        System.out.println("Kelompok dengan rata rata tertinggi adalah kelompok " + kelompokTertinggi + "dengan nilai" + nilaiTertinggi);
        sc.close();
    }
}
