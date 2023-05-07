import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//v1
public class Separator implements ActionListener {

    // creating frame, buttons, labels, and images objects

    //frame
    JFrame frame = new JFrame();

    //labels
    JLabel label = new JLabel("You are a...");

    //buttons
    JButton buttonworker = new JButton();
    JButton buttoncustomer = new JButton();

    //icons & images
    ImageIcon icon = new ImageIcon("logo.png");

    Separator(){

        //labels setting

        //this method set coordinates and width and height
        label.setBounds(175,100,150,50);
        //set font and size of the text inside the label
        label.setFont(new Font(null, Font.PLAIN,30));

        //worker button setting

        buttonworker.setBounds(125,200,100,50);
        //put text inside the button
        buttonworker.setText("Worker");
        // gives color to the button
        buttonworker.setBackground(new Color(70, 97, 61));
        // gives color to the text inside the button
        buttonworker.setForeground(new Color(245, 245, 245));
        // remove the border around the text inside button
        buttonworker.setFocusable(false);
        // make the button receive action
        buttonworker.addActionListener(this);

        //customer button setting
        buttoncustomer.setBounds(275,200,100,50);
        buttoncustomer.setText("Customer");
        buttoncustomer.setBackground(new Color(70, 97, 61));
        buttoncustomer.setForeground(new Color(245, 245, 245));
        buttoncustomer.setFocusable(false);
        buttoncustomer.addActionListener(this);

        //frame setting and adding buttons and labels

        // make the frame more flexible
        frame.setLayout(null);
        // gives the frame a title
        frame.setTitle("Fix it");
        // determine width and height
        frame.setSize(500, 400);
        // make the frame size unchangeable
        frame.setResizable(false);
        // when click on close button top right the frame it also closes the program with it
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // from its name
        frame.setVisible(true);
        // gives the background a color
        frame.getContentPane().setBackground(new Color(232, 214, 162));
        // put an icon to the frame
        frame.setIconImage(icon.getImage());

        // adding to the frame
        frame.add(label);
        frame.add(buttonworker);
        frame.add(buttoncustomer);


    }


    //this is where we call login interface for both worker & customer after receive an action from one of the buttons
    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource()==buttoncustomer) {
            //this method make the frame close after executed it
            frame.dispose();
            //call customer log in interface
            new Login_Cus();
        }

        if (e.getSource()==buttonworker){
            frame.dispose();
            //call worker log in interface
            new Login_Wor();
        }

    }
}
