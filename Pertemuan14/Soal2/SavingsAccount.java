package Pertemuan14.Soal2;

public class SavingsAccount extends BankAccount {

    public SavingsAccount(String accountNumber) {
        super(accountNumber);
    }

    // Error: Cannot override the final method from BankAccount
    // @Override
    // public void displayAccountInfo() {
    //     System.out.println("Savings Account Info:");
    //     System.out.println("Balance with interest coming soon...");
    // }

    // unutuk menangani bisa buatsubclass baru tanpa mengoverride method final
    public void displaySavingsInfo() {
        System.out.println("Savings Account Info:");
        System.out.println("Balance with interest coming soon...");
    }   
    
}

