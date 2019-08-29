package com.kgisl.qs1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.xdevapi.Statement;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

        List<Book> list = new ArrayList<Book>();

        try {

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/book", "root", "");
            java.sql.Statement stmt = con.createStatement();

            ////// INSERT//////

            String strSelect = "select id, title, author ,price , qty from books";
            ResultSet rset = ((java.sql.Statement) stmt).executeQuery(strSelect);
            System.out.println("The records selected are:");
            int rowCount = 0;
            while (rset.next()) {
                int id = rset.getInt("id");
                String title = rset.getString("title");
                String author = rset.getString("author");
                int price = rset.getInt("price");
                int qty = rset.getInt("qty");
                // System.out.println(id + ", " + title + "," + author + "," + price + " " +
                // qty);
                ++rowCount;
                list.add(new Book(id, title, author, price, qty));
            }
            System.out.println(list+"\n");
            System.out.println("Total number of records = " + rowCount+"\n");

            ////// UPDATE//////

            String strUpdate = "update books set price=price+50,qty=qty+2 where id=101";
            int countUpdated = stmt.executeUpdate(strUpdate);
            System.out.println("No of records affected after update:" + countUpdated+"\n");
            String strSelect1 = "select * from books where id = 101";
            ResultSet rset1 = stmt.executeQuery(strSelect1);
            while (rset1.next()) {
                System.out.println("Updated record is:");
                System.out.println(rset1.getInt("id") + ", " + rset1.getString("author") + ", "
                        + rset1.getString("title") + ", " + rset1.getDouble("price") + ", " + rset1.getInt("qty")+"\n");
            }

            ////// DELETE//////

            String strDelete = "delete from books where id>102";
            int countDeleted = stmt.executeUpdate(strDelete);
            System.out.println("No of records affected after deletion:" + countDeleted+"\n");
            String strSelect2 = "select * from books";
            ResultSet rset2 = stmt.executeQuery(strSelect2);
            System.out.println("Updated record after deletion:");
            while (rset2.next()) {
                System.out.println(rset2.getInt("id") + ", " + rset2.getString("author") + ", "
                        + rset2.getString("title") + ", " + rset2.getDouble("price") + ", " + rset2.getInt("qty")+"\n");
            }

            //////INSERT//////

            String insert="insert into books values(103,'c','balagurusamy',500,3)";
            int countInserted=stmt.executeUpdate(insert);
            System.out.println("No of records affected after deletion:" + countInserted+"\n");
            String strSelect3 = "select * from books";
            ResultSet rset3 = stmt.executeQuery(strSelect3);
            System.out.println("Updated record after insertion:");
            while (rset3.next()) {
                System.out.println(rset3.getInt("id") + ", " + rset3.getString("author") + ", "
                        + rset3.getString("title") + ", " + rset3.getDouble("price") + ", " + rset3.getInt("qty"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
