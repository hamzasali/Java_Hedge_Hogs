package linked_list_practice.genericImplementation;

public class Student {

    String fullName,school;
    int age;

    public Student(String fullName, String school, int age) {
        this.fullName = fullName;
        this.school = school;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "fullName='" + fullName + '\'' +
                ", school='" + school + '\'' +
                ", age=" + age +
                '}';
    }
}
