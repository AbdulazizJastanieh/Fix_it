import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class reg_Cus extends JFrame implements ActionListener {
    JFrame frame = new JFrame();                    // Create a new JFrame
    JPanel panel = new JPanel();                    // Create a new JPanel
    JLabel label = new JLabel();                    // Create a new JLabel
    JLabel label2 = new JLabel("First name");        // Create a new JLabel with text "First name"
    JLabel label3 = new JLabel("Last name");         // Create a new JLabel with text "Last name"
    JLabel label4 = new JLabel("Phone ");            // Create a new JLabel with text "Phone"
    JLabel label5 = new JLabel("Username");             // Create a new JLabel with text "Email"
    JLabel label6 = new JLabel("Password");          // Create a new JLabel with text "Password"
    JLabel label7 = new JLabel("Location");          // Create a new JLabel with text "Location"
    JLabel label8 = new JLabel("Ready?");              // Create a new JLabel with text "Ready?"
    JLabel label10 = new JLabel("Date of birth");
    JLabel label11 = new JLabel("D");
    JLabel label12 = new JLabel("M");
    JLabel label13 = new JLabel("Y");
    JButton ready = new JButton();                  // Create a new JButton
    TextField text = new TextField();                // Create a new TextField
    TextField text2 = new TextField();               // Create a new TextField
    TextField text3 = new TextField();               // Create a new TextField
    TextField text4 = new TextField();               // Create a new TextField
    TextField text5 = new TextField();               // Create a new TextField
    TextField text6 = new TextField();
    TextField text7 = new TextField();
    TextField text8 = new TextField();
    TextField text9 = new TextField();
    ImageIcon icon = new ImageIcon("logo.png");      // Create a new ImageIcon with the file name "logo.png"
    ImageIcon image = new ImageIcon("logo.png");     // Create a new ImageIcon with the file name "logo.png"

    reg_Cus() {
        // Set properties for the label
        label.setIcon(image);
        label.setText("Custom Registration");
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.BOTTOM);
        label.setForeground(new Color(232, 214, 162));
        label.setFont(new Font("MV Boli", Font.PLAIN, 40));

        // Set properties for the other labels
        label2.setBounds(60, 360, 100, 50);
        label2.setFont(new Font("", Font.PLAIN, 20));
        label3.setBounds(60, 420, 100, 50);
        label3.setFont(new Font("", Font.PLAIN, 20));
        label4.setBounds(60, 485, 100, 50);
        label4.setFont(new Font("", Font.PLAIN, 20));
        label10.setBounds(60, 590, 200, 50);
        label10.setFont(new Font("", Font.PLAIN, 20));
        label11.setBounds(275, 580, 35, 20);
        label12.setBounds(345, 580, 35, 20);
        label13.setBounds(420, 580, 35, 20);
        label5.setBounds(60, 670, 100, 50);
        label5.setFont(new Font("", Font.PLAIN, 20));
        label6.setBounds(60, 740, 100, 50);
        label6.setFont(new Font("", Font.PLAIN, 20));
        label7.setBounds(60, 810, 100, 50);
        label7.setFont(new Font("", Font.PLAIN, 20));
        label8.setBounds(275, 860, 100, 50);

        // Set properties for the panel
        panel.setBounds(0, 0, 600, 350);
        panel.setBackground(new Color(70, 97, 61));

        // Set properties for the text fields
        text.setBounds(260, 380, 200, 20);
        text2.setBounds(260, 435, 200, 20);
        text3.setBounds(260, 500, 200, 20);
        text4.setBounds(260, 605, 35, 20);
        text5.setBounds(330, 605, 35, 20);
        text6.setBounds(400, 605, 70, 20);
        text7.setBounds(260,685,200,20);
        text8.setBounds(260,755,200,20);
        text9.setBounds(260,820,200,20);

        // Set properties for the button
        ready.setBounds(250, 900, 100, 50);
        ready.setText("I'm ready");
        ready.setBackground(new Color(70, 97, 61));
        ready.setForeground(new Color(245, 245, 245));
        ready.setFocusable(false);
        ready.addActionListener(this);
        // Set properties for the frame
        frame.setLayout(null);
        frame.setTitle("Fix it");
        frame.setSize(600, 1000);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.getContentPane().setBackground(new Color(232, 214, 162));
        frame.setIconImage(icon.getImage());

        // Add all the components to the frame
        panel.add(label);
        frame.add(panel);
        frame.add(label2);
        frame.add(label3);
        frame.add(label4);
        frame.add(label5);
        frame.add(label6);
        frame.add(label7);
        frame.add(label8);
        frame.add(label10);
        frame.add(label11);
        frame.add(label12);
        frame.add(label13);
        frame.add(text);
        frame.add(text2);
        frame.add(text3);
        frame.add(text4);
        frame.add(text5);
        frame.add(text6);
        frame.add(text7);
        frame.add(text8);
        frame.add(text9);
        frame.add(ready);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if ((e.getSource() == ready)){

           if ((text != null)&&(text2 != null)&&(text3 != null)&&(text4 != null)&&(text5 != null)&&(text6 != null)&&(text7 != null)&&(text8 != null)&&(text9 != null)){
               frame.dispose();
               int day = Integer.parseInt(text4.getText());
               int month = Integer.parseInt(text5.getText());
               int year = Integer.parseInt(text6.getText());
               Date DOB = new Date(day,month,year);
               Date currentDate = new Date(); // Get the current date
               long diffInMillies = Math.abs(currentDate.getTime() - DOB.getTime()); // Calculate the difference between the current date and the date of birth in milliseconds

               int age = (int) (diffInMillies / (365.25 * 24 * 60 * 60 * 1000)); // Convert the difference in milliseconds to age in years
               Customer cus = Customer.RegisterCustomer(text.getText(),text2.getText(),DOB,age,text3.getText(),text9.getText(),text7.getText(),text8.getText());
               new Home(cus);

           }else{
               new IW();
           }

       }



    }


}

