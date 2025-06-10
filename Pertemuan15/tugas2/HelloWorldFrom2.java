package Pertemuan15.tugas2;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class HelloWorldFrom2 extends JFrame{//1
    private JLabel label; //2

    //3
    public HelloWorldFrom2() {
        label = new JLabel();
        label.setText("Hello World!");

        add(label);
        setTitle("My Second Program");

        setVisible(true);
        setSize(600, 300);
    }
    
}
