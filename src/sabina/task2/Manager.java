package sabina.task2;

public class Manager  extends Member{

    private String department;

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Manager(String name, int age, long phoneNumber, String address, double salary, String department) {
        super(name, age, phoneNumber, address, salary);
        setDepartment(department);
    }



    @Override
    public String toString() {
        return super.toString().replace("}", "")+
                ", department=" + department +
                '}';
    }
}
