package inheritance;

public class Mahasiswa extends orang{
    public String nim;
    public String getNim() {
        return nim;
    }
    public void setNim(String nim) {
        this.nim = nim;
    }
    public Mahasiswa() { 
        super(); 
        this.nim = "init";
    }
    public String getNama() {
        return super.getNama();
    }
    public void setNama(String nama) {
        super.nama = nama;
    }
}       
