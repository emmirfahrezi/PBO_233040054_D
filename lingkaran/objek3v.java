package lingkaran;

public class objek3v {
    public static void main(String[] args) {
        lingkaran l1 = new lingkaran(5);
        lingkaran l2 = l1;
        lingkaran l3 = new lingkaran(7);
        System.out.println(l1.getJari2());
        System.out.println(l2.getJari2());
        System.out.println(l3.getJari2());
        l2 = l3;
        System.out.println(l1.getJari2());
        System.out.println(l2.getJari2());
        System.out.println(l3.getJari2());
        
    }
}
