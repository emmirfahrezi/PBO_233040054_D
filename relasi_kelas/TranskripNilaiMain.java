package relasi_kelas;

public class TranskripNilaiMain {
    public static void main(String[] args) {
        // Create objek matakuliah dengan informasi dosen pengampu
        Matakuliah mk1 = new Matakuliah("001", "Algoritma Pemrograman 1", "A", 3, "Dr. Ahmad Kasim");
        Matakuliah mk2 = new Matakuliah("002", "Algoritma Pemrograman 2", "BC", 3, "Prof. Khidir Karawita");
        Matakuliah mk3 = new Matakuliah("003", "Pemrograman Berorientasi Objek", "B", 3, "Dr. Supraman");

        // Create objek KHS
        KartuHasilStudy khs = new KartuHasilStudy("periode 2023/2024");
        khs.addMatakuliah(mk1);
        khs.addMatakuliah(mk2);
        khs.addMatakuliah(mk3);
        khs.hitungIPS();

        // Create objek Mahasiswa
        Mahasiswa mhs = new Mahasiswa("303040001", "Jhon");

        // Create objek TranskripNilai
        TranskripNilai transkrip = new TranskripNilai(mhs);

        // Create objek Semester dan hubungkan dengan KHS
        Semester semester1 = new Semester("semester 1");
        semester1.addKHS(khs);
        
        // Tambahkan semester ke transkrip nilai
        transkrip.addSemester(semester1);

        // Hitung IPK dan tampilkan hasil
        transkrip.hitungIPK();
        transkrip.display();
    }
}
