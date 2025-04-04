package matakuliah;

// Kelas matakuliahMain
public class matakuliahMain {
    public static void main(String[] args) {
        // Membuat objek matakuliah
        matakuliah mk1 = new matakuliah("001", "Algoritma Pemrograman 1", "A", 3);
        matakuliah mk2 = new matakuliah("002", "Algoritma Pemrograman 2", "BC", 3);
        matakuliah mk3 = new matakuliah("003", "Pemrograman Berorientasi Objek", "B", 3);

        // Menampilkan daftar matakuliah
        System.out.println("=== DAFTAR MATAKULIAH ===");
        System.out.println(mk1.display());
        System.out.println(mk2.display());
        System.out.println(mk3.display());

        // Menghitung IPK
        double totalNilai = (mk1.nilaiIndex() * 3) + (mk2.nilaiIndex() * 3) + (mk3.nilaiIndex() * 3);
        double totalSks = 3 + 3 + 3;
        double ipk = totalNilai / totalSks;

        System.out.println("\n--- Nilai IPK ---");
        System.out.println("IPK: " + ipk);
    }
}
