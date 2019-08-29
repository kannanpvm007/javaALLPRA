package com.kgisl.qs1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * ReadingSingleCharacterDemo
 */
public class ReadingSingleCharacterDemo {

    public static void main(String[] args) throws IOException {
        FileReader reader=new FileReader("D://sasikumar/java/mavenprojects/commaseparatedvalue/qs1-master/src/main/java/com/kgisl/qs1/EmployeeDemo.csv");
        BufferedReader br=new BufferedReader(reader);
        int i;
        while ((i=br.read())!=-1) {
            System.out.print((char)i);
        }
        reader.close();
        br.close();
    }
}