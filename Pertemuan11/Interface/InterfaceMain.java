package Pertemuan11.Interface;

// Kelas utama untuk menjalankan program
public class InterfaceMain {
    public static void main(String[] args) {
        // Membuat objek KartuElektronik dengan kode bank "IF11" dan PIN "123"
        KartuElektronik kartu = new KartuElektronik("IF11", "123");

        // Mencetak hasil otentikasi dengan input "123"
        System.out.println("Otentikasi: " + kartu.otentikasi("123"));
        // Akan mencetak: Otentikasi: true (karena PIN cocok)
    }
}

