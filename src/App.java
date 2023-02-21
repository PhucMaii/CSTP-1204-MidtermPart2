import java.util.*;
import Students.Students;


public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("===============================");
        System.out.println("Welcome to School Management System");
        System.out.println("===============================");

        showOptions();
    }

    public static void showOptions() {
        Scanner sc = new Scanner(System.in);
        String option = "0";
        List<Students> studentList = new ArrayList<>();

        do {
            System.out.println("===============================");
            System.out.println("1. Show all Students");
            System.out.println("2. Add Students");
            System.out.println("3. Exit!!!");
            System.out.println("===============================");

            System.out.println("Please choose an option");

            option = sc.next();

            System.out.println();
            System.out.println(option + " IS YOUR OPTION");

            switch(option) {
                case "1":
                    System.out.println("You choose to show all students");
                    showAllStudents(studentList);
                    break;
                case "2": 
                    System.out.println("===============================");
                    System.out.println("You choose to add new Student");
                    Students newStudent = new Students();
                    newStudent = enterStudentDetails();
                    studentList.add(newStudent);
                    break;

                case "3":
                    System.out.println("GOODBYE");
                    sc.close();
                    break;

                default:
                    System.out.println("I am confused");
                    break;
                
            }

        } while(option != "3");
    }
    public static void showAllStudents(List<Students> studentList) {
        for (Students student: studentList){
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

        sc2.close();
        Students newStudent = new Students(name, email, age, cohort);
        return newStudent;


    }
}
