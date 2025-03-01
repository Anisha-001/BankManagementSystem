import java.awt.Color;
import java.awt.Font;
import java.util.Random;

import javax.swing.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

public class SignUpOne extends JFrame implements ActionListener {
    long random;
    JTextField nameTextField, fnameTextField, pincodeTextField, stateTextField, cityTextField, addressTextField,
            emailTextField;
    JButton next;
    JDateChooser dateChooser;
    JRadioButton male, female, other, married, Unmarried;

    SignUpOne() {
        setLayout(null);
        Random ram = new Random();
        random = Math.abs((ram.nextLong() % 9000L) + 1000L);
        JLabel formNo = new JLabel("Application Form No " + random);
        formNo.setFont(new Font("Raleway", Font.BOLD, 35));
        formNo.setBounds(140, 20, 600, 45);
        add(formNo);

        JLabel PersnalDetail = new JLabel("Page-1 Personal Details ");
        PersnalDetail.setFont(new Font("Raleway", Font.BOLD, 25));
        PersnalDetail.setBounds(200, 80, 600, 30);
        add(PersnalDetail);

        JLabel name = new JLabel("Name ");
        name.setFont(new Font("Raleway", Font.BOLD, 20));
        name.setBounds(100, 130, 100, 30);
        add(name);

        nameTextField = new JTextField();
        nameTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        nameTextField.setBounds(300, 130, 250, 30);
        add(nameTextField);

        JLabel fname = new JLabel("Father's Name ");
        fname.setFont(new Font("Raleway", Font.BOLD, 20));
        fname.setBounds(100, 170, 200, 30);
        add(fname);

        fnameTextField = new JTextField();
        fnameTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        fnameTextField.setBounds(300, 170, 250, 30);
        add(fnameTextField);

        JLabel dob = new JLabel("Date Of Birth");
        dob.setFont(new Font("Raleway", Font.BOLD, 20));
        dob.setBounds(100, 210, 200, 30);
        add(dob);

        dateChooser = new JDateChooser();
        dateChooser.setBounds(300, 210, 250, 30);
        dateChooser.setForeground(Color.BLACK);
        add(dateChooser);

        JLabel gender = new JLabel("Gender");
        gender.setFont(new Font("Raleway", Font.BOLD, 20));
        gender.setBounds(100, 250, 200, 30);
        add(gender);

        male = new JRadioButton("Male");
        male.setBounds(290, 250, 80, 20);
        male.setBackground(Color.WHITE);
        add(male);

        female = new JRadioButton("Female");
        female.setBounds(380, 250, 80, 20);
        female.setBackground(Color.WHITE);
        add(female);
        ButtonGroup group = new ButtonGroup();
        group.add(female);
        group.add(male);

        JLabel email = new JLabel("Email");
        email.setFont(new Font("Raleway", Font.BOLD, 20));
        email.setBounds(100, 290, 200, 30);
        add(email);

        emailTextField = new JTextField();
        emailTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        emailTextField.setBounds(300, 290, 250, 30);
        add(emailTextField);

        JLabel marital = new JLabel("Marital Status");
        marital.setFont(new Font("Raleway", Font.BOLD, 20));
        marital.setBounds(100, 330, 200, 30);
        add(marital);

        married = new JRadioButton("Married");
        married.setBounds(290, 330, 80, 20);
        married.setBackground(Color.WHITE);
        add(married);

        Unmarried = new JRadioButton("UnMarried");
        Unmarried.setBounds(380, 330, 100, 20);
        Unmarried.setBackground(Color.WHITE);
        add(Unmarried);

        other = new JRadioButton("Other");
        other.setBounds(490, 330, 150, 20);
        other.setBackground(Color.WHITE);
        add(other);

        ButtonGroup maritalgroup = new ButtonGroup();
        maritalgroup.add(married);
        maritalgroup.add(Unmarried);
        maritalgroup.add(other);

        JLabel address = new JLabel("Address");
        address.setFont(new Font("Raleway", Font.BOLD, 20));
        address.setBounds(100, 370, 200, 30);
        add(address);

        addressTextField = new JTextField();
        addressTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        addressTextField.setBounds(300, 370, 250, 30);
        add(addressTextField);

        JLabel city = new JLabel("City");
        city.setFont(new Font("Raleway", Font.BOLD, 20));
        city.setBounds(100, 410, 200, 30);
        add(city);

        cityTextField = new JTextField();
        cityTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        cityTextField.setBounds(300, 410, 250, 30);
        add(cityTextField);

        JLabel state = new JLabel("State");
        state.setFont(new Font("Raleway", Font.BOLD, 20));
        state.setBounds(100, 450, 200, 30);
        add(state);

        stateTextField = new JTextField();
        stateTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        stateTextField.setBounds(300, 450, 250, 30);
        add(stateTextField);

        JLabel pincode = new JLabel("Pin Code");
        pincode.setFont(new Font("Raleway", Font.BOLD, 20));
        pincode.setBounds(100, 490, 200, 30);
        add(pincode);

        pincodeTextField = new JTextField();
        pincodeTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        pincodeTextField.setBounds(300, 490, 250, 30);
        add(pincodeTextField);

        next = new JButton("Next");
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setForeground(Color.WHITE);
        next.setBackground(Color.BLACK);
        next.setBounds(570, 550, 70, 25);
        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(Color.WHITE);
        setSize(850, 700);
        setLocation(350, 10);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae){
        String formno = "" + random; //long
        String name = nameTextField.getText();
        String fname = fnameTextField.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(male.isSelected()){
            gender = "Male";
        }else if(female.isSelected()){
            gender = "Female";
        }

        String email = emailTextField.getText();
        String marital = null;
        if(married.isSelected()){
            marital = "Married";
        }else if(Unmarried.isSelected()){
            marital = "Unmarried";
        }else if(other.isSelected()){
            marital= "Other";
        }

        String address = addressTextField.getText();
        String city = cityTextField.getText();
        String state = stateTextField.getText();
        String pincode = pincodeTextField.getText();

        try{
            if(name.equals("")){
                JOptionPane.showMessageDialog(null,"Name is Required");
            }else {
                conn c = new conn();
                String query = "insert into signup values('"+formno+"', '"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+pincode+"','"+state+"')";
                c.s.executeUpdate(query);
            }
        } catch(Exception e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        new SignUpOne();
    }
}
