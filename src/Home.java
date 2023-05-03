import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;


public class Home extends JFrame implements ActionListener {

    JFrame frame = new JFrame();
    ImageIcon icon = new ImageIcon("logo2.png");
    ImageIcon profile = new ImageIcon("profile.png");
    ImageIcon wallet = new ImageIcon("wallet.png");
    ImageIcon orders = new ImageIcon("orders.png");
    ImageIcon services = new ImageIcon("services.png");
    DefaultTableModel model = new DefaultTableModel();
    DefaultTableModel model2 = new DefaultTableModel();

    JTable jTable1 = new JTable();
    JTable jTable2 = new JTable();
    JPanel panel = new JPanel();
    JPanel panel2 = new JPanel();
    JPanel panel3 = new JPanel();
    JPanel panelcont = new JPanel();
    JPanel panelin1 = new JPanel();
    JPanel panelin2 = new JPanel();
    JPanel panelin3 = new JPanel();
    JPanel panelin4 = new JPanel();
    CardLayout cl = new CardLayout();

    JLabel label = new JLabel();
    JLabel label2 = new JLabel("Fix it");
    JLabel labelprofile = new JLabel("       Name: "+"First "+"Last");
    JLabel labelprofile2= new JLabel("    Email: "+"222222@22222");
    JLabel labelprofile3 = new JLabel("        Balance: "+"2222");
    JLabel labelprofile4 = new JLabel("          DOB: "+"22-2-2022");
    JLabel labelprofile5 = new JLabel("       Location: "+"Jeddah");
    JLabel labelorder = new JLabel("oooooooo: "+"Jeddah");
    JLabel labelwallet = new JLabel("wwwwww: "+"Jeddah");
    JButton button = new JButton();
    JButton button2 = new JButton();
    JButton button3 = new JButton();
    JButton button4 = new JButton();


    Home(){
        label.setIcon(icon);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label2.setFont(new Font(null,Font.PLAIN,100));
        label2.setForeground(new Color(232, 214, 162));
        labelprofile.setBounds(200,175,20,20);
        labelprofile.setFont(new Font(null,Font.PLAIN,30));
        labelprofile2.setVerticalTextPosition(JLabel.BOTTOM);
        labelprofile2.setFont(new Font(null,Font.PLAIN,30));
        labelprofile3.setBounds(200,295,20,20);
        labelprofile3.setFont(new Font(null,Font.PLAIN,30));
        labelprofile4.setBounds(200,355,20,20);
        labelprofile4.setFont(new Font(null,Font.PLAIN,30));
        labelprofile5.setBounds(200,415,20,20);
        labelprofile5.setFont(new Font(null,Font.PLAIN,30));
        labelorder.setBounds(200,415,20,20);
        labelorder.setFont(new Font(null,Font.PLAIN,30));
        labelwallet.setBounds(200,415,20,20);
        labelwallet.setFont(new Font(null,Font.PLAIN,30));


        panel.setBounds(0, 0, 150, 125);
        panel.setBackground(new Color(70, 97, 61));
        panel2.setBounds(150,0,550,125);
        panel2.setBackground(new Color(76, 102, 67));
        panel3.setBounds(0,125,150,800);
        panel3.setBackground(new Color(76, 102, 67));
        panel3.setLayout(null);
        panelin1.setBounds(150, 125, 550, 675);
        panelin1.setBackground(new Color(232, 214, 162));
        panelin2.setBounds(150, 125, 550, 675);
        panelin2.setBackground(new Color(232, 214, 162));
        panelin3.setBounds(150, 125, 550, 675);
        panelin3.setBackground(new Color(232, 214, 162));
        panelin4.setBounds(150, 125, 550, 675);
        panelin4.setBackground(new Color(232, 214, 162));
        panelcont.setLayout(cl);
        panelcont.setBounds(150, 125, 550, 675);
        panelcont.setBackground(new Color(232, 214, 162));
        panelcont.add(panelin1,"1");
        panelcont.add(panelin2,"2");
        panelcont.add(panelin3,"3");
        panelcont.add(panelin4,"4");
        cl.show(panelcont,"1");


        model.addColumn("CID");
        model.addColumn("Name");
        model.addColumn("Phone");
        model.addRow(new Object[]{"1","2","3"});
        model2.addColumn("CID");
        model2.addColumn("Name");
        model2.addColumn("Phone");
        model2.addRow(new Object[]{"5","6","7"});

        jTable1.setDefaultEditor(Object.class, null); //make the table cannot be edited
        jTable1.setModel(model); //make the table visiable (set the model for the table)

        jTable2.setDefaultEditor(Object.class, null); //make the table cannot be edited
        jTable2.setModel(model2); //make the table visiable (set the model for the table)


        button.setText("profile");
        button.setBackground(new Color(70, 97, 61));
        button.setForeground(new Color(245, 245, 245));
        button.setFocusable(false);
        button.addActionListener(this);
        button.setIcon(profile);
        button.setBounds(20,30,100,100);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.addActionListener(this);

        button2.setText("services");
        button2.setBackground(new Color(70, 97, 61));
        button2.setForeground(new Color(245, 245, 245));
        button2.setFocusable(false);
        button2.addActionListener(this);
        button2.setIcon(services);
        button2.setBounds(20,150,100,100);
        button2.setVerticalTextPosition(JButton.BOTTOM);
        button2.setHorizontalTextPosition(JButton.CENTER);
        button2.addActionListener(this);

        button3.setText("orders");
        button3.setBackground(new Color(70, 97, 61));
        button3.setForeground(new Color(245, 245, 245));
        button3.setFocusable(false);
        button3.addActionListener(this);
        button3.setIcon(orders);
        button3.setBounds(20,270,100,100);
        button3.setVerticalTextPosition(JButton.BOTTOM);
        button3.setHorizontalTextPosition(JButton.CENTER);
        button3.addActionListener(this);

        button4.setText("wallet");
        button4.setBackground(new Color(70, 97, 61));
        button4.setForeground(new Color(245, 245, 245));
        button4.setFocusable(false);
        button4.addActionListener(this);
        button4.setIcon(wallet);
        button4.setBounds(20,390,100,100);
        button4.setVerticalTextPosition(JButton.BOTTOM);
        button4.setHorizontalTextPosition(JButton.CENTER);
        button4.addActionListener(this);

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
        panelin1.add(labelprofile);
        panelin1.add(labelprofile2);
        panelin1.add(labelprofile3);
        panelin1.add(labelprofile4);
        panelin1.add(labelprofile5);
        panelin2.add(jTable1);
        panelin3.add(jTable2);
        panelin4.add(labelwallet);
        frame.add(panel);
        frame.add(panel2);
        frame.add(panel3);
        frame.add(panelcont);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == button){
            cl.show(panelcont,"1");
        }
        if(e.getSource() == button2){
            cl.show(panelcont,"2");
        }
        if(e.getSource() == button3){
            cl.show(panelcont,"3");
        }
        if(e.getSource() == button4){
            cl.show(panelcont,"4");
        }

    }
}
