package com.mycompany.dailyme;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
    public static Connection getConnection() throws Exception {  

        String dbUrl = "jdbc:mysql://localhost:3306/sakila";
        String hostUsername = "root";
        String hostPassword = "DMpass_21";
        
        Connection myConn = (Connection)DriverManager.getConnection(dbUrl, hostUsername, hostPassword);
        
        return myConn;
    }
}
