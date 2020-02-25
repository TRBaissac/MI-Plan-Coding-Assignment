import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GeneralStaffPage extends JFrame implements ActionListener{

    public GeneralStaffPage(){
        JTextField nameField = new JTextField("General Staff Name");
        nameField.setBounds(100, 60, 200, 20);
        JTextField surnameField = new JTextField("General Staff Surname");
        surnameField.setBounds(100, 170, 200, 20);
        JTextField idField = new JTextField("General Staff ID");
        idField.setBounds(100, 280, 200, 20);
        JButton addDetails = new JButton("Add details to system");
        addDetails.setBounds(100, 390, 200, 50);
        addDetails.addActionListener(this);




        add(nameField);
        add(surnameField);
        add(idField);
        add(addDetails);



        setSize(400, 500);
        setLayout(null);
        setVisible(true);


        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


    }
    //@Override
    public void actionPerformed(ActionEvent e){
        new Menu().setVisible(true);
        setVisible(false);
        dispose();


    }

    public static void main(String[] args){
        new GeneralStaffPage();
    }


}
