package com.kgisl.ebarter.controller;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import com.kgisl.ebarter.model.Brokerage;
import com.opencsv.CSVReader;
import com.opencsv.bean.ColumnPositionMappingStrategy;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

/**
 * ReadCsv
 */
public class ReadCsv {

    public static  List<Brokerage> TradecsvtoBean(String path) throws IOException {
        // CSVReader reader = new CSVReader(new FileReader(path), ',');
        CSVReader reader = new CSVReader(new FileReader("src\\main\\resources\\Trade.csv"), ',');
		
		ColumnPositionMappingStrategy<Brokerage> beanStrategy = new ColumnPositionMappingStrategy<Brokerage>();
		beanStrategy.setType(Brokerage.class);
		beanStrategy.setColumnMapping(new String[] {"id","name","age","country"});
		
		CsvToBean<Brokerage> csvToBean = new CsvToBean<Brokerage>();
		
		List<Brokerage> emps = csvToBean.parse(beanStrategy, reader);
		
		// System.out.println(emps);
        return emps;

        
        
    }

}