package hamzaAli;

public class Employee extends Member {


    public Employee(String name, int age, long phoneNumber, String address, double salary, String specialization, String department) {
        super(name, age, phoneNumber, address, salary);
        setDepartment(department);
        setSpecialization(specialization);
    }

    private String specialization, department;

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }


    public static void main(String[] args) {

        Employee employee = new Employee("Hamza", 23, 1234567890L, "234 AVE U, Brooklyn, NY 11223", 150000, "Developing", "Bug detecting");
        System.out.println(employee);
    }
}
/*
Two classes 'Employee' and 'Manager' inherits the 'Member' class.
The 'Employee' and 'Manager' classes have data members 'specialization' and
'department' respectively. Now, assign name, age, phone number, address and
salary to an employee and a manager by making an object of both of these classes
and print the same.
 */