package InternationalStudent;
import Students.Students;

public class InternationalStudent extends Students{
    private String homeCountry;

    public InternationalStudent(String name, String email, int age, String cohort, String homeCountry) {
        super(name, email, age, cohort);
        this.homeCountry = homeCountry;
    }

    public InternationalStudent(){}

    public String getHomeCountry() {
        return homeCountry;
    }

    public void setHomeCountry(String homeCountry) {
        this.homeCountry = homeCountry;
    }

    public void getStudentInfo() {
        System.out.println("Name: " + this.getName());
        System.out.println("Email: " + this.getEmail());
        System.out.println("Age: " + this.getAge());
        System.out.println("Cohort: " + this.getCohort());
        System.out.println("StudentID: " + this.getStudentID());
        System.out.println("Home Country "+ this.getHomeCountry());
    }
}