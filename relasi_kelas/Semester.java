package relasi_kelas;

import java.util.ArrayList;
import java.util.List;

public class Semester {
    private String kodeSemester;
    private List<KartuHasilStudy> daftarKHS;

    public Semester(String kodeSemester) {
        this.kodeSemester = kodeSemester;
        this.daftarKHS = new ArrayList<>();
    }

    public void addKHS(KartuHasilStudy khs) {
        daftarKHS.add(khs);
    }

    public String getKodeSemester() {
        return kodeSemester;
    }

    public List<KartuHasilStudy> getDaftarKHS() {
        return daftarKHS;
    }

    public String display() {
        StringBuilder sb = new StringBuilder();
        sb.append("semester: ").append(kodeSemester).append("\n");
        for (KartuHasilStudy khs : daftarKHS) {
            sb.append(khs.display()).append("\n");
        }
        return sb.toString();
    }
}

