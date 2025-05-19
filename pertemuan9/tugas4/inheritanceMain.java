package pertemuan9.tugas4;

public class inheritanceMain {
    public static void main(String[] args) {
        makanan mhs = new makanan("Bakso Urat",100000, "Satu pedas");
        System.out.println(mhs.getNama() + " " + mhs.getHarga() + " " + mhs.getLevel());
    }
}
