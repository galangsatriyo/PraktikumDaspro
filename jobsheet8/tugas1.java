package jobsheet8;

import java.util.Scanner;

public class tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai N (rentang 1 s.d 5): ");
        int N = sc.nextInt(); 
        sc.close();
        
        System.out.println("\n**Output Program:**");

        // perulangan luar (i): Menentukan batas n (dari 1 hingga N)
        for (int i = 1; i <= N; i++) {
            
            String ekspresi = "";
            int jumlahKuadrat = 0; 
            
            // perulangan dalam (j): Menghitung kuadrat dari 1 hingga n (i)
            for (int j = 1; j <= i; j++) {
                int kuadrat = j * j;
                jumlahKuadrat += kuadrat;
                
                // membangun string ekspresi: 1 + 4 + 9 ...
                if (j > 1) {
                    ekspresi += " + ";
                }
                ekspresi += kuadrat; 
            }
            
            // mencetak output sesuai format: n = 1 -> jumlah kuadrat = 1 = 1
            System.out.println("n = " + i + " -> jumlah kuadrat = " + ekspresi + " = " + jumlahKuadrat);
        }
    }
}
    

