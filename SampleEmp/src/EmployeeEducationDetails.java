import java.util.Date;

public class EmployeeEducationDetails extends Employee {
    int percent,date;
    String Degree;

    public EmployeeEducationDetails(int percent, int date, String Degree){
        this.percent=percent;
        this.date= date;
        this.Degree=Degree;
    }


    public void printEmpDetails() {

        System.out.println("Employee percentage"+percent);
        System.out.println("Employee Certification Date"+date);
        System.out.println("Employee Degree"+Degree);

    }
}
