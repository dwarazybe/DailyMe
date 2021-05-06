package com.mycompany.dailyme;


public class WorkoutCalculator {
    protected double kcal;
    
    protected double running(double weight, int time, int intensityLevel) {
        if(intensityLevel == 1)
            kcal = ((weight * 17.5) / 200) * time;
        if(intensityLevel == 2)
            kcal = ((weight * 42) / 200) * time;
        if(intensityLevel == 3)
            kcal = ((weight * 70) / 200) * time;
        return kcal;
    }
    
    protected double lifting(int time, int intensityLevel) {
        if(intensityLevel == 1)
            kcal = time * 7;
        if(intensityLevel == 2)
            kcal = time * 8;
        if(intensityLevel == 3)
            kcal = time * 9;
        return kcal;
    }
    
    protected double bikeRiding(double weight, int time, int intensityLevel) {
        if(intensityLevel == 1)
            kcal = ((weight * 14) / 200) * time;
        if(intensityLevel == 2)
            kcal = ((weight * 29.75) / 200) * time;
        if(intensityLevel == 3)
            kcal = ((weight * 52.5) / 200) * time;
        return kcal;
    }
    
    protected double football(double weight, int time, int intensityLevel) {
        if(intensityLevel == 1)
            kcal = ((weight * 8.75) / 200) * time;
        if(intensityLevel == 2)
            kcal = ((weight * 14) / 200) * time;
        if(intensityLevel == 3)
            kcal = ((weight * 28) / 200) * time; 
        return kcal;
    }
    
    protected double swimming(double weight, int time, int intensityLevel) {
        if(intensityLevel == 1)
            kcal = ((weight * 17.5) / 200) * time;
        if(intensityLevel == 2)
            kcal = ((weight * 31.5) / 200) * time;
        if(intensityLevel == 3)
            kcal = ((weight * 49) / 200) * time; 
        return kcal;
    }
    
    protected double skating(double weight, int time, int intensityLevel) {
        if(intensityLevel == 1)
            kcal = ((weight * 19.25) / 200) * time;
        if(intensityLevel == 2)
            kcal = ((weight * 31.5) / 200) * time;
        if(intensityLevel == 3)
            kcal = ((weight * 47.25) / 200) * time;
        return kcal;
    }
    
    protected double yoga(double weight, int time, int intensityLevel) {
        if(intensityLevel == 1)
            kcal = ((weight * 7) / 200) * time;
        if(intensityLevel == 2)
            kcal = ((weight * 10.5) / 200) * time;
        if(intensityLevel == 3)
            kcal = ((weight * 14) / 200) * time;
        return kcal;
    }
    
    protected double jumpingRope(double weight, int time, int intensityLevel) {
        if(intensityLevel == 1)
            kcal = ((weight * 30.8) / 200) * time;
        if(intensityLevel == 2)
            kcal = ((weight * 41.3) / 200) * time;
        if(intensityLevel == 3)
            kcal = ((weight * 43.05) / 200) * time;
        return kcal;
    }
}
