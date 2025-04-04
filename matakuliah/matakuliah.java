package matakuliah;

// Kelas matakuliah
public class matakuliah {
    private String kode;
    private String nama;
    private String index;
    private int sks;

    // Konstruktor
    public matakuliah(String kode, String nama, String index, int sks) {
        this.kode = kode;
        this.nama = nama;
        this.index = index;
        this.sks = sks;
    }

   // Method untuk mendapatkan nilai berdasarkan index
public double nilaiIndex() {
    if (index.equals("A")) {
        return 4.0;
    } else if (index.equals("AB")) {
        return 3.5;
    } else if (index.equals("B")) {
        return 3.0;
    } else if (index.equals("BC")) {
        return 2.5;
    } else if (index.equals("C")) {
        return 2.0;
    } else if (index.equals("D")) {
        return 1.0;
    } else if (index.equals("E")) {
        return 0.0;
    } else {
        return -1; // Nilai tidak valid
    }
}

    // Method untuk menampilkan informasi matakuliah
    public String display() {
        return kode + " - " + nama + " - " + index;
    }
}
