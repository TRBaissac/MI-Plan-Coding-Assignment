import javax.swing.*;

public class Menu extends JFrame{

    public Menu(){
        JButton addStudent = new JButton("Capture Student Details");
        addStudent.setBounds(100, 60, 200, 50);

        JButton addLecturer = new JButton("Capture Lecturer Details");
        addLecturer.setBounds(100, 170, 200, 50);

        JButton addGeneralStaff = new JButton("Capture General Staff Details");
        addGeneralStaff.setBounds(100, 280, 200, 50);

        JButton readDetails = new JButton("Read Details in System");
        readDetails.setBounds(100, 390, 200, 50);

        add(addStudent);
        add(addLecturer);
        add(addGeneralStaff);
        add(readDetails);
        setSize(400, 500);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    public static void main(String[] args){
        new Menu();
    }
}
