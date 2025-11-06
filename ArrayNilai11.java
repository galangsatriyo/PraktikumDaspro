import java.util.Scanner;

public class ArrayNilai11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] nilaiAkhir = new int [10];

        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukan nilai akhir ke-" + i + " : ");
            nilaiAkhir [i] = sc.nextInt();
        }
        for ( int i = 0; i < 10; i++) {
            System.out.println("Nilai akhir ke- " + i + " adalah " +nilaiAkhir[i]);
        }
        for ( int i = 0; i < nilaiAkhir.length; i++) {
            if (nilaiAkhir[i] > 70) {
                System.out.println("mahasiswa ke - " + i + "lulus!");
            } else {
                System.out.println("mahasiswa kw - " + i + "tidak lulus1!");
            }
        }
    }
}
