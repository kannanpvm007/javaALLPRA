package com.kgisl.qs1;

/**
 * InterfaceExample
 */
public interface InterfaceExample {

    default void newMethod() {
        System.out.println("This is new method");
    }
    public static void anotherNewMethod(){
        System.out.println("This is another new method");
    }
    void existingMethod(String str);
}
