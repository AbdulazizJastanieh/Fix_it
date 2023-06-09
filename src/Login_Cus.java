import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//v1
public class Login_Cus extends JFrame implements ActionListener {

    // creating frame, buttons, labels, and images objects

    //frame
    JFrame frame = new JFrame();

    //panels
    JPanel panel = new JPanel();

    //labels
    JLabel label = new JLabel();
    JLabel label2 = new JLabel("Don't have an account?");
    JLabel label3 = new JLabel("Already have an account?");
    JLabel label4 = new JLabel("Username");
    JLabel label5 = new JLabel("Password");
    JLabel label6 = new JLabel("Welcome Customer");

    //images
    ImageIcon image = new ImageIcon("logo.png");
    ImageIcon icon = new ImageIcon("logo.png");

    //buttons
    JButton register = new JButton();
    JButton login = new JButton();

    //text fields
    TextField text = new TextField();
    TextField text2 = new TextField();

    Login_Cus() {
        //text fields settings
        text.setBounds(500, 515, 200, 20);
        text2.setBounds(500, 565, 200, 20);

        //panels settings
        panel.setBounds(0, 0, 1000, 400);
        panel.setBackground(new Color(70, 97, 61));

        //labels settings
        label.setIcon(image);
        label.setText("Need help Finding a worker?");
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.BOTTOM);
        label.setForeground(new Color(232, 214, 162));
        label.setFont(new Font("MV Boli", Font.PLAIN, 40));
        label2.setBounds(330, 640, 150, 50);
        label3.setBounds(500, 640, 150, 50);
        label4.setBounds(330, 500, 100, 50);
        label4.setFont(new Font("", Font.PLAIN, 20));
        label5.setBounds(330, 550, 100, 50);
        label5.setFont(new Font("", Font.PLAIN, 20));
        label6.setBounds(360,435,300,50);
        label6.setFont(new Font("",Font.PLAIN,30));

        //buttons settings
        register.setBounds(350, 680, 100, 50);
        register.setText("Register");
        register.setBackground(new Color(70, 97, 61));
        register.setForeground(new Color(245, 245, 245));
        register.setFocusable(false);
        register.addActionListener(this);
        login.setBounds(520, 680, 100, 50);
        login.setText("Login");
        login.setBackground(new Color(70, 97, 61));
        login.setForeground(new Color(245, 245, 245));
        login.setFocusable(false);
        login.addActionListener(this);

        //frame setting and adding buttons, labels, panels, and text fields
        frame.setLayout(null);
        frame.setTitle("Fix it");
        frame.setSize(1000, 800);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.getContentPane().setBackground(new Color(232, 214, 162));
        frame.setIconImage(icon.getImage());

        //adding to the panel
        panel.add(label);

        //adding to the frame
        frame.add(panel);
        frame.add(register);
        frame.add(login);
        frame.add(label2);
        frame.add(label3);
        frame.add(label4);
        frame.add(label5);
        frame.add(label6);
        frame.add(text);
        frame.add(text2);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==register) { //this is for altsgil page
            frame.dispose();
            // call customer register interface
            new reg_Cus();
        }

        if (e.getSource()==login){
            String username = text.getText();
            String pass = text2.getText();
                Customer customer = Customer.LoginCustomer(username,pass);
                if (Customer.LoginCustomer(username, pass) != null) {
                    new Home(customer);
                    frame.dispose();
                } else {
                    new IW(); //warning massage !

                }

            }


    }

}
