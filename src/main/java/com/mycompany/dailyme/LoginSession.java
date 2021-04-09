package com.mycompany.dailyme;

import java.util.ArrayList;
import java.util.List;

public class LoginSession {
    public static int userID;
    public static String usertype;
    public static String nickname;
    public static String userName;
    public static String nicknameFound;
    public static String emailFound;
    public static ArrayList<String> productNames = new ArrayList<String>();
    public static String[] productNamesArray;
    public static double userWeight;
    public static int userHeight;
    public static int userAge;
    public static int userGender;
    public static int productWeight;
    public static double productKcal;
    public static double productProteins;
    public static double productFats;
    public static double productCarbs;
    public static double userWeightGoal;
    public static boolean isLoggedIn = false;
    
    public static void resetParameters () {
        userID = 0;
        nickname = null;
        userName = null;
        nicknameFound = null;
        emailFound = null;
        userWeight = 0;
        userHeight = 0;
        userAge = 0;
        userGender = 0;
        userWeightGoal = 0;
    }
    
}
