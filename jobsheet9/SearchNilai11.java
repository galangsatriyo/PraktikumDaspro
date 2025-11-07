import java.util.Scanner;

public class SearchNilai11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan banyaknya nilai: ");
        int n = sc.nextInt();

        int [] arrNilai = new int [n];
        
        for (int i = 0; i < n; i++) {
            System.out.print("Masukan nilai mahasiswa ke -" + (i + 1) + " : ");
            arrNilai[i] = sc.nextInt();
        }
        System.out.print("Masukoan nilai yang ingin di cari : ");
        int key = sc.nextInt();
        int hasil = -1;

        for ( int i = 0; i < arrNilai.length; i++) {
            if (key == arrNilai[i]) {
                hasil = i;
                break;
            }
        }
        if (hasil != -1) {
            System.out.println("\nNilai " + key + "ketemu, merupakan nilai mahasiswa ke - " + (hasil + 1));
        } else {
            System.out.println("\nNilai yang di cari tidak di temukan");
        }
        
    }
}
