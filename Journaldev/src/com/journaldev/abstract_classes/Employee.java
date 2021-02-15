package com.journaldev.abstract_classes;


public class Employee extends Person {

    private int empId;

    public Employee(String nm, String gen, int id) {
        super(nm, gen);
        this.empId=id;
    }

    @Override
    public void work() {
        if(empId == 0){
            System.out.println("Not working");
        }else{
            System.out.println("Working as employee!!");
        }
    }


}

