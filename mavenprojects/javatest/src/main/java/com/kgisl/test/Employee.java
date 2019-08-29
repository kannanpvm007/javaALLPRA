package com.kgisl.test;

/**
 * Employee
 */
public class Employee {

    String Id;
    String Name;
    String Dept;
    String Mark1;
    String Mark2;
    String Mark3;
    
    Employee(){
        this.Id=Id;
        this.Name=Name;
        this.Dept=Dept;
        this.Mark1=Mark1;
        this.Mark2=Mark2;
        this.Mark3=Mark3;
    }

    /**
     * @return the id
     */
    public String getId() {
        return Id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        Id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return Name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        Name = name;
    }

    /**
     * @return the dept
     */
    public String getDept() {
        return Dept;
    }

    /**
     * @param dept the dept to set
     */
    public void setDept(String dept) {
        Dept = dept;
    }

    /**
     * @return the mark1
     */
    public String getMark1() {
        return Mark1;
    }

    /**
     * @param mark1 the mark1 to set
     */
    public void setMark1(String mark1) {
        Mark1 = mark1;
    }

    /**
     * @return the mark2
     */
    public String getMark2() {
        return Mark2;
    }

    /**
     * @param mark2 the mark2 to set
     */
    public void setMark2(String mark2) {
        Mark2 = mark2;
    }

    /**
     * @return the mark3
     */
    public String getMark3() {
        return Mark3;
    }

    /**
     * @param mark3 the mark3 to set
     */
    public void setMark3(String mark3) {
        Mark3 = mark3;
    }

    @Override
    public String toString() {
        return Id+" "+Name+" "+" "+Dept+" "+" "+Mark1+" "+Mark2+" "+Mark3;
    }
}