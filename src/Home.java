import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;


public class Home extends JFrame implements ActionListener{
    Customer customer;

    JFrame frame = new JFrame();
    ImageIcon icon = new ImageIcon("logo2.png");
    ImageIcon profile = new ImageIcon("profile.png");
    ImageIcon wallet = new ImageIcon("wallet.png");
    ImageIcon orders = new ImageIcon("order.png");
    ImageIcon services = new ImageIcon("service.png");

    JLabel label = new JLabel();
    JLabel label2 = new JLabel("Fix it");
    JPanel panel = new JPanel();
    JPanel panel2 = new JPanel();
    JButton profilebutton = new JButton();
    JButton servicesebutton = new JButton();
    JButton orderbutton = new JButton();
    JButton walletbutton = new JButton();

    JButton profilebuttonW = new JButton();
    JButton servicesebuttonW = new JButton();
    JButton orderbuttonW = new JButton();
    JButton walletbuttonW = new JButton();

    Customer cus;

    Worker wor;



    Home(Customer customer) {

        this.cus = customer;

        panel.setBounds(0, 0, 150, 125);
        panel.setBackground(new Color(70, 97, 61));
        panel2.setBounds(150,0,550,125);
        panel2.setBackground(new Color(76, 102, 67));

        label.setIcon(icon);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label2.setFont(new Font(null,Font.PLAIN,100));
        label2.setForeground(new Color(232, 214, 162));

        profilebutton.setText("profile");
        profilebutton.setBackground(new Color(70, 97, 61));
        profilebutton.setForeground(new Color(245, 245, 245));
        profilebutton.setFont(new Font(null,Font.PLAIN,30));
        profilebutton.setFocusable(false);
        profilebutton.setIcon(profile);
        profilebutton.setBounds(130,225,200,200);
        profilebutton.setVerticalTextPosition(JButton.BOTTOM);
        profilebutton.setHorizontalTextPosition(JButton.CENTER);
        profilebutton.addActionListener(this);

        servicesebutton.setText("services");
        servicesebutton.setBackground(new Color(70, 97, 61));
        servicesebutton.setForeground(new Color(245, 245, 245));
        servicesebutton.setFont(new Font(null,Font.PLAIN,30));
        servicesebutton.setFocusable(false);
        servicesebutton.setIcon(services);
        servicesebutton.setBounds(390,225,200,200);
        servicesebutton.setVerticalTextPosition(JButton.BOTTOM);
        servicesebutton.setHorizontalTextPosition(JButton.CENTER);
        servicesebutton.addActionListener(this);

        orderbutton.setText("orders");
        orderbutton.setBackground(new Color(70, 97, 61));
        orderbutton.setForeground(new Color(245, 245, 245));
        orderbutton.setFont(new Font(null,Font.PLAIN,30));
        orderbutton.setFocusable(false);
        orderbutton.setIcon(orders);
        orderbutton.setBounds(130,485,200,200);
        orderbutton.setVerticalTextPosition(JButton.BOTTOM);
        orderbutton.setHorizontalTextPosition(JButton.CENTER);
        orderbutton.addActionListener(this);

        walletbutton.setText("wallet");
        walletbutton.setBackground(new Color(70, 97, 61));
        walletbutton.setForeground(new Color(245, 245, 245));
        walletbutton.setFont(new Font(null,Font.PLAIN,30));
        walletbutton.setFocusable(false);
        walletbutton.setIcon(wallet);
        walletbutton.setBounds(390,485,200,200);
        walletbutton.setVerticalTextPosition(JButton.BOTTOM);
        walletbutton.setHorizontalTextPosition(JButton.CENTER);
        walletbutton.addActionListener(this);

        frame.setLayout(null);
        frame.setTitle("Fix it");
        frame.setSize(700, 800);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.getContentPane().setBackground(new Color(232, 214, 162));
        frame.setIconImage(icon.getImage());
        panel.add(label);
        panel2.add(label2);
        frame.add(panel);
        frame.add(panel2);
        frame.add(profilebutton);
        frame.add(servicesebutton);
        frame.add(orderbutton);
        frame.add(walletbutton);



    }


