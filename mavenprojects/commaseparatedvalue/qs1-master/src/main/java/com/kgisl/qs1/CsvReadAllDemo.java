package com.kgisl.qs1;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.opencsv.CSVReader;

/**
 * CsvReadAllDemo
 */
public class CsvReadAllDemo {

    public static void main(String[] args) {
        try {
            CSVReader reader = new CSVReader(new FileReader(
                    "D://sasikumar/java/mavenprojects/commaseparatedvalue/qs1-master/src/main/java/com/kgisl/qs1/EmployeeDemo.csv"),
                    ',');
            List<Employee> list = new ArrayList<Employee>();
            List<String[]> list1 = reader.readAll();
            Iterator<String[]> iterator = list1.iterator();

            while (iterator.hasNext()) {
                String[] record = iterator.next();
                Employee emp = new Employee();
                emp.setId(record[0]);
                emp.setName(record[1]);
                emp.setAge(record[2]);
                emp.setCountry(record[3]);
                list.add(emp);
            }
            System.out.println(list);
            reader.close();

        } catch (Exception e) {
            System.out.println("File not found");
        }
    }
}