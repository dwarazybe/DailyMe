package com.mycompany.dailyme;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {
    public static Connection getConnection() throws Exception {  
        String dbUrl = "jdbc:mysql://remotemysql.com:3306/N2rLPTCcF2?autoReconnect=true";
        String hostUsername = "N2rLPTCcF2";
        String hostPassword = "JNVj1q7DyZ";
        
        Connection myConn = (Connection)DriverManager.getConnection(dbUrl, hostUsername, hostPassword);
        
        return myConn;
    }
}
