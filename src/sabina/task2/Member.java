package sabina.task2;

import java.time.LocalDate;

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


    public void printSalary(){
        System.out.println("Salary of " + name + " is $" + salary);
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
