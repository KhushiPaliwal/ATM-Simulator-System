package org.example;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.ResultSet;
import java.sql.*;
import java.util.*;
import java.util.Date;

public class FastCash extends JFrame implements ActionListener {
    JButton withdraw1, withdraw2, withdraw5, withdraw3, withdraw6, withdraw4, back;

    String pinnumber;

    FastCash(String pinnumber) {
        this.pinnumber = pinnumber;

        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900, 900, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 900, 900);
        add(image);

        JLabel text = new JLabel("Please select your Withdrawl Amount");
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System", Font.BOLD, 16));
        text.setBounds(210, 300, 700, 35);
        image.add(text);

        withdraw1 = new JButton("100");
        withdraw1.setBounds(170, 415, 150, 30);
        withdraw1.addActionListener(this);
        image.add(withdraw1);

        withdraw2 = new JButton("500");
        withdraw2.setBounds(355, 415, 150, 30);
        withdraw2.addActionListener(this);
        image.add(withdraw2);

        withdraw3 = new JButton("1000");
        withdraw3.setBounds(170, 450, 150, 30);
        withdraw3.addActionListener(this);
        image.add(withdraw3);

        withdraw4 = new JButton("2000");
        withdraw4.setBounds(355, 450, 150, 30);
        withdraw4.addActionListener(this);
        image.add(withdraw4);

        withdraw5 = new JButton("5000");
        withdraw5.setBounds(170, 485, 150, 30);
        withdraw5.addActionListener(this);
        image.add(withdraw5);

        withdraw6 = new JButton("10000");
        withdraw6.setBounds(355, 485, 150, 30);
        withdraw6.addActionListener(this);
        image.add(withdraw6);

        back = new JButton("Back");
        back.setBounds(355, 520, 150, 30);
        back.addActionListener(this);
        image.add(back);

        setSize(900, 900);
        setLocation(300, 0);
        setUndecorated(true);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == back) {
            setVisible(false);
            new Transactions(pinnumber).setVisible(true);
        } else {
           String amount = ((JButton)ae.getSource()).getText();
           connection c = new connection();
           try {
               ResultSet rs = c.s.executeQuery("select * from bank where pin = '" + pinnumber + "'");
               int balance = 0;
               while (rs.next()) {
                   if (rs.getString("type").equals("Deposit")) {
                       balance += Integer.parseInt(rs.getString("amount"));
                   } else {
                       balance -= Integer.parseInt(rs.getString(("amount")));
                   }
               }
               if(ae.getSource() != back && balance < Integer.parseInt(amount))
               {
                   JOptionPane.showMessageDialog(null, "Insufficient balance");
                   return;
               }

               Date date = new Date();
               String query = "insert into bank values('"+pinnumber+"', '"+date+"', 'Withdrawl', '"+amount+"')";
               c.s.executeUpdate(query);
               JOptionPane.showMessageDialog(null, "Rs "+ amount + " Debited Sucessfully");

               setVisible(false);
               new Transactions(pinnumber).setVisible(true);
           }
           catch (Exception e){
               System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        new FastCash("");
    }


}
