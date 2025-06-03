package Pertemuan14.Soal4;

public class TestDatabaseConnection {
    public static void main(String[] args) {
        // Mengakses variabel statis akan memicu static block
        System.out.println("Database Connection String: " + DatabaseConnection.connectionString);
    }
}