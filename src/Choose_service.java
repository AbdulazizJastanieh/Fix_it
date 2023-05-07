import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
//v1

public class Choose_service extends JFrame implements ActionListener {

    DefaultTableModel model = new DefaultTableModel();
    JTable jTable1 = new JTable();



    JFrame frameservice = new JFrame();
    ImageIcon icon = new ImageIcon("logo2.png");

    JPanel panel = new JPanel();
    JPanel panel2 = new JPanel();

    JLabel label = new JLabel();
    JLabel labeltemp = new JLabel();

    JLabel labeltemp2 = new JLabel("Want to add more?");

    JTextField chosen_service = new JTextField();

    JButton confirm = new JButton();
    JButton confirmW = new JButton();


    Customer cus = new Customer();
    Worker wor = new Worker();

    //this is for customer
    Choose_service(Customer cust){
    cus = cust;

        panel.setBounds(0, 0, 150, 125);
        panel.setBackground(new Color(70, 97, 61));
        panel2.setBounds(150,0,550,125);
        panel2.setBackground(new Color(76, 102, 67));

        label.setIcon(icon);
        labeltemp.setText("Services");
        labeltemp.setFont(new Font(null,Font.PLAIN,100));
        label.setHorizontalTextPosition(JLabel.LEFT);
        labeltemp.setForeground(new Color(232, 214, 162));

        chosen_service.setBounds(255,450,100,30);



        model.addColumn("Service ID");
        model.addColumn("Service");
        model.addColumn("Price");
        model.addRow(new Object[]{"Service ID","Service name","Price"});
        int i = 0; //to scan the service array
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

        confirm.setText("Continue");
        confirm.setBackground(new Color(70, 97, 61));
        confirm.setForeground(new Color(245, 245, 245));
        confirm.setFont(new Font(null,Font.PLAIN,15));
        confirm.setFocusable(false);
        confirm.setBounds(255,500,100, 50);
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
        frameservice.add(chosen_service);
        frameservice.add(jTable1);
        frameservice.add(confirm);
        
    }

    //for worker
    Choose_service(Worker wor){

        this.wor = wor;


        panel.setBounds(0, 0, 150, 125);
        panel.setBackground(new Color(70, 97, 61));
        panel2.setBounds(150,0,550,125);
        panel2.setBackground(new Color(76, 102, 67));

        label.setIcon(icon);
        labeltemp.setText("MyServices");
        labeltemp.setFont(new Font(null,Font.PLAIN,100));
        label.setHorizontalTextPosition(JLabel.LEFT);
        labeltemp.setForeground(new Color(232, 214, 162));
        labeltemp2.setBounds(255,450,150,30);

        model.addColumn("Service ID");
        model.addColumn("Service");
        model.addColumn("Price");
        model.addRow(new Object[]{"Service ID","Service name","Price"});
        int i = 0; //to scan the service array
        while (i<wor.getServices().size()){ //while service array isn't empty
                    String SID = wor.getServices().get(i).getSID(); //get sid
                    String name = wor.getServices().get(i).getName(); // get service name
                    Double price =wor.getServices().get(i).getPrice(); //get service price
                    model.addRow(new Object[]{SID, name, price}); //add it to the table
            i++; //go to the next service

        }
        jTable1.setPreferredSize(new Dimension(400, 400)); // set preferred size to 400 x 400 pixels
        jTable1.setDefaultEditor(Object.class, null); //make the table cannot be edited
        jTable1.setModel(model); //make the table visiable (set the model for the table)
        jTable1.setBounds(115, 175, 400,200);

        confirmW.setText("Here!");
        confirmW.setBackground(new Color(70, 97, 61));
        confirmW.setForeground(new Color(245, 245, 245));
        confirmW.setFont(new Font(null,Font.PLAIN,15));
        confirmW.setFocusable(false);
        confirmW.setBounds(255,500,100, 50);
        confirmW.setVerticalTextPosition(JButton.BOTTOM);
        confirmW.setHorizontalTextPosition(JButton.CENTER);
        confirmW.addActionListener(this);


        frameservice.setLayout(null);
        frameservice.setTitle("Fix it");
        frameservice.setSize(700, 600);
        frameservice.setResizable(false);
        frameservice.setVisible(true);
        frameservice.getContentPane().setBackground(new Color(232, 214, 162));
        frameservice.setIconImage(icon.getImage());
        panel.add(label);
        panel2.add(labeltemp);
        frameservice.add(labeltemp2);
        frameservice.add(panel);
        frameservice.add(panel2);
        frameservice.add(jTable1);
        frameservice.add(confirmW);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
    boolean serviceFound = isServiceExsist(chosen_service.getText()); //to know if he entered a valid service number or not
        if (e.getSource() == confirm && !(chosen_service.getText().isEmpty()) && serviceFound){
            frameservice.dispose();
           ArrayList<Worker> aWorker = Worker.WorkersBySID(chosen_service.getText());
            new Choose_worker(aWorker,cus,chosen_service.getText());

        }else if(e.getSource() == confirm){
            new IW(1);

        }

        if (e.getSource() == confirmW ){
            frameservice.dispose();
            new ServicesList(wor);

        }

    }
    private static Boolean isServiceExsist(String SID){ //this method is used to check if the service exsist on the array or not
        int i =0;
        boolean found = false;
        while(i<Main.ServiceArray.size()){
            if(SID.equals(Main.ServiceArray.get(i).getSID())){
                found = true;
            }
            i++;
        }
        return found;
    }




}
