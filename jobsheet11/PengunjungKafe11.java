public class PengunjungKafe11 {
    static void daftarPengunjung (String...namaPengunjung) {
        System.out.println("Daftar nama pengunjung: ");
        for(int i = 0; i < namaPengunjung.length; i++) {
            System.out.println("-" +namaPengunjung[i]);
        }
    }
    public static void main(String[] args) {
        daftarPengunjung("Ali", "Budi", "Citra");
        daftarPengunjung("ANDI");
        daftarPengunjung("Doni", "Eti", "Fahmi","Galih");
    }
}
