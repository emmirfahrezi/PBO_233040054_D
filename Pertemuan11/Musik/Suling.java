package Pertemuan11.Musik;

// Suling juga merupakan subclass dari AlatMusik dan mengimplementasikan Dimainkan
public class Suling extends AlatMusik implements Dimainkan {

    public Suling(String nama) {
        super(nama); // Memanggil konstruktor parent class
    }

    @Override
    public String bunyi() {
        return "tutit fiit tutit";
    }

    @Override
    public void mainkan() {
        System.out.println("Dimainkan dengan ditiup.");
    }
}
