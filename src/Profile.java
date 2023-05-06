import javax.swing.*;
import java.awt.*;
import java.util.jar.JarEntry;

public class Profile extends JFrame {

    JFrame frameprofile = new JFrame();
    ImageIcon icon = new ImageIcon("logo2.png");

    JPanel panel = new JPanel();
    JPanel panel2 = new JPanel();

    JLabel label = new JLabel();
    JLabel labeltemp = new JLabel();
    JLabel labeltemp2 = new JLabel();
    JLabel labeltemp3 = new JLabel();
    JLabel labeltemp4 = new JLabel();
    JLabel labeltemp5 = new JLabel();

    Customer cus;
    Worker wor;

    Profile(Customer customer){

        this.cus = customer;

        panel.setBounds(0, 0, 150, 125);
        panel.setBackground(new Color(70, 97, 61));
        panel2.setBounds(150,0,550,125);
        panel2.setBackground(new Color(76, 102, 67));

        label.setIcon(icon);
        label.setHorizontalTextPosition(JLabel.LEFT);
        labeltemp.setText("Profile");
        labeltemp.setFont(new Font(null,Font.PLAIN,100));
        labeltemp.setForeground(new Color(232, 214, 162));

        labeltemp2 = new JLabel("Name: "+this.cus.getFirst_name()+" "+this.cus.getLast_name());
        labeltemp3 = new JLabel("Balance: "+this.cus.getBalance());
        labeltemp4 = new JLabel("Age: " + this.cus.getAge());
        labeltemp5 = new JLabel("Location: "+this.cus.getLocation());

        labeltemp2.setBounds(100,150,200,50);
        labeltemp2.setFont(new Font(null,Font.PLAIN,20));
        labeltemp3.setBounds(100,250,200,50);
        labeltemp3.setFont(new Font(null,Font.PLAIN,20));
        labeltemp4.setBounds(100,350,200,50);
        labeltemp4.setFont(new Font(null,Font.PLAIN,20));
        labeltemp5.setBounds(100,450,200,50);
        labeltemp5.setFont(new Font(null,Font.PLAIN,20));

        frameprofile.setLayout(null);
        frameprofile.setTitle("Fix it");
        frameprofile.setSize(600, 600);
        frameprofile.setResizable(false);
        frameprofile.setVisible(true);
        frameprofile.getContentPane().setBackground(new Color(232, 214, 162));
        frameprofile.setIconImage(icon.getImage());
        panel.add(label);
        panel2.add(labeltemp);
        frameprofile.add(panel);
        frameprofile.add(panel2);
        frameprofile.add(labeltemp2);
        frameprofile.add(labeltemp3);
        frameprofile.add(labeltemp4);
        frameprofile.add(labeltemp5);



    }

    Profile(Worker worker){

        this.wor = worker;

        panel.setBounds(0, 0, 150, 125);
        panel.setBackground(new Color(70, 97, 61));
        panel2.setBounds(150,0,550,125);
        panel2.setBackground(new Color(76, 102, 67));

        label.setIcon(icon);
        label.setHorizontalTextPosition(JLabel.LEFT);
        labeltemp.setText("Profile");
        labeltemp.setFont(new Font(null,Font.PLAIN,100));
        labeltemp.setForeground(new Color(232, 214, 162));

        labeltemp2 = new JLabel("Name: "+this.wor.getFirst_name()+" "+this.wor.getLast_name());
        labeltemp3 = new JLabel("Balance: "+this.wor.getBalance());
        labeltemp4 = new JLabel("Working area: "+ this.wor.getWorking_Area());
        //labeltemp5 = new JLabel("Working Area: "+this.cus.getLocation());  // add these methods AJ

        labeltemp2.setBounds(100,150,200,50);
        labeltemp2.setFont(new Font(null,Font.PLAIN,20));
        labeltemp3.setBounds(100,250,200,50);
        labeltemp3.setFont(new Font(null,Font.PLAIN,20));
        labeltemp4.setBounds(100,350,200,50);
        labeltemp4.setFont(new Font(null,Font.PLAIN,20));
        labeltemp5.setBounds(100,450,200,50);
        labeltemp5.setFont(new Font(null,Font.PLAIN,20));

        frameprofile.setLayout(null);
        frameprofile.setTitle("Fix it");
        frameprofile.setSize(600, 600);
        frameprofile.setResizable(false);
        frameprofile.setVisible(true);
        frameprofile.getContentPane().setBackground(new Color(232, 214, 162));
        frameprofile.setIconImage(icon.getImage());
        panel.add(label);
        panel2.add(labeltemp);
        frameprofile.add(panel);
        frameprofile.add(panel2);
        frameprofile.add(labeltemp2);
        frameprofile.add(labeltemp3);
        frameprofile.add(labeltemp4);
        //frameprofile.add(labeltemp5);



    }
}
