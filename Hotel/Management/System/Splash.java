package Hotel.Management.System;

import javax.swing.*;

public class Splash extends JFrame {
    Splash(){
        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/shot_16.gif"));
        JLabel label = new JLabel(imageIcon);
        label.setBounds(0,0,858,600);
        add(label);

        setLayout(null);
        setLocation(250,80);
        setSize(855,600);
        setVisible(true);

        try {
            Thread.sleep(5000);
             new Login();
             setVisible(false);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        new Splash();
    }
}
