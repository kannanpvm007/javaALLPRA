package com.kgisl.qs1;

import java.util.Comparator;

class Employee
{
    public static Comparator<? super Employee> getAge;
	private String name;
    private int age;
   Employee(String name,int age)
   {
       this.name=name;
       this.age=age;
   }
    public String getName()
    {
        return name;
    }
    
    public int getAge()
    {
        return age;
    }
    public String toString()
    {
        return "  name: "+name+"  age: "+age;
    }
}