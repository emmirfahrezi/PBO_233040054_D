package relasi_kelas;

public class TranskripNilaiMain {
    public static void main(String[] args) {
        // Create objek matakuliah dengan dosen pengampu
        Matakuliah mk1 = new Matakuliah("001", "Algoritma Pemrograman 1", "A", 3, "Dr. Masaraja singaban");
        Matakuliah mk2 = new Matakuliah("002", "Algoritma Pemrograman 2", "BC", 3, "Prof. Dwi Rizal");
        Matakuliah mk3 = new Matakuliah("003", "Pemrograman Berorientasi Objek", "B", 3, "Dr. Ahmad supraman");

        // Create objek KHS dengan semester tertentu
        KartuHasilStudy khs = new KartuHasilStudy("Ganjil 2022/2023");
        khs.addMatakuliah(mk1);
        khs.addMatakuliah(mk2);
        khs.addMatakuliah(mk3);
        khs.hitungIPS();

        // Create objek Mahasiswa
        Mahasiswa mhs = new Mahasiswa("303040001", "Jhon");

        // Create objek TranskripNilai
        TranskripNilai transkrip = new TranskripNilai(mhs);
        transkrip.addKHS(khs);
        transkrip.hitungIPK();
        transkrip.display();
    }
}
