package relasi_kelas;

import java.util.*;

public class TranskripNilai {
    private Date tglCetak;
    private double ipk = 0.0;
    private List<KartuHasilStudy> kartuHasilStudi;
    private Mahasiswa mahasiswa;

    public TranskripNilai(Mahasiswa mahasiswa) {
        this.mahasiswa = mahasiswa;
        this.kartuHasilStudi = new ArrayList<>();
        this.tglCetak = new Date();
    }

    public void hitungIPK() {
        double totalIPS = 0;
        int jumlahSemester = kartuHasilStudi.size();

        if (jumlahSemester > 0) {
            for (KartuHasilStudy khs : kartuHasilStudi) {
                totalIPS += khs.getIPS();
            }
            this.ipk = totalIPS / jumlahSemester;
        } else {
            this.ipk = 0;
        }
    }

    public void addKHS(KartuHasilStudy khs) {
        kartuHasilStudi.add(khs);
    }

    public void display() {
        System.out.println(mahasiswa.display());
        System.out.println("Tanggal Cetak: " + tglCetak.toString());
        System.out.println("IPK: " + ipk);
        
        for (KartuHasilStudy khs : kartuHasilStudi) {
            System.out.println(khs.display());
        }
    }

    public double getIPK() {
        return ipk;
    }
}
