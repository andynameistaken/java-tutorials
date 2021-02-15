package com.journaldev.abstract_classes;

public class AbstractTest {
    public static void main(String args[]) {

        //coding in terms of abstract classes
        Person student = new Employee("Dove","Female",0);
        Person employee = new Employee("Pankaj","Male",123);
        student.work();
        employee.work();
        //using method implemented in abstract class - inheritance
        employee.changeName("Pankaj Kumar");
        System.out.println(employee.toString());
    }
}

