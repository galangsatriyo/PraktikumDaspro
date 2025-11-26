public class PengunjungKafe11 {

    static void daftarPengunjung(String... namaPengunjung) {
        System.out.println("Daftar nama pengunjung:");

        for (String nama : namaPengunjung) {
            System.out.println("- " + nama);
        }

        System.out.println();
    }

    public static void main(String[] args) {
        daftarPengunjung("Ali", "Budi", "Citra");
        daftarPengunjung("ANDI");
        daftarPengunjung("Doni", "ETI", "Fahmi", "Galih");
    }
}
