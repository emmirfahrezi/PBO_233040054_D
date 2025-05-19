package Pertemuan11.Musik;

// Kelas utama untuk menjalankan program
public class Main {
    public static void main(String[] args) {
        // Membuat objek alat musik dan disimpan sebagai tipe interface Dimainkan
        Dimainkan gitar = new Gitar("Gitar Akustik");
        Dimainkan suling = new Suling("Suling Bambu");
        Dimainkan drum = new Drum("Drum Elektrik");

        System.out.println("== Suara Alat Musik ==");

        // Mengecek apakah objek gitar juga merupakan instance dari AlatMusik
        if (gitar instanceof AlatMusik) {
            // Cetak nama dan suara gitar
            System.out.println(((AlatMusik) gitar).getNama() + ": " + ((AlatMusik) gitar).bunyi());
        }
        // Jalankan method mainkan dari interface
        gitar.mainkan();
         // Mengecek apakah objek suling juga merupakan instance dari AlatMusik
        if (suling instanceof AlatMusik) {
            System.out.println(((AlatMusik) suling).getNama() + ": " + ((AlatMusik) suling).bunyi());
        }
        // Jalankan method mainkan dari interface
        suling.mainkan();
        // Mengecek apakah objek drum juga merupakan instance dari AlatMusik
        if (drum instanceof AlatMusik) {
            System.out.println(((AlatMusik) drum).getNama() + ": " + ((AlatMusik) drum).bunyi());
        }
        // Jalankan method mainkan dari interface
        drum.mainkan();
    }
}
