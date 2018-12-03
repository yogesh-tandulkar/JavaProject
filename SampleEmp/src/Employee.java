public class Employee {
    private String mEmployeeName;
    private int age;
    private String designation;
    private OrganizationDetails mOrganizationDetails;

    public Employee() {

    }

    public Employee(String name, int age, String designation) {
        mEmployeeName = name;
        this.age = age;
        this.designation = designation;
    }

    public void setmEmployeeName(String mEmployeeName) {
        this.mEmployeeName = mEmployeeName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getmEmployeeName() {
        return mEmployeeName;
    }

    public int getAge() {
        return age;
    }

    public String getDesignation() {
        return designation;
    }


}
