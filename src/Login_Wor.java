import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login_Wor extends JFrame implements ActionListener {

    JFrame frame = new JFrame();
    JPanel panel = new JPanel();

    JLabel label = new JLabel();
    JLabel label2 = new JLabel("Don't have an account?");
    JLabel label3 = new JLabel("Already have an account?");
    JLabel label4 = new JLabel("Email");
    JLabel label5 = new JLabel("Password");
    JLabel label6 = new JLabel("Welcome Worker");
    ImageIcon image = new ImageIcon("logo.png");
    ImageIcon icon = new ImageIcon("logo.png");
    JButton button = new JButton();
    JButton button2 = new JButton();
    TextField text = new TextField();
    TextField text2 = new TextField();

    Login_Wor() {

        text.setBounds(500, 515, 200, 20);
        text2.setBounds(500, 565, 200, 20);


        panel.setBounds(0, 0, 1000, 400);
        panel.setBackground(new Color(70, 97, 61));


        label.setIcon(image);
        label.setText("Want to join our community?");
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


        button.setBounds(350, 680, 100, 50);
        button.setText("Register");
        button.setBackground(new Color(70, 97, 61));
        button.setForeground(new Color(245, 245, 245));
        button.setFocusable(false);
        button.addActionListener(this);
        button2.setBounds(520, 680, 100, 50);
        button2.setText("Login");
        button2.setBackground(new Color(70, 97, 61));
        button2.setForeground(new Color(245, 245, 245));
        button2.setFocusable(false);
        button2.addActionListener(this);



        frame.setLayout(null);
        frame.setTitle("Fix it");
        frame.setSize(1000, 800);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.getContentPane().setBackground(new Color(232, 214, 162));
        frame.setIconImage(icon.getImage());
        panel.add(label);
        frame.add(panel);
        frame.add(button);
        frame.add(button2);
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
        if (e.getSource()==button) {
            frame.dispose();
             new reg_Wor();
        }

    }
}
