import javax.swing.*;

public class StudentPage extends JFrame{

    public StudentPage(){
        JButton addDetails = new JButton("Add details to system");
        JTextField nameField = new JTextField("Student Name", 20);
        JTextField surnameField = new JTextField("Student Surname");
        JTextField idField = new JTextField("Student ID");
        JPanel panel = new JPanel();

        nameField.setPreferredSize(new Dimension(50, 25));

        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));

        panel.add(nameField);
        panel.add(surnameField);
        panel.add(idField);
        panel.add(addDetails);
        add(panel);

        setSize(400, 500);
        setVisible(true);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


    }

    public static void main(String[] args){
        new StudentPage();
    }


}
