package pertemuan9.tugas3;

public class inheritanceMain {
    public static void main(String[] args) {
        makanan mkn = new makanan("Bakso Urat", 100000);
        System.out.println(mkn.getNama() + " " + mkn.getAlamat());
    }
}