    Home(Worker worker){

        this.wor = worker;

        panel.setBounds(0, 0, 150, 125);
        panel.setBackground(new Color(70, 97, 61));
        panel2.setBounds(150,0,550,125);
        panel2.setBackground(new Color(76, 102, 67));

        label.setIcon(icon);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label2.setFont(new Font(null,Font.PLAIN,100));
        label2.setForeground(new Color(232, 214, 162));

        profilebuttonW.setText("profile");
        profilebuttonW.setBackground(new Color(70, 97, 61));
        profilebuttonW.setForeground(new Color(245, 245, 245));
        profilebuttonW.setFont(new Font(null,Font.PLAIN,30));
        profilebuttonW.setFocusable(false);
        profilebuttonW.setIcon(profile);
        profilebuttonW.setBounds(130,225,200,200);
        profilebuttonW.setVerticalTextPosition(JButton.BOTTOM);
        profilebuttonW.setHorizontalTextPosition(JButton.CENTER);
        profilebuttonW.addActionListener(this);

        servicesebuttonW.setText("Myservices");
        servicesebuttonW.setBackground(new Color(70, 97, 61));
        servicesebuttonW.setForeground(new Color(245, 245, 245));
        servicesebuttonW.setFont(new Font(null,Font.PLAIN,30));
        servicesebuttonW.setFocusable(false);
        servicesebuttonW.setIcon(services);
        servicesebuttonW.setBounds(390,225,200,200);
        servicesebuttonW.setVerticalTextPosition(JButton.BOTTOM);
        servicesebuttonW.setHorizontalTextPosition(JButton.CENTER);
        servicesebuttonW.addActionListener(this);

        orderbuttonW.setText("ordersList");
        orderbuttonW.setBackground(new Color(70, 97, 61));
        orderbuttonW.setForeground(new Color(245, 245, 245));
        orderbuttonW.setFont(new Font(null,Font.PLAIN,30));
        orderbuttonW.setFocusable(false);
        orderbuttonW.setIcon(orders);
        orderbuttonW.setBounds(130,485,200,200);
        orderbuttonW.setVerticalTextPosition(JButton.BOTTOM);
        orderbuttonW.setHorizontalTextPosition(JButton.CENTER);
        orderbuttonW.addActionListener(this);

        walletbuttonW.setText("wallet");
        walletbuttonW.setBackground(new Color(70, 97, 61));
        walletbuttonW.setForeground(new Color(245, 245, 245));
        walletbuttonW.setFont(new Font(null,Font.PLAIN,30));
        walletbuttonW.setFocusable(false);
        walletbuttonW.setIcon(wallet);
        walletbuttonW.setBounds(390,485,200,200);
        walletbuttonW.setVerticalTextPosition(JButton.BOTTOM);
        walletbuttonW.setHorizontalTextPosition(JButton.CENTER);
        walletbuttonW.addActionListener(this);

        frame.setLayout(null);
        frame.setTitle("Fix it");
        frame.setSize(700, 800);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.getContentPane().setBackground(new Color(232, 214, 162));
        frame.setIconImage(icon.getImage());
        panel.add(label);
        panel2.add(label2);
        frame.add(panel);
        frame.add(panel2);
        frame.add(profilebuttonW);
        frame.add(servicesebuttonW);
        frame.add(orderbuttonW);
        frame.add(walletbuttonW);



    }


    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == profilebutton){

            new Profile(this.cus);


        } else if (e.getSource() == servicesebutton) {

            new Choose_service();
            
        } else if (e.getSource() == orderbutton) {

            new OrdersList();
            
        } else if (e.getSource() == walletbutton) {

            new WandS(this.cus);
            
        }

        if(e.getSource() == profilebuttonW){

            new Profile(this.wor);


        } else if (e.getSource() == servicesebuttonW) {

            new Choose_service(1);

        } else if (e.getSource() == orderbuttonW) {

        } else if (e.getSource() == walletbuttonW) {

        }
    }



}
