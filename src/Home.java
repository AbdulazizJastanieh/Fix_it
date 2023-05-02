import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Home extends JFrame implements ActionListener {

    JFrame frame = new JFrame();
    ImageIcon icon = new ImageIcon("logo2.png");
    ImageIcon profile = new ImageIcon("profile.png");
    ImageIcon wallet = new ImageIcon("wallet.png");
    ImageIcon orders = new ImageIcon("orders.png");
    ImageIcon services = new ImageIcon("services.png");
    JPanel panel = new JPanel();
    JPanel panel2 = new JPanel();
    JPanel panel3 = new JPanel();
    JLabel label = new JLabel();
    JLabel label2 = new JLabel("Fix it");
    JButton button = new JButton();
    JButton button2 = new JButton();
    JButton button3 = new JButton();
    JButton button4 = new JButton();


    Home(){
        label.setIcon(icon);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label2.setFont(new Font(null,Font.PLAIN,100));
        label2.setForeground(new Color(232, 214, 162));

        panel.setBounds(0, 0, 150, 125);
        panel.setBackground(new Color(70, 97, 61));
        panel2.setBounds(150,0,550,125);
        panel2.setBackground(new Color(76, 102, 67));
        panel3.setBounds(0,125,150,800);
        panel3.setBackground(new Color(76, 102, 67));
        panel3.setLayout(null);

        button.setText("profile");
        button.setBackground(new Color(70, 97, 61));
        button.setForeground(new Color(245, 245, 245));
        button.setFocusable(false);
        button.addActionListener(this);
        button.setIcon(profile);
        button.setBounds(20,30,100,100);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setHorizontalTextPosition(JButton.CENTER);

        button2.setText("services");
        button2.setBackground(new Color(70, 97, 61));
        button2.setForeground(new Color(245, 245, 245));
        button2.setFocusable(false);
        button2.addActionListener(this);
        button2.setIcon(services);
        button2.setBounds(20,150,100,100);
        button2.setVerticalTextPosition(JButton.BOTTOM);
        button2.setHorizontalTextPosition(JButton.CENTER);

        button3.setText("orders");
        button3.setBackground(new Color(70, 97, 61));
        button3.setForeground(new Color(245, 245, 245));
        button3.setFocusable(false);
        button3.addActionListener(this);
        button3.setIcon(orders);
        button3.setBounds(20,270,100,100);
        button3.setVerticalTextPosition(JButton.BOTTOM);
        button3.setHorizontalTextPosition(JButton.CENTER);

        button4.setText("wallet");
        button4.setBackground(new Color(70, 97, 61));
        button4.setForeground(new Color(245, 245, 245));
        button4.setFocusable(false);
        button4.addActionListener(this);
        button4.setIcon(wallet);
        button4.setBounds(20,400,100,100);
        button4.setVerticalTextPosition(JButton.BOTTOM);
        button4.setHorizontalTextPosition(JButton.CENTER);

        frame.setLayout(null);
        frame.setTitle("Fix it");
        frame.setSize(700, 800);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.getContentPane().setBackground(new Color(232, 214, 162));
        frame.setIconImage(icon.getImage());
        panel.add(label);
        panel3.add(button);
        panel3.add(button2);
        panel3.add(button3);
        panel3.add(button4);
        panel2.add(label2);
        frame.add(panel);
        frame.add(panel2);
        frame.add(panel3);

    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

    }
}
