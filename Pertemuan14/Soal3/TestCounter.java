package Pertemuan14.Soal3;

public class TestCounter {
    public static void main(String[] args) {
        // Membuat beberapa objek Counter
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
        Counter c4 = new Counter();
        Counter c5 = new Counter();
        Counter c6 = new Counter();

        // Menampilkan jumlah instance yang telah dibuat
        System.out.println("Total Counter instances: " + Counter.getInstanceCount());
    }
}

