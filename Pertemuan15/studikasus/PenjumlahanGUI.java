package Pertemuan15.studikasus;

import javax.swing.*;
import java.awt.event.*;

public class PenjumlahanGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Penjumlahan");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JTextField field1 = new JTextField();
        field1.setBounds(50, 20, 200, 30);

        JTextField field2 = new JTextField();
        field2.setBounds(50, 60, 200, 30);

        JButton btnJumlah = new JButton("Jumlah");
        btnJumlah.setBounds(50, 100, 200, 30);

        btnJumlah.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int angka1 = Integer.parseInt(field1.getText());
                    int angka2 = Integer.parseInt(field2.getText());
                    int hasil = angka1 + angka2;
                    JOptionPane.showMessageDialog(frame, "Jumlah: " + hasil);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Input harus berupa angka!", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        frame.add(field1);
        frame.add(field2);
        frame.add(btnJumlah);
        frame.setVisible(true);
    }
}
