import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class ReadDetailsPage extends JFrame implements ActionListener{

    public ReadDetailsPage(){


        JTextArea studentArea = new JTextArea();
        studentArea.append("Student Records" + "\n" + "\n");

        JTextArea lecturerArea = new JTextArea();
        lecturerArea.setBounds(50, 180, 300, 80);
        lecturerArea.append("Lecturer Records" + "\n" + "\n");

        JTextArea generalStaffArea = new JTextArea();

        generalStaffArea.append("General Staff Records" + "\n" + "\n");

        JButton back = new JButton("Back");
        back.setBounds(100, 420, 200, 30);
        back.addActionListener(this);

        JScrollPane studentPane = new JScrollPane(studentArea);
        studentPane.setBounds(50, 50, 300, 80);

        JScrollPane lecturerPane = new JScrollPane(lecturerArea);
        lecturerPane.setBounds(50, 180, 300, 80);

        JScrollPane generalStaffPane = new JScrollPane(generalStaffArea);
        generalStaffPane.setBounds(50, 310, 300, 80);


        addToList("students.txt", studentArea);
        addToList("lecturers.txt", lecturerArea);
        addToList("generalStaff.txt", generalStaffArea);
        
        add(studentPane);
        add(lecturerPane);
        add(generalStaffPane);
        add(back);

        setSize(400, 500);
        setLayout(null);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);



    }

    private void addToList(String fileName, JTextArea area){
        FileHandler fileHandler = new FileHandler();
        try{
            String [] tempArray = fileHandler.read(fileName);
            for (int i = 0; i <= tempArray.length-1; i++){
                area.append(tempArray[i] + "\n");
            }
        }

        catch(IOException e){
            area.append("No records found.");
        }
        area.setEditable(false);


    }

    //@Override
    public void actionPerformed(ActionEvent e){
        new Menu().setVisible(true);
        setVisible(false);
        dispose();


    }


    public static void main(String[] args){
        new ReadDetailsPage();
    }


}
