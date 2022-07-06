package sabina.task2;

public class TestObjects {
    public static void main(String[] args) {

        Employee employee = new Employee("James", 23, 1234567896L, "29462 N Plaza Rd, California, Missouri(MO), 65018",  120000, "Business Analytics");

        Manager manager = new Manager( " Kelly", 33, 1234567898L, "34993 Woods Crossing Rd, California, Missouri(MO), 65018", 130000, "Customer Relationship Management", "Custom Service");




        System.out.println(employee); // Employee{name='James', age=23, phoneNumber=1234567896, address='29462 N Plaza Rd, California, Missouri(MO), 65018', salary=120000.0, specialization=Business Analytics}
        System.out.println(manager); //Manager{name=' Kelly', age=33, phoneNumber=1234567898, address='34993 Woods Crossing Rd, California, Missouri(MO), 65018', salary=130000.0, specialization=Customer Relationship Management, department=Custom Service}


        employee.printSalary(); //Salary of James is $120000.0
        manager.printSalary(); //Salary of  Kelly is $130000.0

    }





}
