package com.kgisl.qs1;

/**
 * InheritBlock
 */
public class Car {

    public Car(){
        System.out.println("Parent Constructor");
    }
    static{
        System.out.println("Parent Static Block");
    }
    {
        System.out.println("Parent initialisation  block");
    }
}
