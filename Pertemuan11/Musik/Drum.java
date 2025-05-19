package Pertemuan11.Musik;

// Drum mewarisi AlatMusik dan mengimplementasikan Dimainkan
public class Drum extends AlatMusik implements Dimainkan {

    public Drum(String nama) {
        super(nama); // Inisialisasi nama
    }

    @Override
    public String bunyi() {
        return "Dung tak tak dung tak dus";
    }

    @Override
    public void mainkan() {
        System.out.println("Dimainkan dengan dipukul.");
    }
}

