package hamzaAli;

public class Member {
    private String name;
    private int age;
    private long phoneNumber;
    private String address;
    private double salary;

    public Member(String name, int age, long phoneNumber, String address, double salary) {
        setName(name);
        setAge(age);
        setPhoneNumber(phoneNumber);
        setAddress(address);
        setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void printSalary() {
        System.out.println("Salary: " + salary);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phoneNumber=" + phoneNumber +
                ", address='" + address + '\'' +
                ", salary=" + salary +
                '}';
    }
}
/*
Create a class named 'Member' having the following members:
Name, Age, Phone number, Address, Salary
It also has a method named 'printSalary' which prints the salary of the members

Two classes 'Employee' and 'Manager' inherits the 'Member' class.
The 'Employee' and 'Manager' classes have data members 'specialization' and
'department' respectively. Now, assign name, age, phone number, address and
salary to an employee and a manager by making an object of both of these classes
and print the same.
 */