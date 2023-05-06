import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class OrdersList extends JFrame {

    JFrame frameorder = new JFrame();
    ImageIcon icon = new ImageIcon("logo2.png");
    JPanel panel = new JPanel();
    JPanel panel2 = new JPanel();

    DefaultTableModel model = new DefaultTableModel();
    JTable jTable1 = new JTable();

    JLabel label = new JLabel();
    JLabel labeltemp = new JLabel();
    
    OrdersList(Customer cus){

        label.setIcon(icon);
        label.setHorizontalTextPosition(JLabel.LEFT);
        labeltemp.setText("Orders");
        labeltemp.setFont(new Font(null,Font.PLAIN,100));
        labeltemp.setForeground(new Color(232, 214, 162));


        panel.setBounds(0, 0, 150, 125);
        panel.setBackground(new Color(70, 97, 61));
        panel2.setBounds(150,0,550,125);
        panel2.setBackground(new Color(76, 102, 67));


        model.addColumn("Order ID");
        model.addColumn("Service Name");
        model.addColumn("TOTAL");
        model.addColumn("Worker Name");
        model.addColumn("Worker phone");
        model.addRow(new Object[]{"Order ID","Service Name","TOTAL","Worker Name","Worker phone"});
        int i = 0; //to scan the service array
        while (i<Main.OrderArray.size()){ //while service array isn't empty
            if(cus.getCID().equals(Main.OrderArray.get(i).getCustomer().getCID())) { //if the order from the logged in customer
                String OID = Main.OrderArray.get(i).getOID(); //get sid
                String SID = Main.OrderArray.get(i).getService().getName(); // get service name
                Double price = Main.OrderArray.get(i).getTotal();//get service price
                String Wname1 = Main.OrderArray.get(i).getWorker().getFirst_name(); //get service price
                String Wname2 = Main.OrderArray.get(i).getWorker().getLast_name(); //get service price
                String Wname = Wname1 + " " + Wname2 ;
                String phone = Main.OrderArray.get(i).getWorker().getPhone();
                model.addRow(new Object[]{OID, SID, price, Wname,phone}); //add it to the table
            }
            i++; //go to the next service

        }
        jTable1.setPreferredSize(new Dimension(400, 400)); // set preferred size to 400 x 400 pixels
        jTable1.setDefaultEditor(Object.class, null); //make the table cannot be edited
        jTable1.setModel(model); //make the table visiable (set the model for the table)
        jTable1.setBounds(90, 175, 440,200);


        frameorder.setLayout(null);
        frameorder.setTitle("Fix it");
        frameorder.setSize(600, 600);
        frameorder.setResizable(false);
        frameorder.setVisible(true);
        frameorder.getContentPane().setBackground(new Color(232, 214, 162));
        frameorder.setIconImage(icon.getImage());
        panel.add(label);
        panel2.add(labeltemp);
        frameorder.add(panel);
        frameorder.add(panel2);
        frameorder.add(jTable1);




    }

}
