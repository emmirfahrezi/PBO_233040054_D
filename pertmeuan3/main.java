package pertmeuan3;

public class main {
    public static void main(String[] args) {
        
        Mahasiswa mhs1 = new Mahasiswa("18090123", "Budi", "Jl. Ganesha No. 10", "4A", "TI", true);

        Mahasiswa mhs2 = new Mahasiswa("18090124", "Susi", "Jl. Ganesha No. 11", "4B", "SI", true);
        
        System.out.println(mhs1.hadir);
        mhs1.absen();

        System.out.println(mhs2.hadir);
        mhs2.absen();
    }
}