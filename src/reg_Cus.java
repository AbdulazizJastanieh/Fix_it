import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class reg_Cus extends JFrame implements ActionListener {
    JFrame frame = new JFrame();                    // Create a new JFrame
    JPanel panel = new JPanel();                    // Create a new JPanel
    JLabel label = new JLabel();                    // Create a new JLabel
    JLabel label2 = new JLabel("First name");        // Create a new JLabel with text "First name"
    JLabel label3 = new JLabel("Last name");         // Create a new JLabel with text "Last name"
    JLabel label4 = new JLabel("Phone ");            // Create a new JLabel with text "Phone"
    JLabel label5 = new JLabel("Email");             // Create a new JLabel with text "Email"
    JLabel label6 = new JLabel("Password");          // Create a new JLabel with text "Password"
    JLabel label7 = new JLabel("Location");          // Create a new JLabel with text "Location"
    JLabel label8 = new JLabel("Ready?");            // Create a new JLabel with text "Ready?"
    JButton ready = new JButton();                  // Create a new JButton
    TextField text = new TextField();                // Create a new TextField
    TextField text2 = new TextField();               // Create a new TextField
    TextField text3 = new TextField();               // Create a new TextField
    TextField text4 = new TextField();               // Create a new TextField
    TextField text5 = new TextField();               // Create a new TextField
    TextField text6 = new TextField();               // Create a new TextField
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
        label2.setBounds(100, 400, 100, 50);
        label2.setFont(new Font("", Font.PLAIN, 20));
        label3.setBounds(100, 475, 100, 50);
        label3.setFont(new Font("", Font.PLAIN, 20));
        label4.setBounds(100, 550, 100, 50);
        label4.setFont(new Font("", Font.PLAIN, 20));
        label5.setBounds(100, 625, 100, 50);
        label5.setFont(new Font("", Font.PLAIN, 20));
        label6.setBounds(100, 700, 100, 50);
        label6.setFont(new Font("", Font.PLAIN, 20));
        label7.setBounds(100, 775, 100, 50);
        label7.setFont(new Font("", Font.PLAIN, 20));
        label8.setBounds(275, 860, 100, 50);

        // Set properties for the panel
        panel.setBounds(0, 0, 600, 350);
        panel.setBackground(new Color(70, 97, 61));

        // Set properties for the text fields
        text.setBounds(250, 420, 200, 20);
        text2.setBounds(250, 495, 200, 20);
        text3.setBounds(250, 570, 200, 20);
        text4.setBounds(250, 645, 200, 20);
        text5.setBounds(250, 720, 200, 20);
        text6.setBounds(250, 795, 200, 20);

        // Set properties for the button
        ready.setBounds(250, 900, 100, 50);
        ready.setText("I'm ready");
        ready.setBackground(new Color(70, 97, 61));
        ready.setForeground(new Color(245, 245, 245));
        ready.setFocusable(false);

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
        frame.add(text);
        frame.add(text2);
        frame.add(text3);
        frame.add(text4);
        frame.add(text5);
        frame.add(text6);
        frame.add(ready);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        /*
       if ((e.getSource() == ready)){

           if ((text != null)&&(text2 != null)&&(text3 != null)&&(text4 != null)&&(text5 != null)&&(text6 != null)){

               //need some changes AJ
               Customer cus = new Customer.RegisterCustomer();

               new Home(cus);

           }else{
               new IW();
           }

       }
       */
    }


}

