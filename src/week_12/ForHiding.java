package week_12;

public class ForHiding {

    public static void main(String[] args) {
        ElementaryStudent elementaryStudent = new ElementaryStudent();
        System.out.println(elementaryStudent.name);


    }
}


class Student{
    String name="StudentName";


    public static void method(){
        System.out.println("method in super");
    }
}

class ElementaryStudent extends Student{
    String name=super.name;

    public static void method(){
        System.out.println("method in super");
    }

}
