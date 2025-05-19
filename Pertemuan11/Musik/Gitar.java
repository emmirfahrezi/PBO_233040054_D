package Pertemuan11.Musik;

// Gitar adalah subclass dari AlatMusik dan mengimplementasikan interface Dimainkan
public class Gitar extends AlatMusik implements Dimainkan {
    
    // Konstruktor Gitar
    public Gitar(String nama) {
        super(nama); // Memanggil konstruktor AlatMusik
    }

    // Implementasi method bunyi dari kelas abstrak AlatMusik
    @Override
    public String bunyi() {
        return "jreng gwunjrenggggg";
    }

    // Implementasi method dari interface Dimainkan
    @Override
    public void mainkan() {
        System.out.println("Dimainkan dengan petikan jari");
    }
}
