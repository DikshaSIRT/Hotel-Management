package Hotel.Management.System;
import java.awt.Color;
import java.awt.*;
import javax.swing.*;
public class error extends JFrame {
    error(){
    JLabel label = new JLabel("Please check your data");
    label.setBounds(150,0,500,250);
    label.setFont(new Font("Tahoma", Font.PLAIN, 34));

    add(label);
    setLayout(null);
  
    setVisible(true);
    getContentPane().setBackground(new Color(3,45,48));
    setLayout(null);
    setLocation(400,270);
    setSize(650,300);
    setVisible(true);
    add(label);
              }
public static void main(String[] args) {
    new error();
}

}