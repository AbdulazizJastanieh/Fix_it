import javax.swing.*;
import java.awt.*;

public class IW extends JFrame {

    JFrame frame = new JFrame();
    ImageIcon icon = new ImageIcon("logo.png");
    JLabel label = new JLabel("Incorrect email/password, reenter again");


    IW(){
        label.setBounds(20,70,500,50);
        label.setFont(new Font(null,Font.PLAIN,20));
        frame.setLayout(null);
        frame.setTitle("Fix it");
        frame.setSize(400, 200);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.getContentPane().setBackground(new Color(232, 214, 162));
        frame.setIconImage(icon.getImage());
        frame.add(label);



    }


}
