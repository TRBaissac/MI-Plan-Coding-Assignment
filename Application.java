import java.util.Scanner;
import java.util.ArrayList;

public class Application{

    static Scanner input = new Scanner(System.in);
    static ArrayList<Student> students = new ArrayList<Student>();
    static ArrayList<Lecturer> lecturers = new ArrayList<Lecturer>();
    static ArrayList<GeneralStaff> staff = new ArrayList<GeneralStaff>();
    static String command;

    public static void main(String[] args){

        System.out.println("Good day! Please select the type of person you want to enter into the system.");
        while (!input.equals("q")){
        System.out.println("To add a student, press \"s\".");
        System.out.println("To add a lecturer, press \"l\".");
        System.out.println("To add a general member of staff, press \"g\".");
        System.out.println("To read the details already enetered into the system, press \"r\".");
        System.out.println("To quit, press \"q\".");



            command = input.nextLine();

            switch(command){

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

                case "r":
                    readDetails();
                    break;

                case "q":
                    System.exit(0);

                default:
                    System.out.println("That was an incorrect command.");
                    break;

            }




        }



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

    private static void readDetails(){
        System.out.println("To view all students, press \"s\".");
        System.out.println("To view all lecturers, press \"l\".");
        System.out.println("To view all general members of staff, press \"g\".");

        command = input.nextLine();

        switch(command){

            case "s":
                students.forEach((n) -> System.out.println(n));
                break;

            case "l":
                lecturers.forEach((n) -> System.out.println(n));
                break;

            case "g":
                staff.forEach((n) -> System.out.println(n));
                break;

            default:
                break;


        }

    }



}
