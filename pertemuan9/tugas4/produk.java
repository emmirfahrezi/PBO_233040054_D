package pertemuan9.tugas4;

public class produk {
    protected String nama;
    protected double harga;
    
    public produk(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }
    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }
}
