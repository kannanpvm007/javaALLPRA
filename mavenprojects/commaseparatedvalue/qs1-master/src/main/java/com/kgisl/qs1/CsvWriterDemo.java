package com.kgisl.qs1;

import java.io.File;
import java.io.FileWriter;

import com.opencsv.CSVWriter;

/**
 * CsvWriterDemo
 */
public class CsvWriterDemo {

    public static void main(String[] args) {
        File file=new File("D://sasikumar/java/mavenprojects/commaseparatedvalue/qs1-master/src/main/java/com/kgisl/qs1/Employee.java");
        try {
            FileWriter fileWriter=new FileWriter(file);
            //CSVWriter 
        } catch (Exception e) {
            //TODO: handle exception
        }
    }
}