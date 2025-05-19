package Pertemuan11.Abstrak;

// Kelas Tabung merupakan turunan dari Bentuk
public class Tabung extends Bentuk {
    private int tinggi;           // Atribut tinggi tabung (hanya dimiliki Tabung)

    // Konstruktor default (tinggi 0 dan jari2 = 0)
    public Tabung() {
        super(0);                 // Memanggil konstruktor Bentuk dengan jari2 = 0
    }

    // Konstruktor dengan parameter jari-jari dan tinggi
    public Tabung(int jari2, int tinggi) {
        super(jari2);             // Memanggil konstruktor induk Bentuk
        this.tinggi = tinggi;     // Mengatur nilai tinggi tabung
    }

    /*
     * Rumus luas permukaan tabung: L = 2 * PHI * r * (r + t)
     */
    @Override
    public double luas() {
        return 2 * PHI * jari2 * (jari2 + tinggi); // Menghitung luas permukaan tabung
    }

    // Getter untuk tinggi
    public int getTinggi() {
        return tinggi;
    }

    // Setter untuk tinggi
    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }
}
