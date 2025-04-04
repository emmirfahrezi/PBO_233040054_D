package relasi_kelas;

public class Mahasiswa {
    private String nrp;
    private String nama;

    // Konstruktor default
    public Mahasiswa() {
        this.nrp = "";
        this.nama = "";
    }

    // Konstruktor dengan parameter
    public Mahasiswa(String nrp, String nama) {
        this.nrp = nrp;
        this.nama = nama;
    }

    // Metode untuk menampilkan informasi mahasiswa
    public String display() {
        return "NRP: " + this.nrp + ", Nama: " + this.nama;
    }

    // Getter dan Setter
    public String getNRP() {
        return nrp;
    }

    public void setNRP(String nrp) {
        this.nrp = nrp;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}
