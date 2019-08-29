package com.kgisl.qs1;

public class Engine extends Car {
    static{
        System.out.println("Child Static block");
    }
    public Engine(){
        System.out.println("Child Constructor");
    }
    {
        System.out.println("Child initialisation  block");
    }
    public static void main(String[] args) {
        new Engine();
    }
}