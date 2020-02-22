import java.util.Scanner;
import java.util.ArrayList;

public class Application{

    static Scanner input = new Scanner(System.in);
    static ArrayList<Student> students = new ArrayList<Student>();
    static ArrayList<Lecturer> lecturers = new ArrayList<Lecturer>();
    static ArrayList<GeneralStaff> staff = new ArrayList<GeneralStaff>();

    public static void main(String[] args){

        String person;

        System.out.println("Good day! Please select the type of person you want to enter into the system.");
        System.out.println("For a student, press \"s\".");
        System.out.println("For a lecturer, press \"l\".");
        System.out.println("For a general member of staff, press \"g\".");

        //while (!person.equals("s" || "g" || "l")){

            person = input.nextLine();

            switch(person){

                case "s":
                    System.out.println("You've selected a student.");
                    addStudent();
                    break;

                case "l":
                    System.out.println("You've selected a lecturer.");
                    addLecturer();
                    break;

                case "g":
                    System.out.println("You've selected a general member of staff.");
                    addGeneralStaff();
                    break;

                default:
                    System.out.println("That was an incorrect command.");
                    break;

            }




        //}



    }

    private static void addStudent(){
        String name;
        String surname;
        int id;

        System.out.println("Please enter student name:");
        name = input.nextLine();
        System.out.println("Please enter student surname:");
        surname = input.nextLine();
        System.out.println("Please enter student ID:");
        id = Integer.parseInt(input.nextLine());
        students.add(new Student(name, surname, id));
    }

    private static void addLecturer(){
        String name;
        String surname;
        int id;

        System.out.println("Please enter lecturer name:");
        name = input.nextLine();
        System.out.println("Please enter lecturer surname:");
        surname = input.nextLine();
        System.out.println("Please enter lecturer ID:");
        id = Integer.parseInt(input.nextLine());
        lecturers.add(new Lecturer(name, surname, id));
    }

    private static void addGeneralStaff(){
        String name;
        String surname;
        int id;

        System.out.println("Please enter general staff member name:");
        name = input.nextLine();
        System.out.println("Please enter general staff member surname:");
        surname = input.nextLine();
        System.out.println("Please enter general staff member ID:");
        id = Integer.parseInt(input.nextLine());
        staff.add(new GeneralStaff(name, surname, id));
    }



}
