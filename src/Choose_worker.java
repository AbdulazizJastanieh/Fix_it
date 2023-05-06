import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;

public class Choose_worker extends JFrame implements ActionListener {


    DefaultTableModel model = new DefaultTableModel();
    JTable jTable1 = new JTable();


    JFrame frameworker = new JFrame();
    ImageIcon icon = new ImageIcon("logo2.png");

    JPanel panel = new JPanel();
    JPanel panel2 = new JPanel();

    JLabel label = new JLabel();
    JLabel labeltemp = new JLabel();

    JTextField chosen_worker = new JTextField();

    JButton confirm = new JButton();

    Customer cus = new Customer();
    String SID ;
    ArrayList<Worker> WorkerArray;
    Choose_worker(ArrayList<Worker> WorkerArray, Customer cus,String SID) {
        this.cus = cus;
        this.SID = SID;
        this.WorkerArray = WorkerArray;
        panel.setBounds(0, 0, 150, 125);
        panel.setBackground(new Color(70, 97, 61));
        panel2.setBounds(150, 0, 550, 125);
        panel2.setBackground(new Color(76, 102, 67));

        label.setIcon(icon);
        labeltemp.setText("Workers");
        labeltemp.setFont(new Font(null, Font.PLAIN, 100));
        label.setHorizontalTextPosition(JLabel.LEFT);
        labeltemp.setForeground(new Color(232, 214, 162));

        chosen_worker.setBounds(255, 450, 100, 30);

        model.addColumn("WID");
        model.addColumn("Name");
        model.addColumn("Working Area");
        model.addRow(new Object[]{"WID", "Name","Working Area"});

        int i = 0; //to scan the worker array
        while (i < WorkerArray.size()) { //while service array isn't empty
            String WID = WorkerArray.get(i).getWID(); //get wid
            String first = WorkerArray.get(i).getFirst_name(); // get worker first name
            String last = WorkerArray.get(i).getLast_name(); //get worker last name
            String name = first + " " + last; //get the name
            String Working_Area = WorkerArray.get(i).getWorking_Area();
            model.addRow(new Object[]{WID, name,Working_Area}); //add it to the table
            i++; //go to the next worker
        }

        jTable1.setPreferredSize(new Dimension(400, 400)); // set preferred size to 400 x 400 pixels
        jTable1.setDefaultEditor(Object.class, null); //make the table cannot be edited
        jTable1.setModel(model); //make the table visiable (set the model for the table)
        jTable1.setBounds(115, 175, 400, 200);


        confirm.setText("Confirm");
        confirm.setBackground(new Color(70, 97, 61));
        confirm.setForeground(new Color(245, 245, 245));
        confirm.setFont(new Font(null, Font.PLAIN, 15));
        confirm.setFocusable(false);
        confirm.setBounds(255, 500, 100, 50);
        confirm.setVerticalTextPosition(JButton.BOTTOM);
        confirm.setHorizontalTextPosition(JButton.CENTER);
        confirm.addActionListener(this);


        frameworker.setLayout(null);
        frameworker.setTitle("Fix it");
        frameworker.setSize(650, 600);
        frameworker.setResizable(false);
        frameworker.setVisible(true);
        frameworker.getContentPane().setBackground(new Color(232, 214, 162));
        frameworker.setIconImage(icon.getImage());
        panel.add(label);
        panel2.add(labeltemp);
        frameworker.add(panel);
        frameworker.add(panel2);
        frameworker.add(chosen_worker);
        frameworker.add(jTable1);
        frameworker.add(confirm);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            boolean workerIsReal =  isWorkerExsist(chosen_worker.getText());
            if (e.getSource() == confirm && !(chosen_worker.getText().isEmpty()) && workerIsReal) {
                frameworker.dispose();
                Order.NewOrder(cus,SID, chosen_worker.getText());
            } else {
                new IW(1.0);
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private Boolean isWorkerExsist(String WID){ //this method is used to check if the Worker exsist on the array or not
        int i =0;
        boolean found = false;
        while(i<this.WorkerArray.size()){
            if(WID.equals(this.WorkerArray.get(i).getWID())){
                found = true;
            }
            i++;
        }
        return found;
    }

}
