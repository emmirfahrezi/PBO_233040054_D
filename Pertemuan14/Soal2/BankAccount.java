package Pertemuan14.Soal2;

/**
 * Kelas BankAccount menyimpan data rekening bank.
 * Penggunaan final pada accountNumber: nilainya tidak bisa diubah setelah objek dibuat.
 * Penggunaan final pada displayAccountInfo(): method ini tidak bisa dioverride di subclass.
 */
public class BankAccount {
    private final String accountNumber; // final: hanya bisa diisi sekali lewat konstruktor
    protected double balance;

    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    /**
     * final: method ini tidak bisa dioverride di subclass.
     * Jika subclass mencoba override, akan muncul error:
     * "Cannot override the final method from BankAccount"
     */
    public final void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
        displayAdditionalInfo();
    }

    /**
     * Method ini bisa dioverride oleh subclass untuk menampilkan info tambahan.
     */
    protected void displayAdditionalInfo() {
        // Kosong, bisa diisi oleh subclass
    }
}