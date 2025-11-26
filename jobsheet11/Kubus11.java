public class Kubus11 {
–
    public static double hitungVolume(double sisi) {
        return sisi * sisi * sisi;
    }

    public static double hitungLuasPermukaan(double sisi) {
        return 6 * sisi * sisi;
    }

    public static void main(String[] args) {
        double sisi = 5; 

        System.out.println("Sisi kubus: " + sisi);
        System.out.println("Volume kubus: " + hitungVolume(sisi));
        System.out.println("Luas permukaan kubus: " + hitungLuasPermukaan(sisi));
    }
}


