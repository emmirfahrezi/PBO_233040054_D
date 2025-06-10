package Pertemuan15.tugas1;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class HelloWorldForm1 extends JFrame {//1
    private JLabel  label;//2

    //3
    public HelloWorldForm1() {
        label = new JLabel();
        label.setText("Hello World!");

        add(label);
        setTitle("My First program");

        setVisible(true);
        setSize(300, 200);
    }
    
}
