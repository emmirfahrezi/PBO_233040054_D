package pertmeuan3;

public class Mahasiswa {

    public String nim;
    public String nama;
    public String alamat;
    public String kelas;
    public String jurusan;
    public boolean hadir;

    public Mahasiswa(String nim, String nama, String alamat, String kelas, String jurusan, boolean hadir) {
        this.nim = nim;
        this.nama = nama;
        this.alamat = alamat;
        this.kelas = kelas;
        this.jurusan = jurusan;
        this.hadir = hadir;
    }

    public void absen(){
        this.hadir = true;
        System.out.println("Mahasiswa " + this.nama + " telah absen");
    }



}
