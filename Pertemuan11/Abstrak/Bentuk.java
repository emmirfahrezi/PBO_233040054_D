package Pertemuan11.Abstrak;


// Kelas abstrak sebagai dasar dari bentuk-bentuk lain
public abstract class Bentuk {
    protected double PHI = 3.14;  // Konstanta nilai PHI untuk perhitungan luas
    protected int jari2;          // Atribut jari-jari yang dapat diwarisi

    // Konstruktor untuk menginisialisasi nilai jari-jari
    public Bentuk(int jari2) {
        super();                  // Memanggil konstruktor superclass (Object)
        this.jari2 = jari2;       // Mengatur nilai jari-jari
    }

    // Method abstrak luas yang akan diimplementasikan oleh subclass
    public abstract double luas();

    // Getter untuk jari-jari
    public int getJari2() {
        return jari2;
    }

    // Setter untuk jari-jari
    public void setJari2(int jari2) {
        this.jari2 = jari2;
    }
}

