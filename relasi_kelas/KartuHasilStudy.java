package relasi_kelas;

import java.util.ArrayList;
import java.util.List;

public class KartuHasilStudy {
    private String semester;
    private double ips;
    private List<Matakuliah> daftarMatakuliah;

    public KartuHasilStudy(String semester) {
        this.semester = semester;
        this.daftarMatakuliah = new ArrayList<>();
    }

    public void addMatakuliah(Matakuliah matakuliah) {
        daftarMatakuliah.add(matakuliah);
    }

    public String display() {
        StringBuilder sb = new StringBuilder();
        sb.append("Periode Semester: ").append(semester).append("\n");
        for (Matakuliah mk : daftarMatakuliah) {
            sb.append(mk.display()).append("\n");
        }
        return sb.toString();
    }

    public void hitungIPS() {
        double totalNilai = 0;
        int totalSKS = 0;

        for (Matakuliah mk : daftarMatakuliah) {
            totalNilai += mk.getNilaiAngka() * mk.getSKS();
            totalSKS += mk.getSKS();
        }

        if (totalSKS > 0) {
            this.ips = totalNilai / totalSKS;
        } else {
            this.ips = 0;
        }
    }

    public double getIPS() {
        return ips;
    }

    public String getSemester() {
        return semester;
    }
}
