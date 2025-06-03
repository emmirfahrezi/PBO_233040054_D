package Pertemuan14.Soal2;

public class Main {
    public static void main(String[] args) {
        // Membuat objek SavingsAccount dengan nomor rekening "SA12345"
        SavingsAccount sa = new SavingsAccount("SA12345");

        // Melakukan deposit sejumlah 1500.0 ke rekening
        sa.deposit(1500.0);

        // Memanggil method final dari superclass (BankAccount)
        // Method ini tidak bisa dioverride di subclass SavingsAccount
        sa.displayAccountInfo();
    }
}