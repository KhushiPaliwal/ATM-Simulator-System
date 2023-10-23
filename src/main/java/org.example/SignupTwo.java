package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SignupTwo extends JFrame implements ActionListener {
    JTextField panTextField, aadharTextField;
    JButton next;
    JRadioButton seniorCitizenYes, seniorCitizenNo, eYes, eNo;

    String formNo;

    JComboBox religion, category, income, education, occupation;
    SignupTwo(String formno)
    {
        this.formNo = formno;
        setLayout(null);

        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");

        JLabel additionalDetails = new JLabel("Page 2: Additional Details");
        additionalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        additionalDetails.setBounds(290, 80, 400, 30);
        add(additionalDetails);

        JLabel Religion = new JLabel("Religion:");
        Religion.setFont(new Font("Raleway", Font.BOLD, 22));
        Religion.setBounds(100, 140, 100, 30);
        add(Religion);

        String valReligion[] = {"Hindu", "Muslim", "Sikkh", "Christian"};
        religion = new JComboBox(valReligion);
        religion.setBounds(300, 140, 400, 30);
        religion.setBackground(Color.WHITE);
        add(religion);

        JLabel Category = new JLabel("Category");
        Category.setFont(new Font("Raleway", Font.BOLD, 20));
        Category.setBounds(100, 190, 200, 30);
        add(Category);

        String valCategory[] = {"General", "OBC", "ST", "SC", "Other"};
        category = new JComboBox(valCategory);
        category.setBounds(300, 190, 400, 30);
        category.setBackground(Color.WHITE);
        add(category);

        JLabel Income = new JLabel("Income:");
        Income.setFont(new Font("Raleway", Font.BOLD, 20));
        Income.setBounds(100, 240, 400, 30);
        add(Income);

        String valIncome[] = {"Null", " < 1, 50, 000", "< 2, 50, 000", "5, 00, 000", "Upto 10, 00, 000"};
        income = new JComboBox(valIncome);
        income.setBounds(300, 240, 400, 30);
        income.setBackground(Color.WHITE);
        add(income);

        JLabel Education = new JLabel("Educational");
        Education.setFont(new Font("Raleway", Font.BOLD, 20));
        Education.setBounds(100, 290, 200, 30);
        add(Education);

        JLabel Qualification = new JLabel("Qualification:");
        Qualification.setFont(new Font("Raleway", Font.BOLD, 20));
        Qualification.setBounds(100, 320, 200, 30);
        add(Qualification);

        String valEducation[] = {"Non-Graduate", "Graduate", "Post-Graduate", "Doctorate", "Other"};
        education = new JComboBox(valEducation);
        education.setBounds(300, 320, 400, 30);
        education.setBackground(Color.WHITE);
        add(education);

        JLabel Occupation = new JLabel("Occupation:");
        Occupation.setFont(new Font("Raleway", Font.BOLD, 20));
        Occupation.setBounds(100, 370, 200, 30);
        add(Occupation);

        String valOccupation[] = {"Salaried", "Self- Employed", "Business", "Student"};
        occupation = new JComboBox(valOccupation);
        occupation.setBounds(300, 370, 400, 30);
        occupation.setBackground(Color.WHITE);
        add(occupation);

        JLabel panno = new JLabel("PAN Number:");
        panno.setFont(new Font("Raleway", Font.BOLD, 20));
        panno.setBounds(100, 420, 200, 30);
        add(panno);

        panTextField = new JTextField();
        panTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        panTextField.setBounds(300, 420, 400, 30);
        add(panTextField);

        JLabel aadhar = new JLabel("Aadhar Number:");
        aadhar.setFont(new Font("Raleway", Font.BOLD, 20));
        aadhar.setBounds(100, 470, 200, 30);
        add(aadhar);

        aadharTextField = new JTextField();
        aadharTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        aadharTextField.setBounds(300, 470, 400, 30);
        add(aadharTextField);

        JLabel seniorCitizen = new JLabel("Senior Citizen:");
        seniorCitizen.setFont(new Font("Raleway", Font.BOLD, 20));
        seniorCitizen.setBounds(100, 520, 200, 30);
        add(seniorCitizen);

        seniorCitizenYes = new JRadioButton("Yes");
        seniorCitizenYes.setBackground(Color.WHITE);
        seniorCitizenYes.setBounds(300, 520, 100, 30);
        add(seniorCitizenYes);

        seniorCitizenNo = new JRadioButton("No");
        seniorCitizenNo.setBackground(Color.WHITE);
        seniorCitizenNo.setBounds(450, 520, 100, 30);
        add(seniorCitizenNo);

        ButtonGroup seniorcitizenGroup = new ButtonGroup();
        seniorcitizenGroup.add(seniorCitizenNo);
        seniorcitizenGroup.add(seniorCitizenYes);

        JLabel existingAcc = new JLabel("Existing Account:");
        existingAcc.setFont(new Font("Raleway", Font.BOLD, 20));
        existingAcc.setBounds(100, 570, 200, 30);
        add(existingAcc);

        eYes = new JRadioButton("Yes");
        eYes.setBackground(Color.WHITE);
        eYes.setBounds(300, 570, 100, 30);
        add(eYes);

        eNo = new JRadioButton("No");
        eNo.setBackground(Color.WHITE);
        eNo.setBounds(450, 570, 100, 30);
        add(eNo);

        ButtonGroup ExisitingAccGroup = new ButtonGroup();
        ExisitingAccGroup.add(seniorCitizenNo);
        ExisitingAccGroup.add(eYes);

        next = new JButton ("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBounds(600, 660, 80, 30);
        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(Color.WHITE);
        setSize(850, 800);
        setLocation(350, 10);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae)
    {
        String sreligion = (String) religion.getSelectedItem();
        String scategory = (String) category.getSelectedItem();
        String sincome = (String) income.getSelectedItem();
        String seducation = (String) education.getSelectedItem();
        String soccupation = (String)occupation.getSelectedItem();
        String sseniorCitizen = null;
        if(seniorCitizenYes.isSelected())
        {
            sseniorCitizen = "Yes";
        }

        else if(seniorCitizenNo.isSelected())
        {
            sseniorCitizen = "No";
        }


        String sexisting = null;
        if(eNo.isSelected())
        {
            sexisting = "No";
        }

        else if(eYes.isSelected())
        {
            sexisting = "Yes";
        }

        String span = panTextField.getText();
        String sadhar = aadharTextField.getText();

        try {
            connection c = new connection();
            String query = "insert into signuptwo values('"+formNo+"', '"+sreligion+"', '"+scategory+"', '"+sincome+"', '"+seducation+"', '"+soccupation+"', '"+sseniorCitizen+"', '"+sexisting+"', '"+span+"', '"+sadhar+"')";
            c.s.executeUpdate(query);

            setVisible(false);
            new SignupThree(formNo).setVisible(true);
        }

        catch (Exception e)
        {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        new SignupTwo("");
    }
}
