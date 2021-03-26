package com.mycompany.dailyme;

public class Calculators {
    protected int kcalAmount;
    protected int kcalCutAmount;
    protected int kcalOverAmount;
    
    protected int proteinsAmount;
    
    protected int fatsAmount;
    protected int fatsCutAmount;
    protected int fatsOverAmount;
    
    protected int carbsAmount;
    protected int carbsCutAmount;
    protected int carbsOverAmount;
    
    protected float bmi;
    protected float bfi;
    
    protected int calculateBmrKcalAmount(int weight, int height, int age, double activityLevel, int gender) {
        if(gender == 0)
            kcalAmount = (int) Math.round(activityLevel * ((9.99 * weight) + (6.25 * height) - (4.92 * age) - 161));
        if(gender == 1)
            kcalAmount = (int) Math.round(activityLevel * ((9.99 * weight) + (6.25 * height) - (4.92 * age) + 5));
        return kcalAmount;
    }
    
    protected int calculateBmrKcalCutAmount() {
        kcalCutAmount = kcalAmount - 300;
        return kcalCutAmount;
    }
    
    protected int calculateBmrKcalOverAmount() {
        kcalOverAmount = kcalAmount + 300;
        return kcalOverAmount;
    }
    
    protected int calculateBmrProteinsAmount(int weight) {
        proteinsAmount = (int) Math.round(weight * 2.15);
        return proteinsAmount;
    }
    
    protected int calculateBmrFatsAmount() {
        fatsAmount = (int) Math.round((kcalAmount * 0.25) / 9);
        return fatsAmount;
    }
    
    protected int calculateBmrFatsCutAmount() {
        fatsCutAmount = (int) Math.round((kcalCutAmount * 0.25) / 9);
        return fatsCutAmount;
    }
    
    protected int calculateBmrFatsOverAmount() {
        fatsOverAmount = (int) Math.round((kcalOverAmount * 0.25) / 9);
        return fatsOverAmount;
    }
    
    protected int calculateBmrCarbsAmount() {
        carbsAmount = (int) Math.round((kcalAmount - (proteinsAmount * 4) - (fatsAmount * 9)) / 4);
        return carbsAmount;
    }
    
    protected int calculateBmrCarbsCutAmount() {
        carbsCutAmount = (int) Math.round((kcalCutAmount - (proteinsAmount * 4) - (fatsCutAmount * 9)) / 4);
        return carbsCutAmount;
    }
    
    protected int calculateBmrCarbsOverAmount() {
        carbsOverAmount = (int) Math.round((kcalOverAmount - (proteinsAmount * 4) - (fatsOverAmount * 9)) / 4);
        return carbsOverAmount;
    }
    
    protected float calculateBmi(float weight, float height) {
        bmi = (weight / ((height * height) / 10000));
        return bmi;
    }
    
    protected String rateBmi() {
        if(bmi < 16)
            return "WYGŁODZENIE";
        if(bmi >= 16 && bmi < 17)
            return "WYCHUDZENIE";
        if(bmi >= 17 && bmi < 18.5)
            return "NIEDOWAGA";
        if(bmi >= 18.5 && bmi < 25)
            return "PRAWIDŁOWA";
        if(bmi >= 25 && bmi < 30)
            return "NADWAGA";
        if(bmi >= 30 && bmi < 35)
            return "OTYŁOŚĆ (I STOPNIA)";
        if(bmi >= 35 && bmi < 40)
            return "OTYŁOŚĆ (II STOPNIA)";
        if(bmi >= 40 && bmi < 45)
            return "OTYŁOŚĆ (III STOPNIA)";
        if(bmi >= 45 && bmi < 50)
            return "OTYŁOŚĆ (IV STOPNIA)";
        if(bmi >= 50 && bmi < 60)
            return "OTYŁOŚĆ (V STOPNIA)";
        if(bmi >= 60 && bmi < 70)
            return "OTYŁOŚĆ (VI STOPNIA)";
        if(bmi >= 70 && bmi < 80)
            return "OTYŁOŚĆ (VII STOPNIA)";
        if(bmi >= 80 && bmi < 90)
            return "OTYŁOŚĆ (VIII STOPNIA)";
        if(bmi >= 90 && bmi < 100)
            return "OTYŁOŚĆ (IX STOPNIA)";
        if(bmi >= 100)
            return "OTYŁOŚĆ (X STOPNIA)";
        return null;
    }
    
    protected float calculateBfi(float weight, float waist, int gender) {
        if(gender == 0)
            bfi = (float) (((((4.15 * waist) / 2.54) - (0.082 * weight * 2.2) - 76.76) / (weight * 2.2)) * 100);
        if(gender == 1)
            bfi = (float) (((((4.15 * waist) / 2.54) - (0.082 * weight * 2.2) - 98.42) / (weight * 2.2)) * 100);
        return bfi;
    }
    
    protected String rateBfi(int gender) {
        if(gender == 0) {
            if(bfi < 13)
                return "NIEZBĘDNA TKANKA TŁUSZCZOWA";
            if(bfi >= 13 && bfi < 20)
                return "ATLETYCZNA";
            if(bfi >= 20 && bfi < 24)
                return "FITNESS";
            if(bfi >= 24 && bfi < 32)
                return "PRZECIĘTNA";
            if(bfi >= 32)
                return "OTYŁOŚĆ";
        }
        if(gender == 1) {
            if(bfi < 6)
                return "NIEZBĘDNA TKANKA TŁUSZCZOWA";
            if(bfi >= 6 && bfi < 14)
                return "ATLETYCZNA";
            if(bfi >= 14 && bfi < 18)
                return "FITNESS";
            if(bfi >= 18 && bfi < 25)
                return "PRZECIĘTNA";
            if(bfi >= 25)
                return "OTYŁOŚĆ";
        }
        return null;
    }
}
