package com.mycompany.fix_it;

import java.sql.*;
public class Store {


    public static void connect() {
        String url = "jdbc:mysql://sql8.freemysqlhosting.net"; //this is the URL with add-on of the dataBase the below is the base URL
        //String url = "sql8.freemysqlhosting.net"; //base URL
        String username = "sql8614265"; //USERNAME and the name of the dataBASE
        String password = "EMxp1rkYMb"; //PASS of the database

        try{
            Class.forName("com.mysql.cj.jdbc.Driver"); //things related to the JAR file
            Connection conn = DriverManager.getConnection(url, username, password); //making the connection
            System.out.println("connected !!!");
            Statement s = conn.createStatement(); //create statement
            s.execute("USE sql8614265"); //to use this database (we only have 1 database in the server)
            s.close(); //close the Statement
        } catch(Exception e){ System.out.println(e);}
    }

}
        

    

