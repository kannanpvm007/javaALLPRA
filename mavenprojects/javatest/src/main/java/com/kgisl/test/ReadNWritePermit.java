package com.kgisl.test;

import java.io.File;

/**
 * ReadNWritePermit
 */
public class ReadNWritePermit {

    public static void main(String[] args) {
        File file=new File("D://sasikumar//java//mavenprojects//javatest//src//main//java//resources/employee.csv");

        boolean fileExist=file.exists();
        if (fileExist==true) {
            System.out.println("File Read:"+file.canRead());
            System.out.println("File Write:"+file.canWrite());
            System.out.println("File Execute:"+file.canExecute());
        }
        else {
            System.out.println("File Not Exist");
        } 

        // File file1=new File("‪D://Excelfile.xlsx");

        // boolean fileExist1=file1.exists();
        // if (fileExist1==true) {
        //     System.out.println("File Read:"+file1.canRead());
        //     System.out.println("File Write:"+file1.canWrite());
        //     System.out.println("File Execute:"+file1.canExecute());
        // }
        // else {
        //     System.out.println("File Not Exist");
        // } 
    }
}