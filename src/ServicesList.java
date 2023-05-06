import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ServicesList extends JFrame implements ActionListener {


    DefaultTableModel model = new DefaultTableModel();
    JTable jTable1 = new JTable();


    JFrame frameservice = new JFrame();
    ImageIcon icon = new ImageIcon("logo2.png");

    JPanel panel = new JPanel();
    JPanel panel2 = new JPanel();

    JLabel label = new JLabel();
    JLabel labeltemp = new JLabel();

    JTextField MYchosen_service = new JTextField();


    JButton confirm = new JButton();

    Worker wor = new Worker();

    
    ServicesList(Worker wor){

        wor = wor;

        panel.setBounds(0, 0, 150, 125);
        panel.setBackground(new Color(70, 97, 61));
        panel2.setBounds(150, 0, 550, 125);
        panel2.setBackground(new Color(76, 102, 67));

        label.setIcon(icon);
        labeltemp.setText("Services");
        labeltemp.setFont(new Font(null, Font.PLAIN, 100));
        label.setHorizontalTextPosition(JLabel.LEFT);
        labeltemp.setForeground(new Color(232, 214, 162));

        MYchosen_service.setBounds(255,450,100,30);


        model.addColumn("Service ID");
        model.addColumn("Service");
        model.addColumn("Price");
        model.addRow(new Object[]{"Service ID","Service name","Price"});
        int i = 0; //to scan the service array
        System.out.println(Main.ServiceArray.size());
        while (i<Main.ServiceArray.size()){ //while service array isn't empty
            String SID =  Main.ServiceArray.get(i).getSID(); //get sid
            String name =  Main.ServiceArray.get(i).getName(); // get service name
            Double price =  Main.ServiceArray.get(i).getPrice(); //get service price
            model.addRow(new Object[]{SID,name,price}); //add it to the table
            i++; //go to the next service
        }

        jTable1.setPreferredSize(new Dimension(400, 400)); // set preferred size to 400 x 400 pixels
        jTable1.setDefaultEditor(Object.class, null); //make the table cannot be edited
        jTable1.setModel(model); //make the table visiable (set the model for the table)
        jTable1.setBounds(115, 175, 400,200);

        confirm.setText("Confirm");
        confirm.setBackground(new Color(70, 97, 61));
        confirm.setForeground(new Color(245, 245, 245));
        confirm.setFont(new Font(null, Font.PLAIN, 15));
        confirm.setFocusable(false);
        confirm.setBounds(255, 500, 100, 50);
        confirm.setVerticalTextPosition(JButton.BOTTOM);
        confirm.setHorizontalTextPosition(JButton.CENTER);
        confirm.addActionListener(this);


        frameservice.setLayout(null);
        frameservice.setTitle("Fix it");
        frameservice.setSize(650, 600);
        frameservice.setResizable(false);
        frameservice.setVisible(true);
        frameservice.getContentPane().setBackground(new Color(232, 214, 162));
        frameservice.setIconImage(icon.getImage());
        panel.add(label);
        panel2.add(labeltemp);
        frameservice.add(panel);
        frameservice.add(panel2);
        frameservice.add(MYchosen_service);
        frameservice.add(jTable1);
        frameservice.add(confirm);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == confirm){

            frameservice.dispose();
        }
    }
}
