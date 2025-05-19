
package pertemuan10;

public class dog extends animal {

    @Override
    
    public void sound() {
    
    System.out.println("wooof");
    
    }
    

    public static void main(String[] args) {
        dog d = new dog();
        d.sound(); // Output: Bark!
        d.makan(); // Output: eating
    }

}
