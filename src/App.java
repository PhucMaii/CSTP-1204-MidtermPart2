import java.util.*;
import Students.Students;
import InternationalStudent.InternationalStudent;


public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("===============================");
        System.out.println("Welcome to School Management System");
        System.out.println("===============================");

        showOptions();
    }

    public static void showOptions() {
        Scanner sc = new Scanner(System.in);
        Students defaultStudent = new Students("Bin", "bin@gmail.com", 20, "CSTP 2022 Summer");
        InternationalStudent internationalStudent = new InternationalStudent("Daniel", "daniel@gmail.com", 20, "CSTP 2021 Spring", "Vietnam");


        String option = "0";
        List<Students> studentList = new ArrayList<>();
        List<InternationalStudent> internationalStudentList = new ArrayList<>();
        studentList.add(defaultStudent);
        internationalStudentList.add(internationalStudent);

        do {
            System.out.println("===============================");
            System.out.println("1. Show all Students");
            System.out.println("2. Add Local Students");
            System.out.println("3. Add International Student");
            System.out.println("4. Exit!!!");
            System.out.println("===============================");

            System.out.println("Please choose an option");

            option = sc.next();

            System.out.println();
            System.out.println(option + " IS YOUR OPTION");

            switch(option) {
                case "1":
                    System.out.println("You choose to show all students");
                    showAllStudents(studentList, internationalStudentList);
                    break;
                case "2": 
                    System.out.println("===============================");
                    System.out.println("You choose to add Local Student");
                    Students newStudent = new Students();
                    newStudent = enterStudentDetails();

                    studentList.add(newStudent);
                        
                    break;
                
                case "3":
                    System.out.println("===============================");
                    System.out.println("You choose to add International Student");
                    InternationalStudent newInternationalStudent = new InternationalStudent();
                    newInternationalStudent = enterInternationalStudentDetails();

                    internationalStudentList.add(newInternationalStudent);
                    break;
                    
                case "4":
                    System.out.println("GOODBYE");
                    sc.close();

                    break;

                default:
                    System.out.println("I am confused");
                    break;
                
            }

        } while(!option.equals("4"));
        System.out.println("Thank you for using our platform");
    }
    public static void showAllStudents(List<Students> studentList, List<InternationalStudent> internationalStudentList) {
        for (Students student: studentList){
            System.out.println("*********************");
            student.getStudentInfo();
            System.out.println("*********************");
        }

        for (InternationalStudent student: internationalStudentList){
            System.out.println("*********************");
            student.getStudentInfo();
            System.out.println("*********************");
        }
    }

    public static Students enterStudentDetails() {
        Scanner sc2 = new Scanner(System.in);
        String name = "";
        String email = "";
        int age =0;
        String cohort = "";
        
        System.out.println("Enter Student name: ");
        name = sc2.next();

        System.out.println("Enter Student email: ");
        email = sc2.next();

        System.out.println("Enter Student age: ");
        age = sc2.nextInt();

        System.out.println("Enter Student cohort: ");
        cohort = sc2.next();

        
        Students newStudent = new Students(name, email, age, cohort);
        return newStudent;


    }

    public static InternationalStudent enterInternationalStudentDetails() {
        Scanner sc3 = new Scanner(System.in);
        String name = "";
        String email = "";
        int age =0;
        String cohort = "";
        String homeCountry = "";
        
        System.out.println("Enter Student name: ");
        name = sc3.next();

        System.out.println("Enter Student email: ");
        email = sc3.next();

        System.out.println("Enter Student age: ");
        age = sc3.nextInt();

        System.out.println("Enter Student cohort: ");
        cohort = sc3.next();

        
        System.out.println("Enter Student home country: ");
        homeCountry = sc3.next();

        
        InternationalStudent newStudent = new InternationalStudent(name, email, age, cohort, homeCountry);
        return newStudent;


    }

    
}
