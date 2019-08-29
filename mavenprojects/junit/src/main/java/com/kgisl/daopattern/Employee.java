package com.kgisl.daopattern;

/**
 * Employee
 */
public class Employee {

    // private int empid;
    private String empname;
    public Employee(String empname){
        // this.empid=empid;
        this.empname=empname;
    }
    // public int getId(){
    //     return empid;
    // }
    // public void setId(int empid){
    //     this.empid=empid;
    // }
    public String getName() {
        return empname;
    }
    public void setName(String empname) {
        this.empname=empname;
    }
}