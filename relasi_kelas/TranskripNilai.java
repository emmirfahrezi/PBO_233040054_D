package relasi_kelas;

import java.util.*;

public class TranskripNilai {
    private Date tglCetak;
    private double ipk = 0.0;
    private List<Semester> daftarSemester;
    private Mahasiswa mahasiswa;

    public TranskripNilai(Mahasiswa mahasiswa) {
        this.mahasiswa = mahasiswa;
        this.daftarSemester = new ArrayList<>();
        this.tglCetak = new Date();
    }

    public void hitungIPK() {
        double totalIPS = 0;
        int jumlahSemester = 0;

        for (Semester semester : daftarSemester) {
            for (KartuHasilStudy khs : semester.getDaftarKHS()) {
                totalIPS += khs.getIPS();
                jumlahSemester++;
            }
        }

        if (jumlahSemester > 0) {
            this.ipk = totalIPS / jumlahSemester;
        } else {
            this.ipk = 0;
        }
    }

    public void addSemester(Semester semester) {
        daftarSemester.add(semester);
    }

    public void display() {
        System.out.println(mahasiswa.display());
        System.out.println("Tanggal Cetak: " + tglCetak.toString());
        System.out.println("IPK: " + ipk);

        for (Semester semester : daftarSemester) {
            System.out.println(semester.display());
        }
    }
}
