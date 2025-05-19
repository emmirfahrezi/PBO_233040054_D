package Pertemuan11.Abstrak;

// Kelas Lingkaran merupakan turunan dari Bentuk
public class Lingkaran extends Bentuk {

    // Konstruktor untuk mengatur nilai jari-jari
    public Lingkaran(int jari2) {
        super(jari2);             // Memanggil konstruktor kelas induk Bentuk
    }

    // /*
    //  * Rumus luas lingkaran: L = PHI * r * r
    //  */
    @Override
    public double luas() {
        return PHI * jari2 * jari2;  // Menghitung luas lingkaran
    }
}
