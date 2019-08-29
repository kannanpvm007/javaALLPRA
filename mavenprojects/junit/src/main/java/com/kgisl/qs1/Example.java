package com.kgisl.qs1;

public class Example implements InterfaceExample {
    public void existingMethod(String str){
        System.out.println("Existing method:"+str);
    }
    public static void main(String[] args) {
        Example ex=new Example();
        ex.newMethod();
        InterfaceExample.anotherNewMethod();
        ex.existingMethod("This is existing method");
    }
}

   

    

    
    