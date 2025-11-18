package jobsheet10;

import java.util.Scanner;

public class Tugas11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int RESPONDEN = 10;
        final int PERTANYAAN = 6;

        int[][] survey = new int[RESPONDEN][PERTANYAAN];

        System.out.println("=== INPUT DATA SURVEI KEPUASAN ===");
        for (int i = 0; i < RESPONDEN; i++) {
            System.out.println("\nResponden " + (i + 1));
            for (int j = 0; j < PERTANYAAN; j++) {
                System.out.print("Nilai pertanyaan " + (j + 1) + " (1-5): ");
                survey[i][j] = sc.nextInt();
            }
        }

        System.out.println("\n=== RATA-RATA PER RESPONDEN ===");
        for (int i = 0; i < RESPONDEN; i++) {
            int total = 0;
            for (int j = 0; j < PERTANYAAN; j++) {
                total += survey[i][j];
            }
            double rata = (double) total / PERTANYAAN;
            System.out.println("Responden " + (i + 1) + ": " + rata);
        }
        System.out.println("\n=== RATA-RATA PER PERTANYAAN ===");
        for (int j = 0; j < PERTANYAAN; j++) {
            int total = 0;
            for (int i = 0; i < RESPONDEN; i++) {
                total += survey[i][j];
            }
            double rata = (double) total / RESPONDEN;
            System.out.println("Pertanyaan " + (j + 1) + ": " + rata);
        }
        System.out.println("\n=== RATA-RATA KESELURUHAN ===");
        int totalSemua = 0;

        for (int i = 0; i < RESPONDEN; i++) {
            for (int j = 0; j < PERTANYAAN; j++) {
                totalSemua += survey[i][j];
            }
        }

        double rataKeseluruhan = (double) totalSemua / (RESPONDEN * PERTANYAAN);
        System.out.println("Rata-rata keseluruhan: " + rataKeseluruhan);

        sc.close();
    }
}