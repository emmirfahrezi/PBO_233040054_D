package Pertemuan14.Soal5;

public class TestMahasiswa {
    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa("233040076", "soti");
        Mahasiswa m2 = new Mahasiswa("23040078", "bukar");
        Mahasiswa m3 = new Mahasiswa("23040081", "cainar");

        // Tampilkan informasi masing-masing mahasiswa
        m1.displayInfo();
        m2.displayInfo();
        m3.displayInfo();

        // Tampilkan total mahasiswa
        System.out.println("Total pendaftar mahasiswa: " + Mahasiswa.getTotalMahasiswa());
    }
}
