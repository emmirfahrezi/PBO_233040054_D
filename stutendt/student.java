package stutendt;

public class student {
    private String nrp;

    public student() {
    }

    public student(String nrp) {
        this.nrp = nrp;
    }

    public String getNrp() {
        return nrp;
    }

    public void setNrp(String nrp) {
        this.nrp = nrp;
    }

    public static void main(String[] args) {
        student x = new student();
        student y = x;
        x.setNrp("01");
        y.setNrp("02");
        System.out.println(x.getNrp()); // Output: 02
        student z = new student();
        z.setNrp("03");
        x = z;
        System.out.println(x.getNrp()); // Output: 03
        System.out.println(y.getNrp()); // Output: 02
    }
}