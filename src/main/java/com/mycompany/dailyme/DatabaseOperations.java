package com.mycompany.dailyme;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class DatabaseOperations {
    public static boolean isLogin(String nickname, String password, String usertype, JFrame frame) {
        try {
            Connection myConn = DatabaseConnection.getConnection();
            String userInfoQuery = "SELECT UserID, Usertype, Nickname, Name FROM User WHERE Nickname = '"
                    + nickname + "' AND password = '" + password + "' AND Usertype = '" + usertype + "';";
            PreparedStatement userInfo = myConn.prepareStatement(userInfoQuery);
            ResultSet userInfoResult = userInfo.executeQuery();

            while(userInfoResult.next()) {
                LoginSession.userID = userInfoResult.getInt("UserID");
                LoginSession.usertype = userInfoResult.getString("Usertype");
                LoginSession.nickname = userInfoResult.getString("Nickname");
                LoginSession.userName = userInfoResult.getString("Name");
                
                return true;
            }
            LoginSession.isLoggedIn = true;
            
            } catch (Exception exception) {
            JOptionPane.showMessageDialog(frame, "Database error: " + exception.getMessage());
        }
        return false;
    }
    
    public static boolean setParameters(int userID, JFrame frame) {
        try {
            Connection myConn = DatabaseConnection.getConnection();
            String userParametersQuery = "SELECT Weight, Height, Age, Gender, WeightGoal FROM User_parameters WHERE UserID = '"
                    + userID + "';";
            PreparedStatement userParameters = myConn.prepareStatement(userParametersQuery);
            ResultSet userParametersResult = userParameters.executeQuery();
            
            while(userParametersResult.next()) {
                LoginSession.userWeight = userParametersResult.getDouble("Weight");
                LoginSession.userHeight = userParametersResult.getInt("Height");
                LoginSession.userAge = userParametersResult.getInt("Age");
                LoginSession.userGender = userParametersResult.getInt("Gender");
                LoginSession.userWeightGoal = userParametersResult.getDouble("WeightGoal");
                
                return true;
            } 
            
            } catch (Exception exception) {
                JOptionPane.showMessageDialog(frame, "Database error: " + exception.getMessage());
        }
        return false;
    }
    
    public static boolean checkNicknames(String nickname, JFrame frame) {
        try {
            Connection myConn = DatabaseConnection.getConnection();
            String userNicknamesQuery = "SELECT Nickname FROM User WHERE Nickname = '" + nickname + "';";
            PreparedStatement userNicknames = myConn.prepareStatement(userNicknamesQuery);
            ResultSet userNicknameResult = userNicknames.executeQuery();
            
            while(userNicknameResult.next()) {
                LoginSession.nicknameFound = userNicknameResult.getString("Nickname");
                
                return true;
            }
            
            } catch (Exception exception) {
                JOptionPane.showMessageDialog(frame, "Database error: " + exception.getMessage());
        }
        return false;
    }
    
    public static boolean checkEmails(String email, JFrame frame) {
        try {
            Connection myConn = DatabaseConnection.getConnection();
            String userEmailsQuery = "SELECT Email FROM User WHERE Email = '" + email + "';";
            PreparedStatement userEmail = myConn.prepareStatement(userEmailsQuery);
            ResultSet userEmailResult = userEmail.executeQuery();
            
            while(userEmailResult.next()) {
                LoginSession.emailFound = userEmailResult.getString("Email");
                
                return true;
            }
            
            } catch (Exception exception) {
                JOptionPane.showMessageDialog(frame, "Database error: " + exception.getMessage());
        }
        return false;
    }
    
    public static void register(String nickname, String password, String email, String name, int age, double weight, int height, double goal, int gender, JFrame frame) {
        try {
            Connection myConn = DatabaseConnection.getConnection();
            String registerUserQuery = "INSERT INTO User (Nickname, Name, Password, Email, Usertype) VALUES ('" + nickname +"', '" 
                    + name + "', '" + password + "', '" + email + "', 'regular');";
            String getUserIdQuery = "SELECT UserID FROM User WHERE Nickname = '" + nickname + "';";
            
            
            PreparedStatement registerUser = myConn.prepareStatement(registerUserQuery);
            registerUser.execute();
            
            PreparedStatement getUserId = myConn.prepareStatement(getUserIdQuery);
            ResultSet getUserIdResult = getUserId.executeQuery();
            
            while(getUserIdResult.next()) {
                LoginSession.userID = getUserIdResult.getInt("UserID");
            }
            
            String userInfoQuery = "INSERT INTO User_parameters VALUES (" + weight + ", " + height + ", " + age + ", " + gender + ", " + goal + ", " + LoginSession.userID + ");";
            
            PreparedStatement userInfo = myConn.prepareStatement(userInfoQuery);
            userInfo.execute();
            
            } catch (Exception exception) {
                JOptionPane.showMessageDialog(frame, "Database error: " + exception.getMessage());
        }
    }
    
    public static void updateUserParameters(double weight, int height, int age, int userID, JFrame frame) {
        try {
            Connection myConn = DatabaseConnection.getConnection();
            String updateParametersQuery = "UPDATE User_parameters SET Weight = " + weight + ", Height = " + height + ", Age = " + age + " WHERE UserID = " + userID + ";";
            PreparedStatement updateParameters = myConn.prepareStatement(updateParametersQuery);
            updateParameters.execute();

        } catch (Exception exception) {
            JOptionPane.showMessageDialog(frame, "Database error: " + exception.getMessage());
        }
    }
    
    public static void loadProductNames(JFrame frame) {
        try {
            
            Connection myConn = DatabaseConnection.getConnection();
            String productNamesQuery = "SELECT Name FROM Products;";
            PreparedStatement productNames = myConn.prepareStatement(productNamesQuery);
            ResultSet productNamesResult = productNames.executeQuery(); 
            
            while(productNamesResult.next()) {
                LoginSession.productNames.add(productNamesResult.getString("Name"));
                

            }
            
            //LoginSession.productNamesArray = (String[]) LoginSession.productNames.toArray(new String[LoginSession.productNames.size()]);
            } catch (Exception exception) {
                JOptionPane.showMessageDialog(frame, "Database error XD: " + exception.getMessage());
        }

    }
}
