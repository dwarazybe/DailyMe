package dailyme;

import java.util.ArrayList;

public class LoginSession {
    public static int userID;
    public static String usertype;
    public static String nickname;
    public static String userName;
    public static String nicknameFound;
    public static String emailFound;
    public static ArrayList<String> productNames = new ArrayList<String>();
    public static double userWeight;
    public static int userHeight;
    public static int userAge;
    public static int userGender;
    
    public static String[] mealNameArray = new String[8];
    public static double[] mealKcalArray = new double[8];
    public static double[] mealProteinsArray = new double[8];
    public static double[] mealFatsArray = new double[8];
    public static double[] mealCarbsArray = new double[8];
    
    public static int productWeight;
    public static double productKcal;
    public static double productProteins;
    public static double productFats;
    public static double productCarbs;
    public static String selectedProductName;
    public static int selectedProductWeight;
    public static double selectedProductKcal;
    public static double selectedProductProteins;
    public static double selectedProductFats;
    public static double selectedProductCarbs;
    
    public static double averageKcal;
    public static double averageProteins;
    public static double averageFats;
    public static double averageCarbs;
    public static double maxKcal;
    public static String maxKcalDate;
    public static double minKcal;
    public static String minKcalDate;
    public static double totalKcal;
    public static String firstDiaryDate;
    
    public static double averageBurnedKcal;
    public static double maxBurnedKcal;
    public static String maxBurnedKcalDate;
    public static String favoriteSport;
    public static int favoriteSportCount;
    public static int trainingsCount;
    public static double totalBurnedKcal;
    public static String firstTrainingDate;
    
    public static String mealDiaryInterval1Date;
    public static int mealDiaryInterval1Kcal = 0;
    public static String mealDiaryInterval2Date;
    public static int mealDiaryInterval2Kcal = 0;
    public static String mealDiaryInterval3Date;
    public static int mealDiaryInterval3Kcal = 0;
    public static String mealDiaryInterval4Date;
    public static int mealDiaryInterval4Kcal = 0;
    public static String mealDiaryInterval5Date;
    public static int mealDiaryInterval5Kcal = 0;
    public static String mealDiaryInterval6Date;
    public static int mealDiaryInterval6Kcal = 0;
    public static String mealDiaryInterval7Date;
    public static int mealDiaryInterval7Kcal = 0;
    
    public static String workoutDiaryInterval1Date;
    public static int workoutDiaryInterval1Kcal = 0;
    public static String workoutDiaryInterval2Date;
    public static int workoutDiaryInterval2Kcal = 0;
    public static String workoutDiaryInterval3Date;
    public static int workoutDiaryInterval3Kcal = 0;
    public static String workoutDiaryInterval4Date;
    public static int workoutDiaryInterval4Kcal = 0;
    public static String workoutDiaryInterval5Date;
    public static int workoutDiaryInterval5Kcal = 0;
    public static String workoutDiaryInterval6Date;
    public static int workoutDiaryInterval6Kcal = 0;
    public static String workoutDiaryInterval7Date;
    public static int workoutDiaryInterval7Kcal = 0;
    
    public static String mealName;
    public static double mealKcal;
    public static double mealProteins;
    public static double mealFats;
    public static double mealCarbs;
    
    public static String userNotes;
    
    public static boolean isProductAdded = false;
    
    public static double userWeightGoal;
    public static boolean isLoggedIn = false;

    public static int mealsNumber = 0;
    
    public static String userMessage;
    
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
