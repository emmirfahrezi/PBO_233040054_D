package polymorphis;

// Subclass Lingkaran
public class Lingkaran extends Bentuk {
private double radius;

public Lingkaran(double radius) {
this.radius = radius;
}

@Override
public double hitungLuas() {
return Math.PI * radius * radius;
}

 public double getRadius() {
        return radius;
    }

}
