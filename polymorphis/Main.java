package polymorphis;

public class Main {
public static void main(String[] args) {
// Polymorphism: Referensi Bentuk menunjuk ke objek Lingkaran/Tabung
Bentuk bentuk1 = new Lingkaran(7);
Bentuk bentuk2 = new Tabung(7, 10);
System.out.println("Luas Lingkaran: " + bentuk1.hitungLuas());
// Output: Luas Lingkaran: 153.938...
System.out.println("Luas Tabung: " + bentuk2.hitungLuas());
// Output: Luas Tabung: 747.699...
}
}

