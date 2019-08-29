package com.kgisl.qs1;


import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.bean.ColumnPositionMappingStrategy;
import com.opencsv.bean.CsvToBean;

/**
 * CsvToBeanDemo
 */
public class CsvToBeanDemo {

    public static void main(String[] args) throws IOException {
      
        CSVReader reader1=new CSVReader(new FileReader("D://sasikumar//java//mavenprojects//commaseparatedvalue//qs1-master//src//main//java//com//kgisl//qs1//EmployeeDemo.csv"),',');
        ColumnPositionMappingStrategy<Employee> mappingStrategy=new ColumnPositionMappingStrategy<Employee>();
        mappingStrategy.setType(Employee.class);
        mappingStrategy.setColumnMapping(new String[] {"id","name","age","country"});
        CsvToBean<Employee> bean=new CsvToBean<Employee>();
        List<Employee> list=bean.parse(mappingStrategy,reader1);
        System.out.print(list);
        reader1.close();
       
    }
}