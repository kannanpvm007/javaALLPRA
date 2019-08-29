package com.kgisl.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.CSVReader;

/**
 * Hello world!
 *
 */
public class CompareTextFiles {
    public static void main(String[] args) throws IOException {

        FileReader file1 = new FileReader(
                "D://sasikumar//java//mavenprojects//javatest//src//main//java//resources/emp.txt");
        FileReader file2 = new FileReader(
                "D://sasikumar//java//mavenprojects//javatest//src//main//java//resources/emp1.txt");

        BufferedReader reader1 = new BufferedReader(file1);
        BufferedReader reader2 = new BufferedReader(file2);

        List<String> list1 = new ArrayList<String>();
        List<String> list2 = new ArrayList<String>();

        String record1 = null;
        while ((record1 = reader1.readLine()) != null) {
            list1.add(record1);
        }

        String record2 = null;
        while ((record2 = reader2.readLine()) != null) {
            String[] read = record2.split(" ");
            list2.add(read[0]);
            list2.add(read[1]);
        }

        System.out.println("Data in file1:");
        System.out.println(list1 + "\n");
        System.out.println("Data in file2:");
        System.out.println(list2 + "\n");
        System.out.println("Difference:");
        list2.removeAll(list1);
        System.out.println(list2);
    }

}
