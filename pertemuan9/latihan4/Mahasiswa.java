package pertemuan9.latihan4;

public class Mahasiswa extends orang {
    protected String nrp;

    public Mahasiswa(String nama, String alamat, String nrp) {
        super(nama, alamat);
        this.nrp = nrp;
    }

    public String getNrp() {
        return nrp;
    }

    public void setNrp(String nrp) {
        this.nrp = nrp;
    }   
}
