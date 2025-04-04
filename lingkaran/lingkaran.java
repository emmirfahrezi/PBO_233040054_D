package lingkaran;

public class lingkaran {
    private double jarijari;
    private double phi;

    public lingkaran(double jarijari) {
        this.jarijari = jarijari;
        this.phi = 3.14;
    }

    public double hitungLuas() {
        return phi * jarijari * jarijari;
    }

    public double getJari2() {
        return jarijari;
    }


    public void setJari2(double jarijari) {
        this.jarijari = jarijari;
    }

    public static void main(String[] args) {
        lingkaran lingkaran1 = new lingkaran(7);
        System.out.println("Luas lingkaran dengan jari-jari 7 adalah: " + lingkaran1.hitungLuas());
    }
}