package pertmeuan3;

public class lingkaran {
    double jarijari;
    double phi;

    public lingkaran(float jarijari){
        this.jarijari = jarijari;
        this.phi = 3.14;
    }

    public double hitungLuas(){
        return phi * jarijari * jarijari;
    }
}
