import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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


    Choose_worker(){


        panel.setBounds(0, 0, 150, 125);
        panel.setBackground(new Color(70, 97, 61));
        panel2.setBounds(150,0,550,125);
        panel2.setBackground(new Color(76, 102, 67));

        label.setIcon(icon);
        labeltemp.setText("Workers");
        labeltemp.setFont(new Font(null,Font.PLAIN,100));
        label.setHorizontalTextPosition(JLabel.LEFT);
        labeltemp.setForeground(new Color(232, 214, 162));

        chosen_worker.setBounds(255,450,100,30);

        model.addColumn("WID");
        model.addColumn("Name");
        model.addRow(new Object[]{"WID","Name"});

        int i = 0; //to scan the worker array
        while (i<Main.WorkerArray.size()){ //while service array isn't empty
            String WID =  Main.WorkerArray.get(i).getWID(); //get wid
            String first =  Main.WorkerArray.get(i).getFirst_name(); // get worker first name
            String last =  Main.WorkerArray.get(i).getLast_name(); //get worker last name
            String name = first +" "+ last ; //get the name
            model.addRow(new Object[]{WID,name}); //add it to the table
            i++; //go to the next worker
        }

        jTable1.setPreferredSize(new Dimension(400, 400)); // set preferred size to 400 x 400 pixels
        jTable1.setDefaultEditor(Object.class, null); //make the table cannot be edited
        jTable1.setModel(model); //make the table visiable (set the model for the table)
        jTable1.setBounds(115, 175, 400,200);


        confirm.setText("Confirm");
        confirm.setBackground(new Color(70, 97, 61));
        confirm.setForeground(new Color(245, 245, 245));
        confirm.setFont(new Font(null,Font.PLAIN,15));
        confirm.setFocusable(false);
        confirm.setBounds(255,500,100, 50);
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


        if (e.getSource() == confirm && !(chosen_worker.getText().isEmpty())){
            frameworker.dispose();
            new OrdersList();

        }else{
            new IW(1.0);

        }

    }
}
