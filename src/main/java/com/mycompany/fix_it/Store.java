package com.mycompany.fix_it;

import java.sql.*;
public class Store {


    public static void connect() {
        String url = "jdbc:mysql://sql8.freemysqlhosting.net";
        //String url = "sql8.freemysqlhosting.net";
        String username = "sql8614265";
        String password = "EMxp1rkYMb";

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, username, password);
            System.out.println("connected !!!");
            Statement s = conn.createStatement();
            s.execute("USE sql8614265");
        } catch(Exception e){ System.out.println(e);}
    }

}
        

    

