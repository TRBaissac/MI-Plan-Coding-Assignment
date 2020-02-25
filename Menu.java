import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JFrame implements ActionListener{

    public Menu(){


        JButton addStudent = new JButton("Capture Student Details");
        addStudent.setBounds(100, 60, 200, 50);
        addStudent.addActionListener(this);

        JButton addLecturer = new JButton("Capture Lecturer Details");
        addLecturer.setBounds(100, 170, 200, 50);
        addLecturer.addActionListener(this);

        JButton addGeneralStaff = new JButton("Capture General Staff Details");
        addGeneralStaff.setBounds(100, 280, 200, 50);
        addGeneralStaff.addActionListener(this);

        JButton readDetails = new JButton("Read Details in System");
        readDetails.setBounds(100, 390, 200, 50);
        readDetails.addActionListener(this);

        add(addStudent);
        add(addLecturer);
        add(addGeneralStaff);
        add(readDetails);
        setSize(400, 500);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getActionCommand().equals("Capture Student Details")){
            new StudentPage().setVisible(true);
            setVisible(false);
            dispose();
        }

        if(e.getActionCommand().equals("Capture Lecturer Details")){
            new LecturerPage().setVisible(true);
            setVisible(false);
            dispose();
        }

        if(e.getActionCommand().equals("Capture General Staff Details")){
            new GeneralStaffPage().setVisible(true);
            setVisible(false);
            dispose();
        }

        if(e.getActionCommand().equals("Read Details in System")){
            new ReadDetailsPage().setVisible(true);
            setVisible(false);
            dispose();
        }




    }

    public static void main(String[] args){
        new Menu();
    }
}
