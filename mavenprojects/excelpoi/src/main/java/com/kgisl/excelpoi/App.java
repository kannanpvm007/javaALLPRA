package com.kgisl.excelpoi;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
// import org.apache.poi.xssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.CellAddress;
import org.apache.poi.xssf.usermodel.XSSFSheet;
// import org.apache.poi.xssf.usermodel.HSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) throws IOException {
        try {
            FileInputStream file = new FileInputStream(
                    new File("D://sasikumar//java//mavenprojects//excelpoi//src//main//resources//studentresult.xlsx"));
            XSSFWorkbook workbook = new XSSFWorkbook(file);
            FormulaEvaluator evaluator = workbook.getCreationHelper().createFormulaEvaluator();
            XSSFSheet sheet = workbook.getSheet("Sheet1");
            Iterator<Row> rowIterator = sheet.iterator();
            while (rowIterator.hasNext()) {
                Row row = rowIterator.next();
                Iterator<Cell> cellIterator = row.cellIterator();
                while (cellIterator.hasNext()) {
                    Cell cell = cellIterator.next();
                    switch (cell.getCellType()) {
                    case NUMERIC:
                        System.out.print(cell.getNumericCellValue() + " ");
                        break;
                    case STRING:
                        System.out.print(cell.getStringCellValue() + " ");
                        break;
                    }
                }
                System.out.println("");
            }

            workbook.close();
            file.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
