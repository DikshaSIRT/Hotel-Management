
import javax.swing.*;

public class splash extends JFrame {
    splash(){
        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/Hotel.gif"));
        JLabel label = new JLabel(imageIcon);
        label.setBounds(0,0,858,680);
        setLayout(null);
        setLocation(300,80);
        setSize(858,680);
        setVisible(true);
        try{
            Thread.sleep(5000);
     }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        new splash();
    }}
