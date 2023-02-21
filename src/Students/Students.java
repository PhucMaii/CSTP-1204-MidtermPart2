package Students;
import java.util.UUID;

public class Students {
    
    private String name;
    private String email;
    private int age;
    private String cohort;
    private String studentID;

    public Students() {
        this.name = "Daniel";
        this.email = "daniel@gmail.com";
        this.age = 18;
        this.cohort = "CSTP Summer";
        this.studentID = UUID.randomUUID().toString();        
    }

    public Students(String name, String email, int age, String cohort) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.cohort = cohort;
        this.studentID = UUID.randomUUID().toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCohort() {
        return cohort;
    }

    public void setCohort(String cohort) {
        this.cohort = cohort;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public void getStudentInfo() {
        System.out.println("Name: " + this.getName());
        System.out.println("Email: " + this.getEmail());
        System.out.println("Age: " + this.getAge());
        System.out.println("Cohort: " + this.getCohort());
        System.out.println("StudentID: " + this.getStudentID());
    }
}
