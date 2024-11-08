package Hotel.Management.System;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;
import javax.swing.*;

public class NewCustomer extends JFrame implements ActionListener {
    JComboBox comboBox;
    JTextField textFieldNumber ,TextName, TextCountry,TextDeposite,TextDeases,TextOccupation;
    JRadioButton r1, r2;
    Choice c1;
    JLabel date;

    JButton add,back;
    NewCustomer(){

        JPanel panel = new JPanel();
        panel.setBounds(5,5,840,540);
        panel.setLayout(null);
        panel.setBackground(new Color(3,45,48));
        add(panel);

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/customer.png"));
        Image image = imageIcon.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(image);
        JLabel imglabel = new JLabel(imageIcon1);
        imglabel.setBounds(550,150,200,200);
        panel.add(imglabel);

        JLabel labelName = new JLabel("Cheked In");
        labelName.setBounds(118,11,260,53);
        labelName.setFont(new Font("Tahoma", Font.BOLD,20));
        labelName.setForeground(Color.WHITE);
        panel.add(labelName);

        JLabel labelID = new JLabel("ID :");
        labelID.setBounds(35,66,200,14);
        labelID.setForeground(Color.WHITE);
        labelID.setFont(new Font("Tahoma", Font.PLAIN, 14));
        panel.add(labelID);

        comboBox = new JComboBox(new String[] {"Passport", "Aadhar Card", "Voter Id", "Driving License"});
        comboBox.setBounds(271,66,150,20);
        comboBox.setBackground(new Color(3,45,48));
        comboBox.setForeground(Color.WHITE);
        comboBox.setFont(new Font("Tahoma", Font.PLAIN, 14));
        panel.add(comboBox);

        JLabel labelNumber = new JLabel("Number :");
        labelNumber.setBounds(35,101,200,14);
        labelNumber.setForeground(Color.WHITE);
        labelNumber.setFont(new Font("Tahoma", Font.PLAIN, 14));
        panel.add(labelNumber);
        textFieldNumber = new JTextField();
        textFieldNumber.setBounds(271,101,150,20);
        panel.add(textFieldNumber);

        JLabel labelname = new JLabel("Name :");
        labelname.setBounds(35,141,200,14);
        labelname.setForeground(Color.WHITE);
        labelname.setFont(new Font("Tahoma", Font.PLAIN, 14));
        panel.add(labelname);
        TextName = new JTextField();
        TextName.setBounds(271,141,150,20);
        panel.add(TextName);


        JLabel labelGender = new JLabel("Gender :");
        labelGender.setBounds(35,181,200,14);
        labelGender.setForeground(Color.WHITE);
        labelGender.setFont(new Font("Tahoma", Font.PLAIN, 14));
        panel.add(labelGender);

        r1 = new JRadioButton("Male");
        r1.setFont(new Font("Tahoma", Font.BOLD, 14));
        r1.setForeground(Color.WHITE);
        r1.setBackground(new Color(3,45,48));
        r1.setBounds(271,181,80,12);
        panel.add(r1);

        r2 = new JRadioButton("Female");
        r2.setFont(new Font("Tahoma", Font.BOLD, 14));
        r2.setForeground(Color.WHITE);
        r2.setBackground(new Color(3,45,48));
        r2.setBounds(350,181,80,12);
        panel.add(r2);

        JLabel labelCountry = new JLabel("Country :");
        labelCountry.setBounds(35,200,200,14);
        labelCountry.setForeground(Color.WHITE);
        labelCountry.setFont(new Font("Tahoma", Font.PLAIN, 14));
        panel.add(labelCountry);
        TextCountry = new JTextField();
        TextCountry.setBounds(271,200,150,20);
        panel.add(TextCountry);



        JLabel labelRoom = new JLabel("Allocated Room Number :");
        labelRoom.setBounds(35,230,200,14);
        labelRoom.setForeground(Color.WHITE);
        labelRoom.setFont(new Font("Tahoma", Font.PLAIN, 14));
        panel.add(labelRoom);

        c1 = new Choice();
        try{

            conn c = new conn();
            ResultSet resultSet = c.statement.executeQuery("select * from room");
            while (resultSet.next()){
                c1.add(resultSet.getString("room"));
            }

        }catch (Exception e){
            e.printStackTrace();
        }
        c1.setBounds(271,230,150,20);
        c1.setFont(new Font("Tahoma", Font.BOLD, 14));
        c1.setForeground(Color.WHITE);
        c1.setBackground(new Color(3,45,48));
        panel.add(c1);

        JLabel labelCIS = new JLabel("Checked-In :");
        labelCIS.setBounds(35,270,200,14);
        labelCIS.setForeground(Color.WHITE);
        labelCIS.setFont(new Font("Tahoma", Font.PLAIN, 14));
        panel.add(labelCIS);

        Date date1 = new Date();

        date = new JLabel(""+date1);
        date.setBounds(271,270,200,14);
        date.setForeground(Color.WHITE);
        date.setFont(new Font("Tahoma", Font.PLAIN, 14));
        panel.add(date);


        JLabel labelDeposite = new JLabel("Deposite :");
        labelDeposite.setBounds(35,310,200,14);
        labelDeposite.setForeground(Color.WHITE);
        labelDeposite.setFont(new Font("Tahoma", Font.PLAIN, 14));
        panel.add(labelDeposite);
        TextDeposite = new JTextField();
        TextDeposite.setBounds(271,310,150,20);
        panel.add(TextDeposite);

        JLabel labelOccupation = new JLabel("Age :");
        labelOccupation.setBounds(35,340,200,14);
        labelOccupation.setForeground(Color.WHITE);
        labelOccupation.setFont(new Font("Tahoma", Font.PLAIN, 14));
        panel.add(labelOccupation);
        TextOccupation = new JTextField();
        TextOccupation.setBounds(271,340,150,20);
        panel.add(TextOccupation);

        JLabel labeldesease = new JLabel("Medical Issue :");
        labeldesease.setBounds(35,375,200,14);
        labeldesease.setForeground(Color.WHITE);
        labeldesease.setFont(new Font("Tahoma", Font.PLAIN, 14));
        panel.add(labeldesease);
        TextDeases = new JTextField();
        TextDeases.setBounds(271,375,150,20);
        panel.add(TextDeases);

        add = new JButton("ADD");
        add.setBounds(100,430,120,30);
        add.setForeground(Color.WHITE);
        add.setBackground(Color.BLACK);
        add.addActionListener(this);
        panel.add(add);

        back = new JButton("BACK");
        back.setBounds(260,430,120,30);
        back.setForeground(Color.WHITE);
        back.setBackground(Color.BLACK);
        back.addActionListener(this);
        panel.add(back);

        setLayout(null);
        setLocation(500,150);
        setSize(850,550);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == add){
            conn c = new conn();
            String radioBTn = null;
            if (r1.isSelected()){
                radioBTn = "Male";
            } else if (r2.isSelected()) {
                radioBTn = "Female";
            }

            String ID = (String)comboBox.getSelectedItem();
            String number =  textFieldNumber.getText();
            String name =  TextName.getText();
            String gender =  radioBTn;
            String Address =  TextCountry.getText();
            String room_no =  c1.getSelectedItem();
            String Date =  date.getText();
            String Deposite = TextDeposite.getText();
            String Age = TextOccupation.getText();
            String Medical_issue = TextDeases.getText();

            try {
                String createtable = "CREATE Table IF NOT EXISTS customer(ID char(25),Number char(25),name char(25),gender char(20), Address char(25),room_no char(14),Date char(50),Deposit char(30), Age char(20), Medical_issue char(60))" ;

                String q ="insert into customer values ('"+ID+"', '"+number+"','"+name+"','"+gender+"', '"+Address+"', '"+room_no+"', '"+Date+"', '"+Deposite+"','"+Age+"','"+Medical_issue+"')";
                String q1 = "update room set avalable = 'Occupied' where room = "+room_no;
                c.statement.executeUpdate(createtable);
                c.statement.executeUpdate(q);
                c.statement.executeUpdate(q1);
                JOptionPane.showMessageDialog(null, "added Successfully");
                setVisible(false);

            }catch (Exception E) {
                E.printStackTrace();
            }
        }else {
            setVisible(false);
        }


    }

    public static void main(String[] args) {
        new NewCustomer();
    }
}
