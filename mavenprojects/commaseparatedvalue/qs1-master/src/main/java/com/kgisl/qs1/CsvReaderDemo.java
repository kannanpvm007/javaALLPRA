package com.kgisl.qs1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.CSVReader;

/**
 * CsvReaderDemo
 */
public class CsvReaderDemo {

   

    

    public static void main(String[] args) throws IOException {
        try {

            CSVReader reader = new CSVReader(new FileReader("D://sasikumar/java/mavenprojects/commaseparatedvalue/qs1-master/src/main/java/com/kgisl/qs1/EmployeeDemo.csv"), ',');
            List<Employee> employee = new ArrayList<Employee>();
            String[] fileReader = null;
            while ((fileReader = reader.readNext()) != null) {
                Employee emp = new Employee();
                emp.setId(fileReader[0]);
                emp.setName(fileReader[1]);
                emp.setAge(fileReader[2]);
                emp.setCountry(fileReader[3]);
                employee.add(emp);
            }
            System.out.println(employee);
            reader.close();
        } catch (Exception e) {
            System.out.println("File not found");
        }
    }
}