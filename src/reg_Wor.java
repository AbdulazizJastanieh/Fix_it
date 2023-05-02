import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class reg_Wor extends JFrame implements ActionListener {


    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    JLabel label = new JLabel();
    JLabel label2 = new JLabel("First name");
    JLabel label3 = new JLabel("Last name");
    JLabel label4 = new JLabel("Phone ");
    JLabel label5 = new JLabel("Email");
    JLabel label6 = new JLabel("Password");
    JLabel label7 = new JLabel("working area");
    JLabel label8 = new JLabel("Ready?");
    JButton button = new JButton();
    TextField text = new TextField();
    TextField text2 = new TextField();
    TextField text3 = new TextField();
    TextField text4 = new TextField();
    TextField text5 = new TextField();
    TextField text6 = new TextField();
    TextField text7 = new TextField();
    ImageIcon icon = new ImageIcon("logo.png");
    ImageIcon image = new ImageIcon("logo.png");

    reg_Wor() {

        label.setIcon(image);
        label.setText("Worker Registration");
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.BOTTOM);
        label.setForeground(new Color(232, 214, 162));
        label.setFont(new Font("MV Boli", Font.PLAIN, 40));
        label2.setBounds(100, 400, 100, 50);
        label2.setFont(new Font("", Font.PLAIN, 20));
        label3.setBounds(100, 475, 100, 50);
        label3.setFont(new Font("", Font.PLAIN, 20));
        label4.setBounds(100, 550, 100, 50);
        label4.setFont(new Font("", Font.PLAIN, 20));
        label5.setBounds(100, 625, 100, 50);
        label5.setFont(new Font("", Font.PLAIN, 20));
        label6.setBounds(100,700,100,50);
        label6.setFont(new Font("",Font.PLAIN,20));
        label7.setBounds(100,775,120,50);
        label7.setFont(new Font("",Font.PLAIN,20));
        label8.setBounds(275,860,100,50);



        panel.setBounds(0, 0, 600, 350);
        panel.setBackground(new Color(70, 97, 61));


        text.setBounds(250, 420, 200, 20);
        text2.setBounds(250, 495, 200, 20);
        text3.setBounds(250, 570, 200, 20);
        text4.setBounds(250, 645, 200, 20);
        text5.setBounds(250, 720, 200, 20);
        text6.setBounds(250, 795, 200, 20);


        button.setBounds(250, 900, 100, 50);
        button.setText("I'm ready");
        button.setBackground(new Color(70, 97, 61));
        button.setForeground(new Color(245, 245, 245));
        button.setFocusable(false);




        frame.setLayout(null);
        frame.setTitle("Fix it");
        frame.setSize(600, 1000);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.getContentPane().setBackground(new Color(232, 214, 162));
        frame.setIconImage(icon.getImage());
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
        frame.add(button);


    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

    }
}
