package Pertemuan14.Soal5;

public class Mahasiswa {
    private final String nim; // Tidak bisa diubah setelah inisialisasi
    private String nama;

    private static int totalMahasiswa = 0; // Menghitung jumlah objek Mahasiswa
    public static final int MAX_SKS = 24;  // Konstanta global

    // Constructor
    public Mahasiswa(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;
        totalMahasiswa++; // Tambah jumlah mahasiswa saat objek dibuat
    }

    // Method untuk menampilkan informasi mahasiswa
    public void displayInfo() {
        System.out.println("NIM  : " + nim);
        System.out.println("Nama : " + nama);
        System.out.println("Max SKS yang boleh diambil: " + MAX_SKS);
        System.out.println("---------------------------");
    }

    // Method static untuk mendapatkan total mahasiswa
    public static int getTotalMahasiswa() {
        return totalMahasiswa;
    }
}

