package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class SignupThree extends JFrame implements ActionListener {

    JRadioButton r1, r2, r3, r4;
    JCheckBox c1, c2, c3, c4, c5, c6, c7;

    JButton submit, cancel;
    String formNo;

    SignupThree(String formNo)
    {
        this.formNo = formNo;
        setLayout(null);

        JLabel l1 = new JLabel("Page 3 : Account Details");
        l1.setFont(new Font("Raleway", Font.BOLD, 22));
        l1.setBounds(280, 40, 400, 40);
        add(l1);

        JLabel type = new JLabel("Page 3 : Account Type");
        type.setFont(new Font("Raleway", Font.BOLD, 22));
        type.setBounds(100, 140, 200, 30);
        add(type);

        r1 = new JRadioButton("Saving Account");
        r1.setBounds(100, 180, 150, 20);
        r1.setBackground(Color.WHITE);
        r1.setFont(new Font("Raleway", Font.BOLD, 16 ));
        add(r1);

        r2 = new JRadioButton("Fixed Deposit Account");
        r2.setBounds(350, 180, 250, 20);
        r2.setBackground(Color.WHITE);
        r2.setFont(new Font("Raleway", Font.BOLD, 16 ));
        add(r2);

        r3 = new JRadioButton("Current Account");
        r3.setBounds(100, 220, 250, 20);
        r3.setBackground(Color.WHITE);
        r3.setFont(new Font("Raleway", Font.BOLD, 16 ));
        add(r3);

        r4 = new JRadioButton("Saving Account");
        r4.setBounds(350, 220, 250, 20);
        r4.setBackground(Color.WHITE);
        r4.setFont(new Font("Raleway", Font.BOLD, 16 ));
        add(r4);

        ButtonGroup groupaccount = new ButtonGroup();
        groupaccount.add(r1);
        groupaccount.add(r2);
        groupaccount.add(r3);
        groupaccount.add(r4);

        JLabel cardno = new JLabel("Card Number:");
        cardno.setFont(new Font("Raleway", Font.BOLD, 22));
        cardno.setBounds(100, 300, 200, 30);
        add(cardno);

        JLabel number = new JLabel("XXXX-XXXX-XXXX-4184");
        number.setFont(new Font("Raleway", Font.BOLD, 22));
        number.setBounds(330, 300, 300, 30);
        add(number);

        JLabel info = new JLabel("Your 16 Digit Card Number");
        info.setFont(new Font("Raleway", Font.BOLD, 12));
        info.setBounds(100, 330, 300, 15);
        add(info);

        JLabel pin = new JLabel("Pin:");
        pin.setFont(new Font("Raleway", Font.BOLD, 22));
        pin.setBounds(100, 370, 200, 30);
        add(pin);

        JLabel pnumber = new JLabel("XXXX");
        pnumber.setFont(new Font("Raleway", Font.BOLD, 22));
        pnumber.setBounds(330, 370, 300, 30);
        add(pnumber);

        JLabel info2 = new JLabel("Your 4 Digit Pin");
        info2.setFont(new Font("Raleway", Font.BOLD, 12));
        info2.setBounds(100, 400, 300, 15);
        add(info2);

        JLabel services = new JLabel("Services Required:");
        services.setFont(new Font("Raleway", Font.BOLD, 20));
        services.setBounds(100, 450, 250, 30);
        add(services);

        c1 = new JCheckBox("ATM CARD");
        c1.setBackground(Color.WHITE);
        c1.setFont(new Font("Raleway", Font.BOLD, 16));
        c1.setBounds(100, 500, 200, 30);
        add(c1);

        c2 = new JCheckBox("Internet Banking");
        c2.setBackground(Color.WHITE);
        c2.setFont(new Font("Raleway", Font.BOLD, 16));
        c2.setBounds(350, 500, 200, 30);
        add(c2);

        c3 = new JCheckBox("Mobile Banking");
        c3.setBackground(Color.WHITE);
        c3.setFont(new Font("Raleway", Font.BOLD, 16));
        c3.setBounds(100, 550, 200, 30);
        add(c3);

        c4 = new JCheckBox("Email & SMS Alerts");
        c4.setBackground(Color.WHITE);
        c4.setFont(new Font("Raleway", Font.BOLD, 16));
        c4.setBounds(350, 550, 200, 30);
        add(c4);

        c5 = new JCheckBox("Cheque Book");
        c5.setBackground(Color.WHITE);
        c5.setFont(new Font("Raleway", Font.BOLD, 16));
        c5.setBounds(100, 600, 200, 30);
        add(c5);

        c6 = new JCheckBox("E-Statement");
        c6.setBackground(Color.WHITE);
        c6.setFont(new Font("Raleway", Font.BOLD, 16));
        c6.setBounds(350, 600, 200, 30);
        add(c6);

        c7 = new JCheckBox("I hereby declare that the above entered details are correct to the best of knowledge");
        c7.setBackground(Color.WHITE);
        c7.setFont(new Font("Raleway", Font.BOLD, 12));
        c7.setBounds(100, 680, 600, 30);
        add(c7);

        submit = new JButton("Submit");
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.setFont(new Font("Railway", Font.BOLD, 14));
        submit.setBounds(200, 730, 100, 30);
        submit.addActionListener(this);
        add(submit);

        cancel = new JButton("Cancel");
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.setFont(new Font("Raleway", Font.BOLD, 14));
        cancel.setBounds(400, 730, 100, 30);
        cancel.addActionListener(this);
        add(cancel);

        getContentPane().setBackground(Color.WHITE);

        setSize(850, 820);
        setLocation(350, 100);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae)
    {
        String accountType = null;
        Random random = new Random();
        String cardnumber = "" +  Math.abs((random.nextLong() % 90000000L) + 504093600000000L);
        String pinnumber = "" + Math.abs((random.nextLong() % 9000L)+ 1000L);
        String facility = "";
        if(ae.getSource() == submit)
        {
            if(r1.isSelected())
            {
                accountType = "Saving Account";
            }
            else if(r2.isSelected())
            {
                accountType = "Fixed Deposit Account";
            }
            else if(r3.isSelected())
            {
                accountType = "Current Account";
            }
            else if(r4.isSelected())
            {
                accountType = "Reccuring Deposit Account";
            }

            if(c1.isSelected())
            {
                facility = facility + " ATM Card";
            }
            else if(c2.isSelected())
            {
                facility = facility + " Internet Banking";
            }
            else if(c3.isSelected())
            {
                facility = facility + " Mobile Banking";
            }
            else if(c4.isSelected())
            {
                facility = facility + " Email & SMS Alerts";
            }
            else if(c5.isSelected())
            {
                facility = facility + " Cheque Book";
            }
            else if(c6.isSelected())
            {
                facility = facility + " E-Statement";
            }

            try
            {
                if(accountType.equals(""))
                {
                    JOptionPane.showMessageDialog(null, "Account Type is Required");
                }
                else {
                    connection c = new connection();
                    String query1 = "insert into signupthree values('"+formNo+"', '"+accountType+"', '"+cardnumber+"', '"+pinnumber+"', '"+facility+"')";
                    String query2 = "insert into login values('"+formNo+"', '"+cardnumber+"', '"+pinnumber+"')";
                    c.s.executeUpdate(query1);
                    c.s.executeUpdate(query2);

                    JOptionPane.showMessageDialog(null, "Card Number: " + cardnumber + "\n Pin: " + pinnumber);
                    setVisible(false);
                    new Deposit(pinnumber).setVisible(false);
                }
            } catch (Exception e)
            {
                System.out.println(e);
            }
        }



        else if(ae.getSource() == cancel)
        {
            setVisible(false);
            new Login().setVisible(true);
        }
    }

    public static void main(String[] args) {
        new SignupThree("");
    }

}
