package com.kgisl.qs1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.jdbc.MysqlDataSource;
import com.opencsv.CSVReader;

/**
 * CsvToDatabase
 */
public class CsvToDatabase {

    Connection con = null;
    MysqlDataSource dataSource = new MysqlDataSource();

    CsvToDatabase() {

        dataSource.setURL("jdbc:mysql://localhost:3306/employee");
        dataSource.setUser("root");
        dataSource.setPassword("");
    }

    public static void main(String[] args) throws SQLException, FileNotFoundException {

        display();
        insert();

    }

    private static void display() throws SQLException {

        CsvToDatabase csvToDb = new CsvToDatabase();
        Connection connection = csvToDb.createConnection();
        Statement stmt = connection.createStatement();
        String query = "select * from employees";
        ResultSet rSet = stmt.executeQuery(query);
        while (rSet.next()) {
            System.out.println("Id" + rSet.getString("Id") + " " + "Name" + rSet.getString("Name") + " " + "Age"
                    + rSet.getString("Age") + "Country" + rSet.getString("Country"));

            connection.close();
            stmt.close();
            rSet.close();
        }
    }

    private static void insert() throws SQLException, FileNotFoundException {

        CsvToDatabase csvToDb = new CsvToDatabase();
        Connection connection = csvToDb.createConnection();
        String query = "insert into employees (id,name,age,country)" + "values(?,?,?,?)";
        PreparedStatement prepareStmt = connection.prepareStatement(query);
        CSVReader reader = new CSVReader(new FileReader(
                "D:\\sasikumar\\java\\mavenprojects\\databaseconnection\\src\\main\\resources\\employee.csv"));
        List<Employee> employ = new ArrayList<Employee>();
        String[] arr = null;
        try {
            while ((arr = reader.readNext()) != null) {
                Employee emp = new Employee();
                emp.setId(arr[0]);
                emp.setName(arr[1]);
                emp.setAge(arr[2]);
                emp.setCountry(arr[3]);
                employ.add(emp);
            }
        } catch (Exception e1) {
            System.out.println(e1);
        }

        int i = 1;
        for (Employee var : employ) {
            prepareStmt.setString(1, var.getId());
            prepareStmt.setString(2, var.getName());
            prepareStmt.setString(3, var.getAge());
            prepareStmt.setString(4, var.getCountry());
            i += prepareStmt.executeUpdate();
        }

        System.out.println(i);
        System.out.println(employ);
    }

    private Connection createConnection() {
        Connection connection = null;
        try {
            connection = dataSource.getConnection();
        } catch (Exception e) {
            System.out.println(e);
        }
        return connection;
    }
}