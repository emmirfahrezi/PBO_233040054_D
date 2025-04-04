package lingkaran;

public class objeknull {
    public static void main(String[] args) {
    //     lingkaran l1 = new lingkaran(5);
    //     lingkaran l2 = l1;
    //     lingkaran l3 = new lingkaran(7);
    //     System.out.println(l1.getJari2());
    //     System.out.println(l2.getJari2());
    //     System.out.println(l3.getJari2());
    //     l2 = null; //l2 tidak lagi mereferensi ke objek lingkaran
    //     System.out.println(l1.getJari2());
    //     System.out.println(l2.getJari2()); //Error
    //     System.out.println(l3.getJari2());



        // lingkaran l1 = new lingkaran(5);
        // lingkaran l2 = l1;
        // lingkaran l3 = new lingkaran(7);
        // System.out.println(l1.getJari2());
        // System.out.println(l2.getJari2());
        // System.out.println(l3.getJari2());
        // l2 = null;
        // System.out.println(l1.getJari2());
        // if (l2 != null) System.out.println(l2.getJari2());
        // System.out.println(l3.getJari2());


        lingkaran l1 = new lingkaran(5);
        lingkaran l2 = l1;
        lingkaran l3 = new lingkaran(7);
        System.out.println(l1.getJari2());
        System.out.println(l2.getJari2());
        System.out.println(l3.getJari2());
        l1 = null;
        l2 = null;
        l3 = null;
    }
}
