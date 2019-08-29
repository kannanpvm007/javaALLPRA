package com.kgisl.excelpoi;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.hssf.record.cf.PatternFormatting;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFColor;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * POIWrite
 */
public class POIWriter {

    public static void main(String[] args) throws NullPointerException {
        XSSFWorkbook workbook = new XSSFWorkbook();
        FormulaEvaluator evaluator = workbook.getCreationHelper().createFormulaEvaluator();
        XSSFSheet sheet = workbook.createSheet("Employee Data");
        Map<String, Object[]> data = new TreeMap<String, Object[]>();
        data.put("1", new Object[] { "Id", "Name", "dept", "Mark1", "Mark2", "Mark3" });
        data.put("2", new Object[] { 1, "sasi", "it", 78, 56, 44 });
        data.put("3", new Object[] { 2, "meena", "cs", 56, 77, 44 });
        data.put("4", new Object[] { 3, "shiens", "btech", 43, 67, 34 });
        data.put("5", new Object[] { 4, "prabha", "it", 34, 65, 33 });
        data.put("6", new Object[] { 5, "sathyaraj", "it", 67, 86, 56 });
        data.put("7", new Object[] { 6, "Gk", "it", 34, 65, 33 });
        Set<String> keyset = data.keySet();
        int rownum = 0;
        for (String key : keyset) {
            Row row = sheet.createRow(rownum++);
            Object[] objArr = data.get(key);
            int cellnum = 0;
            for (Object obj : objArr) {
                Cell cell = row.createCell(cellnum++);
                if (obj instanceof String)
                    cell.setCellValue((String) obj);
                else if (obj instanceof Integer)
                    cell.setCellValue((Integer) obj);
            }
            sheet.getRow(0).createCell(6).setCellValue("Total");

        }
        sheet.getRow(1).createCell(6).setCellFormula("SUM(D2:F2)");
        sheet.getRow(2).createCell(6).setCellFormula("(D3+E3+F3)");
        sheet.getRow(3).createCell(6).setCellFormula("(D4+E4+F4)");
        sheet.getRow(4).createCell(6).setCellFormula("(D5+E5+F5)");
        sheet.getRow(5).createCell(6).setCellFormula("(D6+E6+F6)");
        sheet.getRow(6).createCell(6).setCellFormula("(D7+E7+F7)");

        try {
            FileOutputStream out = new FileOutputStream(new File("D://Excelfile.xlsx"));
            workbook.write(out);
            out.close();
            System.out.println("Excelfile.xlsx written successfully on disk.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
