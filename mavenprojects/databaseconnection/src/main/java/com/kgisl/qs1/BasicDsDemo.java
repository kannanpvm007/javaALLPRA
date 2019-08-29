package com.kgisl.qs1;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.MysqlDataSource;

import org.apache.commons.dbcp.BasicDataSource;

/**
 * basicds
 */
public class BasicDsDemo {

    Connection connect = null;
    BasicDataSource bds = new BasicDataSource();
    BasicDsDemo() {
        bds.setUrl("jdbc:mysql://localhost:3306/book");
        bds.setUsername("root");
        bds.setPassword("");
    }

    public Connection createConnection() {
        Connection con = null;
        try {
            if (connect != null) {
                System.out.println("Cant create a New Connection");
            } else {
                con = bds.getConnection();
                System.out.println("Connection Done successfully");
            }
        } catch (Exception e) {
            System.out.println("Error Occured " + e.toString());
        }
        return con;
    }

    public static void main(String args[]) throws Exception {
        display();
        delete();
        update();
        // insert();

    }

    private static void display() throws SQLException {
        BasicDsDemo dsExample = new BasicDsDemo();
        Connection con = dsExample.createConnection();
        Statement statement = con.createStatement();
        String query = "select * from books";
        ResultSet rset = statement.executeQuery(query);
        while (rset.next()) {
            System.out.println("id:" + rset.getInt("id") + "," + " title:" + rset.getString("title") + "," + " author:"
                    + rset.getString("author") + "," + " price:" + rset.getInt("price") + "," + " qty:"
                    + rset.getInt("qty")+"\n");
        }
        con.close();
        statement.close();
        rset.close();
    }

    private static void delete() throws SQLException {
        String query = "delete from books where id>102";
        BasicDsDemo dsExample = new BasicDsDemo();
        Connection con = dsExample.createConnection();
        Statement statement = con.createStatement();
        int count = statement.executeUpdate(query);
        System.out.println("records deleted:" + count);
        String select="select * from books";
        ResultSet rset=statement.executeQuery(select);
        while (rset.next()) {
            System.out.println("id:" + rset.getInt("id") + "," + " title:" + rset.getString("title") + "," + " author:"
                    + rset.getString("author") + "," + " price:" + rset.getInt("price") + "," + " qty:"
                    + rset.getInt("qty")+"\n");
        }
        statement.close();
        con.close();
    }

    private static void update() throws SQLException {
        String query="update books set price=700 where id=101";
        BasicDsDemo dsExample=new BasicDsDemo();
        Connection con=dsExample.createConnection();
        Statement statement=con.createStatement();
        int count=statement.executeUpdate(query);
        System.out.println("records updated"+count);
        String select="select * from books";
        ResultSet rset=statement.executeQuery(select);
        while (rset.next()) {
            System.out.println("id:" + rset.getInt("id") + "," + " title:" + rset.getString("title") + "," + " author:"
                    + rset.getString("author") + "," + " price:" + rset.getInt("price") + "," + " qty:"
                    + rset.getInt("qty")+"\n");
        }
        statement.close();
        con.close();
    }

}
