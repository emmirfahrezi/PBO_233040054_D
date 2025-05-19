package Interface;

// Kelas KartuElektronik mengimplementasikan interface Kartu
public class KartuElektronik implements Kartu {
    // Properti untuk menyimpan kode bank
    private String kodeBank;

    // Properti untuk menyimpan PIN
    private String pin;

    // Konstruktor untuk menginisialisasi kode bank dan PIN
    public KartuElektronik(String kodeBank, String pin) {
        super(); // Memanggil konstruktor superclass (tidak wajib karena tidak mewarisi class lain)
        this.kodeBank = kodeBank; // Mengisi kode bank
        this.pin = pin;           // Mengisi PIN
    }

    // Implementasi metode otentikasi dari interface
    @Override
    public boolean otentikasi(String pinInput) {
        // Mengecek apakah input sama dengan PIN yang disimpan
        if (pin.equals(pinInput))
            return true; // Jika cocok, otentikasi berhasil
        else
            return false; // Jika tidak cocok, otentikasi gagal
    }

    // Implementasi metode encode dari interface
    @Override
    public String encode(String pin) {
        // Komentar bahwa seharusnya dilakukan enkripsi atau pengamanan PIN
        // Di sini hanya dikembalikan null karena belum diimplementasikan
        return null;
    }
}

