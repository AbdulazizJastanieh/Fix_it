import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Separator implements ActionListener {


    JFrame frame = new JFrame();
    JLabel label = new JLabel("You are a...");
    JButton button = new JButton();
    JButton button2 = new JButton();
    ImageIcon icon = new ImageIcon("logo.png");

    Separator(){

        label.setBounds(175,100,150,50);
        label.setFont(new Font(null, Font.PLAIN,30));

        button.setBounds(125,200,100,50);
        button.setText("Worker");
        button.setBackground(new Color(70, 97, 61));
        button.setForeground(new Color(245, 245, 245));
        button.setFocusable(false);
        button.addActionListener(this);
        button2.setBounds(275,200,100,50);
        button2.setText("Customer");
        button2.setBackground(new Color(70, 97, 61));
        button2.setForeground(new Color(245, 245, 245));
        button2.setFocusable(false);
        button2.addActionListener(this);

        frame.setLayout(null);
        frame.setTitle("Fix it");
        frame.setSize(500, 400);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.getContentPane().setBackground(new Color(232, 214, 162));
        frame.setIconImage(icon.getImage());
        frame.add(label);
        frame.add(button);
        frame.add(button2);


    }


    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource()==button2) {
            frame.dispose();
            Login_Cus cus = new Login_Cus();
        }

        if (e.getSource()==button){
            frame.dispose();
            Login_Wor wor = new Login_Wor();
        }

    }
}
