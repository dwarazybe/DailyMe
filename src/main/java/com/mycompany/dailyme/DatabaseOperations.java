package com.mycompany.dailyme;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class DatabaseOperations {
    protected static Connection myConn;
    
    public static void connectToDatabase() throws Exception {
        myConn = DatabaseConnection.getConnection();
    }
    
    public static boolean isLogin(String nickname, String password, String usertype, JFrame frame) {
        try {
            String userInfoQuery = "SELECT UserID, Usertype, Nickname, Name FROM User WHERE Nickname = '"
                    + nickname + "' AND password = '" + password + "' AND Usertype = '" + usertype + "';";
            PreparedStatement userInfo = myConn.prepareStatement(userInfoQuery);
            ResultSet userInfoResult = userInfo.executeQuery();

            while(userInfoResult.next()) {
                LoginSession.userID = userInfoResult.getInt("UserID");
                LoginSession.usertype = userInfoResult.getString("Usertype");
                LoginSession.nickname = userInfoResult.getString("Nickname");
                LoginSession.userName = userInfoResult.getString("Name");
                if(LoginSession.userID > 0)
                    return true;
                }         
            } catch (SQLException exception) {
            JOptionPane.showMessageDialog(frame, "Database error: " + exception.getMessage());
            }
        return false;
    }
    
    public static boolean setParameters(JFrame frame) {
        try {
            String userParametersQuery = "SELECT Weight, Height, Age, Gender, WeightGoal FROM User_parameters WHERE UserID = '"
                    + LoginSession.userID + "';";
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
            
            } catch (SQLException exception) {
                JOptionPane.showMessageDialog(frame, "Database error: " + exception.getMessage());
            }
        return false;
    }
    
    public static boolean checkNicknames(String nickname, JFrame frame) {
        try {
            String userNicknamesQuery = "SELECT Nickname FROM User WHERE Nickname = '" + nickname + "';";
            PreparedStatement userNicknames = myConn.prepareStatement(userNicknamesQuery);
            ResultSet userNicknameResult = userNicknames.executeQuery();
            
            while(userNicknameResult.next()) {
                LoginSession.nicknameFound = userNicknameResult.getString("Nickname");
                
                return true;
            }
            
            } catch (SQLException exception) {
                JOptionPane.showMessageDialog(frame, "Database error: " + exception.getMessage());
            }
        return false;
    }
    
    public static boolean checkEmails(String email, JFrame frame) {
        try {
            String userEmailsQuery = "SELECT Email FROM User WHERE Email = '" + email + "';";
            PreparedStatement userEmail = myConn.prepareStatement(userEmailsQuery);
            ResultSet userEmailResult = userEmail.executeQuery();
            
            while(userEmailResult.next()) {
                LoginSession.emailFound = userEmailResult.getString("Email");
                
                return true;
            }
            
            } catch (SQLException exception) {
                JOptionPane.showMessageDialog(frame, "Database error: " + exception.getMessage());
            }
        return false;
    }
    
    public static void register(String nickname, String password, String email, String name, int age, double weight, int height, double goal, int gender, JFrame frame) {
        try {
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
            
            } catch (SQLException exception) {
                JOptionPane.showMessageDialog(frame, "Database error: " + exception.getMessage());
            }
    }
    
    public static void updateUserParameters(double weight, int height, int age, int userID, JFrame frame) {
        try {
            String updateParametersQuery = "UPDATE User_parameters SET Weight = " + weight + ", Height = " + height + ", Age = " + age + " WHERE UserID = " + userID + ";";
            PreparedStatement updateParameters = myConn.prepareStatement(updateParametersQuery);
            updateParameters.execute();

        } catch (SQLException exception) {
            JOptionPane.showMessageDialog(frame, "Database error: " + exception.getMessage());
        }
    }
    
    public static void loadProductNames(JFrame frame) {
        try {
            String productNamesQuery = "SELECT Name FROM Products;";
            PreparedStatement productNames = myConn.prepareStatement(productNamesQuery);
            ResultSet productNamesResult = productNames.executeQuery(); 
            LoginSession.productNames.clear();
            while(productNamesResult.next()) {
                LoginSession.productNames.add(productNamesResult.getString("Name"));
            }
            
            } catch (SQLException exception) {
                JOptionPane.showMessageDialog(frame, "Database error: " + exception.getMessage());
            }

    }
    
    public static void loadProductInfo(String productName, JFrame frame) {
        try {
            String productInfoQuery = "SELECT Weight, Calories, Proteins, Fats, Carbs FROM Products WHERE Name = '" + productName + "';";
            PreparedStatement productInfo = myConn.prepareStatement(productInfoQuery);
            ResultSet productInfoResult = productInfo.executeQuery(); 
            
            while(productInfoResult.next()) {
                LoginSession.productWeight = productInfoResult.getInt("Weight");
                LoginSession.productKcal = productInfoResult.getDouble("Calories");
                LoginSession.productProteins = productInfoResult.getDouble("Proteins");
                LoginSession.productFats = productInfoResult.getDouble("Fats");
                LoginSession.productCarbs = productInfoResult.getDouble("Carbs");
            }
            
            } catch (SQLException exception) {
                JOptionPane.showMessageDialog(frame, "Database error: " + exception.getMessage());
            }
    }
    
    public static void archiveMealDiary(double kcal, double proteins, double fats, double carbs, JFrame frame) {
        try {
            String archiveMealDiaryQuery = "INSERT INTO MealsArchive (DiaryDate, Calories, Proteins, Fats, Carbs, UserID) VALUES (Curdate(), " + kcal + ", " + proteins + ", " 
                    + fats + ", " + carbs + ", " + LoginSession.userID + ");";                 
            PreparedStatement archiveMealDiary = myConn.prepareStatement(archiveMealDiaryQuery);
            archiveMealDiary.execute();

            } catch (SQLException exception) {
                JOptionPane.showMessageDialog(frame, "Database error: " + exception.getMessage());
            }
    }
    
    public static void deleteLastMeals(JFrame frame) {
        try {
            String deleteLastMealsQuery = "DELETE FROM LastMealsArchive WHERE UserID = " + LoginSession.userID + ";";           
            PreparedStatement deleteLastMeals = myConn.prepareStatement(deleteLastMealsQuery);
            deleteLastMeals.execute();

            } catch (SQLException exception) {
                JOptionPane.showMessageDialog(frame, "Database error: " + exception.getMessage());
            }
    }
    
    public static void archiveLastMeals(String name, double kcal, double proteins, double fats, double carbs, JFrame frame) {
        try {
            String archiveLastMealsQuery = "INSERT INTO LastMealsArchive (MealDate, MealName, Calories, Proteins, Fats, Carbs, UserID) VALUES (Curdate(), '" + name + "', " 
                    + kcal + ", " + proteins + ", " + fats + ", " + carbs + ", " + LoginSession.userID + ");";   
            PreparedStatement archiveLastMeals = myConn.prepareStatement(archiveLastMealsQuery);
            archiveLastMeals.execute();

            } catch (SQLException exception) {
                JOptionPane.showMessageDialog(frame, "Database error: " + exception.getMessage());
            }
    }
    
    public static void loadLastMeals(JFrame frame) {
        try {
            String loadLastMealsQuery = "SELECT MealName, Calories, Proteins, Fats, Carbs FROM LastMealsArchive WHERE UserID = " + LoginSession.userID + ";";
            String countMealsQuery = "SELECT COUNT(*) AS MealsNumber FROM LastMealsArchive WHERE UserID = " + LoginSession.userID + ";";
            PreparedStatement loadLastMeals = myConn.prepareStatement(loadLastMealsQuery);
            PreparedStatement countMeals = myConn.prepareStatement(countMealsQuery);
            ResultSet loadLastMealsResult = loadLastMeals.executeQuery(); 
            ResultSet countMealsResult = countMeals.executeQuery();
            int i = 0;
            
            while(countMealsResult.next()) {
                LoginSession.mealsNumber = countMealsResult.getInt("MealsNumber");
            }
            
            while(loadLastMealsResult.next()) {
                LoginSession.mealNameArray[i] = loadLastMealsResult.getString("MealName");
                LoginSession.mealKcalArray[i] = loadLastMealsResult.getDouble("Calories");
                LoginSession.mealProteinsArray[i] = loadLastMealsResult.getDouble("Proteins");
                LoginSession.mealFatsArray[i] = loadLastMealsResult.getDouble("Fats");
                LoginSession.mealCarbsArray[i] = loadLastMealsResult.getDouble("Carbs");
                i++;
            }

            } catch (SQLException exception) {
                JOptionPane.showMessageDialog(frame, "Database error: " + exception.getMessage());
            }
    }
    
    public static void archiveWorkoutDiary(String type, double weight, int time, int intensityLevel, double kcal, JFrame frame) {
        try {
            String archiveWorkoutDiaryQuery = "INSERT INTO WorkoutArchive (WorkoutDate, WorkoutType, Weight, WorkoutTime, IntensityLevel, Calories, UserID) VALUES (Curdate(), '" 
                    + type + "', " + weight + ", " + time + ", " + intensityLevel + ", " + kcal + ", " + LoginSession.userID + ");";                 
            PreparedStatement archiveWorkoutDiary = myConn.prepareStatement(archiveWorkoutDiaryQuery);
            archiveWorkoutDiary.execute();

            } catch (SQLException exception) {
                JOptionPane.showMessageDialog(frame, "Database error: " + exception.getMessage());
            }
    }
    
    public static void saveNotes(String notes, JFrame frame) {
        try {
            String deleteUserNotesQuery = "DELETE FROM User_notes WHERE UserID = " + LoginSession.userID + ";";
            String saveUserNotesQuery = "INSERT INTO User_notes (Notes, UserID) VALUES ('" 
                    + notes + "', " + LoginSession.userID + ");";        
            PreparedStatement deleteUserNotes = myConn.prepareStatement(deleteUserNotesQuery);
            PreparedStatement saveUserNotes = myConn.prepareStatement(saveUserNotesQuery);
            deleteUserNotes.execute();
            saveUserNotes.execute();

            } catch (SQLException exception) {
                JOptionPane.showMessageDialog(frame, "Database error: " + exception.getMessage());
        }
    }
    
    public static void loadNotes(JFrame frame) {
        try {
            String loadUserNotesQuery = "SELECT Notes FROM User_notes WHERE UserID = " + LoginSession.userID + ";";
            PreparedStatement loadUserNotes = myConn.prepareStatement(loadUserNotesQuery);
            ResultSet loadUserNotesResult = loadUserNotes.executeQuery(); 
            
            while(loadUserNotesResult.next()) {
                LoginSession.userNotes = loadUserNotesResult.getString("Notes");
            }
            
            } catch (SQLException exception) {
                JOptionPane.showMessageDialog(frame, "Database error: " + exception.getMessage());
            }
    }
    
    public static void loadWorkoutStats(JFrame frame) {
        try {
            String AverageCaloriesQuery = "SELECT ROUND(AVG(Calories), 1) AS AvgCalories FROM WorkoutArchive WHERE UserID = " + LoginSession.userID + ";";
            String MostBurnedCaloriesQuery = "SELECT WorkoutID, DATE_FORMAT(WorkoutDate, '%d.%m.%Y') AS MaxDate, Calories AS MaxCalories FROM WorkoutArchive WHERE UserID = " 
                    + LoginSession.userID + " GROUP BY WorkoutID, WorkoutDate ORDER BY Calories DESC LIMIT 1;";
            String FavoriteSportQuery = "SELECT WorkoutType, COUNT(WorkoutType) AS WorkoutTypeNumber FROM WorkoutArchive WHERE UserID = " 
                    + LoginSession.userID + " GROUP BY WorkoutType ORDER BY COUNT(*) DESC LIMIT 1;";
            String TotalTrainingNumbersQuery = "SELECT COUNT(*) AS TrainingsCount FROM WorkoutArchive WHERE UserID = " + LoginSession.userID + ";";
            String CaloriesSumQuery = "SELECT SUM(Calories) AS SumCalories FROM WorkoutArchive WHERE UserID = " + LoginSession.userID + ";";
            String FirstDateQuery = "SELECT DATE_FORMAT(MIN(WorkoutDate), '%d.%m.%Y') AS MinDate FROM WorkoutArchive WHERE UserID = " + LoginSession.userID + ";";
            
            PreparedStatement AverageCalories = myConn.prepareStatement(AverageCaloriesQuery);
            PreparedStatement MostBurnedCalories = myConn.prepareStatement(MostBurnedCaloriesQuery);
            PreparedStatement FavoriteSport = myConn.prepareStatement(FavoriteSportQuery);
            PreparedStatement TotalTrainingNumbers = myConn.prepareStatement(TotalTrainingNumbersQuery);
            PreparedStatement CaloriesSum = myConn.prepareStatement(CaloriesSumQuery);
            PreparedStatement FirstDate = myConn.prepareStatement(FirstDateQuery);
            
            ResultSet AverageCaloriesResult = AverageCalories.executeQuery(); 
            ResultSet MostBurnedCaloriesResult = MostBurnedCalories.executeQuery();
            ResultSet FavoriteSportResult = FavoriteSport.executeQuery();
            ResultSet TotalTrainingNumbersResult = TotalTrainingNumbers.executeQuery();
            ResultSet CaloriesSumResult = CaloriesSum.executeQuery();
            ResultSet FirstDateResult = FirstDate.executeQuery();
            
            while(AverageCaloriesResult.next()) {
                LoginSession.averageBurnedKcal = AverageCaloriesResult.getDouble("AvgCalories");
            }
            while(MostBurnedCaloriesResult.next()) {
                LoginSession.maxBurnedKcal = MostBurnedCaloriesResult.getDouble("MaxCalories");
                LoginSession.maxBurnedKcalDate = MostBurnedCaloriesResult.getString("MaxDate");
            }
            while(FavoriteSportResult.next()) {
                LoginSession.favoriteSport = FavoriteSportResult.getString("WorkoutType");
                LoginSession.favoriteSportCount = FavoriteSportResult.getInt("WorkoutTypeNumber");
            }
            while(TotalTrainingNumbersResult.next()) {
                LoginSession.trainingsCount = TotalTrainingNumbersResult.getInt("TrainingsCount");
            }
            while(CaloriesSumResult.next()) {
                LoginSession.totalBurnedKcal = CaloriesSumResult.getDouble("SumCalories");
            }
            while(FirstDateResult.next()) {
                LoginSession.firstTrainingDate = FirstDateResult.getString("MinDate");
            }
            
            } catch (SQLException exception) {
                JOptionPane.showMessageDialog(frame, "Database error: " + exception.getMessage());
            }
    }
    
    public static void loadMealsStats(JFrame frame) {
        try {
            String AverageCaloriesQuery = "SELECT ROUND(AVG(Calories), 1) AS AvgCalories, ROUND(AVG(Proteins), 1) AS AvgProteins, "
                    + "ROUND(AVG(Fats), 1) AS AvgFats, ROUND(AVG(Carbs), 1) AS AvgCarbs FROM MealsArchive WHERE UserID = " + LoginSession.userID + ";";
            
            String MostCaloriesQuery = "SELECT MealDiaryID, DATE_FORMAT(DiaryDate, '%d.%m.%Y') AS MaxDate, Calories AS MaxCalories FROM MealsArchive WHERE UserID = " 
                    + LoginSession.userID + " GROUP BY MealDiaryID, DiaryDate ORDER BY Calories DESC LIMIT 1;";
            String LeastCaloriesQuery = "SELECT MealDiaryID, DATE_FORMAT(DiaryDate, '%d.%m.%Y') AS MinDate, Calories AS MinCalories FROM MealsArchive WHERE UserID = " 
                    + LoginSession.userID + " GROUP BY MealDiaryID, DiaryDate ORDER BY Calories ASC LIMIT 1;";
            
            String CaloriesSumQuery = "SELECT SUM(Calories) AS SumCalories FROM MealsArchive WHERE UserID = " + LoginSession.userID + ";";
            String FirstDiaryQuery = "SELECT DATE_FORMAT(MIN(DiaryDate), '%d.%m.%Y') AS MinDate FROM MealsArchive WHERE UserID = " + LoginSession.userID + ";";
            
            PreparedStatement AverageCalories = myConn.prepareStatement(AverageCaloriesQuery);
            PreparedStatement MostCalories = myConn.prepareStatement(MostCaloriesQuery);
            PreparedStatement LeastCalories = myConn.prepareStatement(LeastCaloriesQuery);
            PreparedStatement CaloriesSum = myConn.prepareStatement(CaloriesSumQuery);
            PreparedStatement FirstDiary = myConn.prepareStatement(FirstDiaryQuery);
            
            ResultSet AverageCaloriesResult = AverageCalories.executeQuery(); 
            ResultSet MostCaloriesResult = MostCalories.executeQuery();
            ResultSet LeastCaloriesResult = LeastCalories.executeQuery();
            ResultSet CaloriesSumResult = CaloriesSum.executeQuery();
            ResultSet FirstDiaryResult = FirstDiary.executeQuery();
            
            while(AverageCaloriesResult.next()) {
                LoginSession.averageKcal = AverageCaloriesResult.getDouble("AvgCalories");
                LoginSession.averageProteins = AverageCaloriesResult.getDouble("AvgProteins");
                LoginSession.averageFats = AverageCaloriesResult.getDouble("AvgFats");
                LoginSession.averageCarbs = AverageCaloriesResult.getDouble("AvgCarbs");
            }
            while(MostCaloriesResult.next()) {
                LoginSession.maxKcal = MostCaloriesResult.getDouble("MaxCalories");
                LoginSession.maxKcalDate = MostCaloriesResult.getString("MaxDate");
            }
            while(LeastCaloriesResult.next()) {
                LoginSession.minKcal = LeastCaloriesResult.getDouble("MinCalories");
                LoginSession.minKcalDate = LeastCaloriesResult.getString("MinDate");
            }
            while(CaloriesSumResult.next()) {
                LoginSession.totalKcal = CaloriesSumResult.getDouble("SumCalories");
            }
            while(FirstDiaryResult.next()) {
                LoginSession.firstDiaryDate = FirstDiaryResult.getString("MinDate");
            }
            
            } catch (SQLException exception) {
                JOptionPane.showMessageDialog(frame, "Database error: " + exception.getMessage());
            }
    }
    
    public static void loadMealDiaryDiagramData(JFrame frame) {
        try {
            String loadDiaryInterval1Query = "SELECT ROUND((Calories/25), 0) AS Calories, DATE_FORMAT(DiaryDate, '%d.%m') AS DiaryDate FROM MealsArchive WHERE UserID = " + LoginSession.userID + " AND DiaryDate = (CURDATE() - INTERVAL 1 DAY);";
            String loadDiaryInterval2Query = "SELECT ROUND((Calories/25), 0) AS Calories, DATE_FORMAT(DiaryDate, '%d.%m') AS DiaryDate FROM MealsArchive WHERE UserID = " + LoginSession.userID + " AND DiaryDate = (CURDATE() - INTERVAL 2 DAY);";
            String loadDiaryInterval3Query = "SELECT ROUND((Calories/25), 0) AS Calories, DATE_FORMAT(DiaryDate, '%d.%m') AS DiaryDate FROM MealsArchive WHERE UserID = " + LoginSession.userID + " AND DiaryDate = (CURDATE() - INTERVAL 3 DAY);";
            String loadDiaryInterval4Query = "SELECT ROUND((Calories/25), 0) AS Calories, DATE_FORMAT(DiaryDate, '%d.%m') AS DiaryDate FROM MealsArchive WHERE UserID = " + LoginSession.userID + " AND DiaryDate = (CURDATE() - INTERVAL 4 DAY);";
            String loadDiaryInterval5Query = "SELECT ROUND((Calories/25), 0) AS Calories, DATE_FORMAT(DiaryDate, '%d.%m') AS DiaryDate FROM MealsArchive WHERE UserID = " + LoginSession.userID + " AND DiaryDate = (CURDATE() - INTERVAL 5 DAY);";
            String loadDiaryInterval6Query = "SELECT ROUND((Calories/25), 0) AS Calories, DATE_FORMAT(DiaryDate, '%d.%m') AS DiaryDate FROM MealsArchive WHERE UserID = " + LoginSession.userID + " AND DiaryDate = (CURDATE() - INTERVAL 6 DAY);";
            String loadDiaryInterval7Query = "SELECT ROUND((Calories/25), 0) AS Calories, DATE_FORMAT(DiaryDate, '%d.%m') AS DiaryDate FROM MealsArchive WHERE UserID = " + LoginSession.userID + " AND DiaryDate = (CURDATE() - INTERVAL 7 DAY);";

            PreparedStatement loadDiaryInterval1 = myConn.prepareStatement(loadDiaryInterval1Query);
            PreparedStatement loadDiaryInterval2 = myConn.prepareStatement(loadDiaryInterval2Query);
            PreparedStatement loadDiaryInterval3 = myConn.prepareStatement(loadDiaryInterval3Query);
            PreparedStatement loadDiaryInterval4 = myConn.prepareStatement(loadDiaryInterval4Query);
            PreparedStatement loadDiaryInterval5 = myConn.prepareStatement(loadDiaryInterval5Query);
            PreparedStatement loadDiaryInterval6 = myConn.prepareStatement(loadDiaryInterval6Query);
            PreparedStatement loadDiaryInterval7 = myConn.prepareStatement(loadDiaryInterval7Query);
            
            ResultSet loadDiaryInterval1Result = loadDiaryInterval1.executeQuery(); 
            ResultSet loadDiaryInterval2Result = loadDiaryInterval2.executeQuery(); 
            ResultSet loadDiaryInterval3Result = loadDiaryInterval3.executeQuery(); 
            ResultSet loadDiaryInterval4Result = loadDiaryInterval4.executeQuery(); 
            ResultSet loadDiaryInterval5Result = loadDiaryInterval5.executeQuery(); 
            ResultSet loadDiaryInterval6Result = loadDiaryInterval6.executeQuery(); 
            ResultSet loadDiaryInterval7Result = loadDiaryInterval7.executeQuery(); 
            
            while(loadDiaryInterval1Result.next()) {
                LoginSession.mealDiaryInterval1Date = loadDiaryInterval1Result.getString("DiaryDate");
                LoginSession.mealDiaryInterval1Kcal = loadDiaryInterval1Result.getInt("Calories");
                if(LoginSession.mealDiaryInterval1Kcal > 192)
                    LoginSession.mealDiaryInterval1Kcal = 192;
            }
            while(loadDiaryInterval2Result.next()) {
                LoginSession.mealDiaryInterval2Date = loadDiaryInterval2Result.getString("DiaryDate");
                LoginSession.mealDiaryInterval2Kcal = loadDiaryInterval2Result.getInt("Calories");
                if(LoginSession.mealDiaryInterval2Kcal > 192)
                    LoginSession.mealDiaryInterval2Kcal = 192;
            }
            while(loadDiaryInterval3Result.next()) {
                LoginSession.mealDiaryInterval3Date = loadDiaryInterval3Result.getString("DiaryDate");
                LoginSession.mealDiaryInterval3Kcal = loadDiaryInterval3Result.getInt("Calories");
                if(LoginSession.mealDiaryInterval3Kcal > 192)
                    LoginSession.mealDiaryInterval3Kcal = 192;
            }
            while(loadDiaryInterval4Result.next()) {
                LoginSession.mealDiaryInterval4Date = loadDiaryInterval4Result.getString("DiaryDate");
                LoginSession.mealDiaryInterval4Kcal = loadDiaryInterval4Result.getInt("Calories");
                if(LoginSession.mealDiaryInterval4Kcal > 192)
                    LoginSession.mealDiaryInterval4Kcal = 192;
            }
            while(loadDiaryInterval5Result.next()) {
                LoginSession.mealDiaryInterval5Date = loadDiaryInterval5Result.getString("DiaryDate");
                LoginSession.mealDiaryInterval5Kcal = loadDiaryInterval5Result.getInt("Calories");
                if(LoginSession.mealDiaryInterval5Kcal > 192)
                    LoginSession.mealDiaryInterval5Kcal = 192;
            }
            while(loadDiaryInterval6Result.next()) {
                LoginSession.mealDiaryInterval6Date = loadDiaryInterval6Result.getString("DiaryDate");
                LoginSession.mealDiaryInterval6Kcal = loadDiaryInterval6Result.getInt("Calories");
                if(LoginSession.mealDiaryInterval6Kcal > 192)
                    LoginSession.mealDiaryInterval6Kcal = 192;
            }
            while(loadDiaryInterval7Result.next()) {
                LoginSession.mealDiaryInterval7Date = loadDiaryInterval7Result.getString("DiaryDate");
                LoginSession.mealDiaryInterval7Kcal = loadDiaryInterval7Result.getInt("Calories");
                if(LoginSession.mealDiaryInterval7Kcal > 192)
                    LoginSession.mealDiaryInterval7Kcal = 192;
            }
            
            } catch (SQLException exception) {
                JOptionPane.showMessageDialog(frame, "Database error: " + exception.getMessage());
            }
    }
    
    public static void loadWorkoutDiaryDiagramData(JFrame frame) {
        try {
            String loadDiaryInterval1Query = "SELECT ROUND((SUM(Calories)/6.25), 0) AS Calories, DATE_FORMAT(WorkoutDate, '%d.%m') AS WorkoutDate FROM WorkoutArchive WHERE UserID = " + LoginSession.userID + " AND WorkoutDate = (CURDATE() - INTERVAL 1 DAY);";
            String loadDiaryInterval2Query = "SELECT ROUND((SUM(Calories)/6.25), 0) AS Calories, DATE_FORMAT(WorkoutDate, '%d.%m') AS WorkoutDate FROM WorkoutArchive WHERE UserID = " + LoginSession.userID + " AND WorkoutDate = (CURDATE() - INTERVAL 2 DAY);";
            String loadDiaryInterval3Query = "SELECT ROUND((SUM(Calories)/6.25), 0) AS Calories, DATE_FORMAT(WorkoutDate, '%d.%m') AS WorkoutDate FROM WorkoutArchive WHERE UserID = " + LoginSession.userID + " AND WorkoutDate = (CURDATE() - INTERVAL 3 DAY);";
            String loadDiaryInterval4Query = "SELECT ROUND((SUM(Calories)/6.25), 0) AS Calories, DATE_FORMAT(WorkoutDate, '%d.%m') AS WorkoutDate FROM WorkoutArchive WHERE UserID = " + LoginSession.userID + " AND WorkoutDate = (CURDATE() - INTERVAL 4 DAY);";
            String loadDiaryInterval5Query = "SELECT ROUND((SUM(Calories)/6.25), 0) AS Calories, DATE_FORMAT(WorkoutDate, '%d.%m') AS WorkoutDate FROM WorkoutArchive WHERE UserID = " + LoginSession.userID + " AND WorkoutDate = (CURDATE() - INTERVAL 5 DAY);";
            String loadDiaryInterval6Query = "SELECT ROUND((SUM(Calories)/6.25), 0) AS Calories, DATE_FORMAT(WorkoutDate, '%d.%m') AS WorkoutDate FROM WorkoutArchive WHERE UserID = " + LoginSession.userID + " AND WorkoutDate = (CURDATE() - INTERVAL 6 DAY);";
            String loadDiaryInterval7Query = "SELECT ROUND((SUM(Calories)/6.25), 0) AS Calories, DATE_FORMAT(WorkoutDate, '%d.%m') AS WorkoutDate FROM WorkoutArchive WHERE UserID = " + LoginSession.userID + " AND WorkoutDate = (CURDATE() - INTERVAL 7 DAY);";

            PreparedStatement loadDiaryInterval1 = myConn.prepareStatement(loadDiaryInterval1Query);
            PreparedStatement loadDiaryInterval2 = myConn.prepareStatement(loadDiaryInterval2Query);
            PreparedStatement loadDiaryInterval3 = myConn.prepareStatement(loadDiaryInterval3Query);
            PreparedStatement loadDiaryInterval4 = myConn.prepareStatement(loadDiaryInterval4Query);
            PreparedStatement loadDiaryInterval5 = myConn.prepareStatement(loadDiaryInterval5Query);
            PreparedStatement loadDiaryInterval6 = myConn.prepareStatement(loadDiaryInterval6Query);
            PreparedStatement loadDiaryInterval7 = myConn.prepareStatement(loadDiaryInterval7Query);
            
            ResultSet loadDiaryInterval1Result = loadDiaryInterval1.executeQuery(); 
            ResultSet loadDiaryInterval2Result = loadDiaryInterval2.executeQuery(); 
            ResultSet loadDiaryInterval3Result = loadDiaryInterval3.executeQuery(); 
            ResultSet loadDiaryInterval4Result = loadDiaryInterval4.executeQuery(); 
            ResultSet loadDiaryInterval5Result = loadDiaryInterval5.executeQuery(); 
            ResultSet loadDiaryInterval6Result = loadDiaryInterval6.executeQuery(); 
            ResultSet loadDiaryInterval7Result = loadDiaryInterval7.executeQuery(); 
            
            while(loadDiaryInterval1Result.next()) {
                LoginSession.workoutDiaryInterval1Date = loadDiaryInterval1Result.getString("WorkoutDate");
                LoginSession.workoutDiaryInterval1Kcal = loadDiaryInterval1Result.getInt("Calories");
                if(LoginSession.workoutDiaryInterval1Kcal > 192)
                    LoginSession.workoutDiaryInterval1Kcal = 192;
            }
            while(loadDiaryInterval2Result.next()) {
                LoginSession.workoutDiaryInterval2Date = loadDiaryInterval2Result.getString("WorkoutDate");
                LoginSession.workoutDiaryInterval2Kcal = loadDiaryInterval2Result.getInt("Calories");
                if(LoginSession.workoutDiaryInterval2Kcal > 192)
                    LoginSession.workoutDiaryInterval2Kcal = 192;
            }
            while(loadDiaryInterval3Result.next()) {
                LoginSession.workoutDiaryInterval3Date = loadDiaryInterval3Result.getString("WorkoutDate");
                LoginSession.workoutDiaryInterval3Kcal = loadDiaryInterval3Result.getInt("Calories");
                if(LoginSession.workoutDiaryInterval3Kcal > 192)
                    LoginSession.workoutDiaryInterval3Kcal = 192;
            }
            while(loadDiaryInterval4Result.next()) {
                LoginSession.workoutDiaryInterval4Date = loadDiaryInterval4Result.getString("WorkoutDate");
                LoginSession.workoutDiaryInterval4Kcal = loadDiaryInterval4Result.getInt("Calories");
                if(LoginSession.workoutDiaryInterval4Kcal > 192)
                    LoginSession.workoutDiaryInterval4Kcal = 192;
            }
            while(loadDiaryInterval5Result.next()) {
                LoginSession.workoutDiaryInterval5Date = loadDiaryInterval5Result.getString("WorkoutDate");
                LoginSession.workoutDiaryInterval5Kcal = loadDiaryInterval5Result.getInt("Calories");
                if(LoginSession.workoutDiaryInterval5Kcal > 192)
                    LoginSession.workoutDiaryInterval5Kcal = 192;
            }
            while(loadDiaryInterval6Result.next()) {
                LoginSession.workoutDiaryInterval6Date = loadDiaryInterval6Result.getString("WorkoutDate");
                LoginSession.workoutDiaryInterval6Kcal = loadDiaryInterval6Result.getInt("Calories");
                if(LoginSession.workoutDiaryInterval6Kcal > 192)
                    LoginSession.workoutDiaryInterval6Kcal = 192;
            }
            while(loadDiaryInterval7Result.next()) {
                LoginSession.workoutDiaryInterval7Date = loadDiaryInterval7Result.getString("WorkoutDate");
                LoginSession.workoutDiaryInterval7Kcal = loadDiaryInterval7Result.getInt("Calories");
                if(LoginSession.workoutDiaryInterval7Kcal > 192)
                    LoginSession.workoutDiaryInterval7Kcal = 192;
            }
            
            } catch (SQLException exception) {
                JOptionPane.showMessageDialog(frame, "Database error: " + exception.getMessage());
            }
    }
}
