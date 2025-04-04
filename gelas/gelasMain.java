package gelas;

// Kelas utama untuk menjalankan program
public class gelasMain {
    public static void main(String[] args) {
        gelas g1 = new gelas("hitam");
        gelas g2 = new gelas("biru");

        System.out.println("sebelum tukar warna");
        System.out.println("Warna g1: " + g1.getWarna());
        System.out.println("Warna g2: " + g2.getWarna());
        tukarWarnaGelas(g1, g2);
        System.out.println("Warna g1: " + g1.getWarna());
        System.out.println("Warna g2: " + g2.getWarna());
    }

    static void tukarWarnaGelas(gelas g1, gelas g2) {
        gelas gTemp = new gelas("Temp");
        gTemp.setWarna(g1.getWarna());
        g1.setWarna(g2.getWarna());
        g2.setWarna(gTemp.getWarna());
    }
}