package Pertemuan11.Musik;

// Kelas abstrak AlatMusik sebagai parent class
public abstract class AlatMusik {
    // Properti nama bersifat protected agar bisa diakses oleh subclass
    protected String nama;

    // Konstruktor untuk inisialisasi nama alat musik
    public AlatMusik(String nama) {
        this.nama = nama;
    }

    // Method getter untuk mendapatkan nama alat musik
    public String getNama() {
        return nama;
    }

    // Method setter untuk mengubah nama alat musik
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Method abstrak yang harus diimplementasikan di subclass
    public abstract String bunyi();
}

