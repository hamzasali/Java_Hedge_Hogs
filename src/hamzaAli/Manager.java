package hamzaAli;

public class Manager extends Member {

    public Manager(String name, int age, long phoneNumber, String address, double salary, String specialization, String department) {
        super(name, age, phoneNumber, address, salary);
        setSpecialization(specialization);
        setDepartment(department);
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

        Manager manager = new Manager("Hamza", 23, 1234567890L, "234 AVE U, Brooklyn, NY 11223", 150000, "Developing", "Bug detecting");

        System.out.println(manager);
    }
}
