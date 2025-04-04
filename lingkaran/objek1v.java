package lingkaran;

public class objek1v {
    public static void main(String[] args) {
        lingkaran l1 = new lingkaran(5);
        lingkaran l2 = l1;
        System.out.println(l1.getJari2());
        System.out.println(l2.getJari2());
        l2.setJari2(10);
        System.out.println(l1.getJari2());
        System.out.println(l2.getJari2());
    }

    
}
