package sabina.task2;

public class Employee extends Member{

   private String specialization;

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public Employee(String name, int age, long phoneNumber, String address, double salary, String specialization) {
        super(name, age, phoneNumber, address, salary);
        setSpecialization(specialization);
    }

    @Override
    public String toString() {
        return super.toString().replace("}", "") +
                ", specialization=" + specialization +
                '}';
    }
}
