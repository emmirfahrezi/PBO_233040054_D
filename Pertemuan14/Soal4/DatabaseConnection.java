package Pertemuan14.Soal4;

public class DatabaseConnection {
    // Static: variabel milik kelas, bukan objek
    public static String connectionString;

    // Static block: dijalankan satu kali saat kelas pertama kali digunakan
    static {
        connectionString = "jdbc:mysql://localhost:3306/mydatabase";
        System.out.println("Static block executed: Connection string initialized.");
    }
}