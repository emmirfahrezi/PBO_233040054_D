package Pertemuan14.Soal3;

public class Counter {
    // Variabel static: berbagi nilai antar semua objek
    private static int instanceCount = 0;

    // Konstruktor: menaikkan nilai saat objek dibuat
    public Counter() {
        instanceCount++;
    }

    // Method static: mengembalikan jumlah instance yang telah dibuat
    public static int getInstanceCount() {
        return instanceCount;
    }
}
