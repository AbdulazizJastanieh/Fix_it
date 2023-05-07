import javax.swing.*;
import java.awt.*;
//v1
public class IW extends JFrame {

    JFrame frame = new JFrame();
    ImageIcon icon = new ImageIcon("logo.png");
    JLabel label = new JLabel();


    IW(){
        label.setText("Incorrect email/password, reenter again");
        label.setBounds(20,70,500,50);
        label.setFont(new Font(null,Font.PLAIN,20));
        frame.setLayout(null);
        frame.setTitle("Fix it");
        frame.setSize(400, 200);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.getContentPane().setBackground(new Color(232, 214, 162));
        frame.setIconImage(icon.getImage());
        frame.add(label);



    }

    IW(int x){
        label.setText("Please choose a service first");
        label.setBounds(20,70,500,50);
        label.setFont(new Font(null,Font.PLAIN,20));
        frame.setLayout(null);
        frame.setTitle("Fix it");
        frame.setSize(400, 200);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.getContentPane().setBackground(new Color(232, 214, 162));
        frame.setIconImage(icon.getImage());
        frame.add(label);

    }

    IW(double x){
        label.setText("Please choose a worker before confirm");
        label.setBounds(20,70,500,50);
        label.setFont(new Font(null,Font.PLAIN,20));
        frame.setLayout(null);
        frame.setTitle("Fix it");
        frame.setSize(400, 200);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.getContentPane().setBackground(new Color(232, 214, 162));
        frame.setIconImage(icon.getImage());
        frame.add(label);

    }

    IW(String  x){
        label.setText("Please fill all text fields");
        label.setBounds(20,70,500,50);
        label.setFont(new Font(null,Font.PLAIN,20));
        frame.setLayout(null);
        frame.setTitle("Fix it");
        frame.setSize(400, 200);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.getContentPane().setBackground(new Color(232, 214, 162));
        frame.setIconImage(icon.getImage());
        frame.add(label);

    }



}
