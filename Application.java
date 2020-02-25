import java.util.Scanner;
import java.util.ArrayList;
import java.io.IOException;

public class Application{

    static Scanner input = new Scanner(System.in);
    static ArrayList<Student> students = new ArrayList<Student>();
    static ArrayList<Lecturer> lecturers = new ArrayList<Lecturer>();
    static ArrayList<GeneralStaff> staff = new ArrayList<GeneralStaff>();
    static String command;
    private static FileHandler fileHandler = new FileHandler();

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
        Student student;

        System.out.println("Please enter student name:");
        name = input.nextLine();
        System.out.println("Please enter student surname:");
        surname = input.nextLine();
        System.out.println("Please enter student ID:");
        id = Integer.parseInt(input.nextLine());
        student = new Student(name, surname, id);
        //students.add(student);
        fileHandler.write("students.txt", student.toString());
    }

    private static void addLecturer(){
        String name;
        String surname;
        int id;
        Lecturer lecturer;

        System.out.println("Please enter lecturer name:");
        name = input.nextLine();
        System.out.println("Please enter lecturer surname:");
        surname = input.nextLine();
        System.out.println("Please enter lecturer ID:");
        id = Integer.parseInt(input.nextLine());
        lecturer = new Lecturer(name, surname, id);
        //lecturers.add(lecturer);
        fileHandler.write("lecturers.txt", lecturer.toString());
    }

    private static void addGeneralStaff(){
        String name;
        String surname;
        int id;
        GeneralStaff generalStaff;

        System.out.println("Please enter general staff member name:");
        name = input.nextLine();
        System.out.println("Please enter general staff member surname:");
        surname = input.nextLine();
        System.out.println("Please enter general staff member ID:");
        id = Integer.parseInt(input.nextLine());
        generalStaff = new GeneralStaff(name, surname, id);
        //staff.add(generalStaff);
        fileHandler.write("generalStaff.txt", generalStaff.toString());

    }

    private static void readDetails(){

        String[] dataArray;

        System.out.println("To view all students, press \"s\".");
        System.out.println("To view all lecturers, press \"l\".");
        System.out.println("To view all general members of staff, press \"g\".");

        command = input.nextLine();

        switch(command){

            case "s":

                try{
                    dataArray = fileHandler.read("students.txt");
                    for(String data : dataArray){
                        System.out.println(data);
                    }
                }
                catch(IOException e){
                    System.out.println("No student records found.");
                }
                break;

            case "l":

                try{
                    dataArray = fileHandler.read("lecturers.txt");
                    for(String data : dataArray){
                        System.out.println(data);
                    }
                }
                catch(IOException e){
                    System.out.println("No lecturer records found.");
                }
                break;

            case "g":

                try{
                    dataArray = fileHandler.read("generalStaff.txt");
                    for(String data : dataArray){
                        System.out.println(data);

                    }
                }
                catch(IOException e){
                    System.out.println("No general staff records found.");
                }
                break;

            default:
                break;


        }

    }



}
