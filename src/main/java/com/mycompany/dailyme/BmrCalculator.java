package com.mycompany.dailyme;

public class BmrCalculator {
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
    
    protected int calculateKcalAmount(float weight, int height, int age, double activityLevel, int gender) {
        if(gender == 0)
            kcalAmount = (int) Math.round(activityLevel * ((9.99 * weight) + (6.25 * height) - (4.92 * age) - 161));
        if(gender == 1)
            kcalAmount = (int) Math.round(activityLevel * ((9.99 * weight) + (6.25 * height) - (4.92 * age) + 5));
        return kcalAmount;
    }
    
    protected int calculateKcalCutAmount() {
        kcalCutAmount = kcalAmount - 300;
        return kcalCutAmount;
    }
    
    protected int calculateKcalOverAmount() {
        kcalOverAmount = kcalAmount + 300;
        return kcalOverAmount;
    }
    
    protected int calculateProteinsAmount(float weight) {
        proteinsAmount = (int) Math.round(weight * 2.15);
        return proteinsAmount;
    }
    
    protected int calculateFatsAmount() {
        fatsAmount = (int) Math.round((kcalAmount * 0.25) / 9);
        return fatsAmount;
    }
    
    protected int calculateFatsCutAmount() {
        fatsCutAmount = (int) Math.round((kcalCutAmount * 0.25) / 9);
        return fatsCutAmount;
    }
    
    protected int calculateFatsOverAmount() {
        fatsOverAmount = (int) Math.round((kcalOverAmount * 0.25) / 9);
        return fatsOverAmount;
    }
    
    protected int calculateCarbsAmount() {
        carbsAmount = (int) Math.round((kcalAmount - (proteinsAmount * 4) - (fatsAmount * 9)) / 4);
        return carbsAmount;
    }
    
    protected int calculateCarbsCutAmount() {
        carbsCutAmount = (int) Math.round((kcalCutAmount - (proteinsAmount * 4) - (fatsCutAmount * 9)) / 4);
        return carbsCutAmount;
    }
    
    protected int calculateCarbsOverAmount() {
        carbsOverAmount = (int) Math.round((kcalOverAmount - (proteinsAmount * 4) - (fatsOverAmount * 9)) / 4);
        return carbsOverAmount;
    }
}
