package Pertemuan15.tugas3;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class HelloWorldForm3 extends JFrame implements ActionListener {//1
    private JLabel label; //1
    private JButton button; //2

    //3
    public HelloWorldForm3() {
        label = new JLabel();
        label.setText("Hello World!");
        button = new JButton("klik Me");
        button.addActionListener(this); 

        setLayout(new GridLayout(2,1));
        add(label);
        add(button);
        setTitle("My Third Program");
        setVisible(true);
        setSize(300, 200);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        label.setText("halomy dunia"); 
    }
}
