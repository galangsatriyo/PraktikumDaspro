package jobsheet8;

import java.util.Scanner;

public class StarNoPresensi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukan nilai n = ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++) {
            System.out.print("*");
        }
    }
}
    