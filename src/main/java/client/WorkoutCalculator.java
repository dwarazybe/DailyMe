package client;

public class WorkoutCalculator {
    protected double kcal;
    
    protected double running(double weight, int time, int intensityLevel) {
        if(intensityLevel == 1)
            kcal = (double)Math.round((((weight * 17.5) / 200) * time) * 10) / 10;
        if(intensityLevel == 2)
            kcal = (double)Math.round((((weight * 42) / 200) * time) * 10) / 10;
        if(intensityLevel == 3)
            kcal = (double)Math.round((((weight * 70) / 200) * time) * 10) / 10;
        return kcal;
    }
    
    protected double lifting(int time, int intensityLevel) {
        if(intensityLevel == 1)
            kcal = (double)Math.round((time * 7) * 10) / 10;
        if(intensityLevel == 2)
            kcal = (double)Math.round((time * 8) * 10) / 10;
        if(intensityLevel == 3)
            kcal = (double)Math.round((time * 9) * 10) / 10;
        return kcal;
    }
    
    protected double bikeRiding(double weight, int time, int intensityLevel) {
        if(intensityLevel == 1)
            kcal = (double)Math.round((((weight * 14) / 200) * time) * 10) / 10;
        if(intensityLevel == 2)
            kcal = (double)Math.round((((weight * 29.75) / 200) * time) * 10) / 10;
        if(intensityLevel == 3)
            kcal = (double)Math.round((((weight * 52.5) / 200) * time) * 10) / 10;
        return kcal;
    }
    
    protected double football(double weight, int time, int intensityLevel) {
        if(intensityLevel == 1)
            kcal = (double)Math.round((((weight * 8.75) / 200) * time) * 10) / 10;
        if(intensityLevel == 2)
            kcal = (double)Math.round((((weight * 14) / 200) * time) * 10) / 10;
        if(intensityLevel == 3)
            kcal = (double)Math.round((((weight * 28) / 200) * time) * 10) / 10; 
        return kcal;
    }
    
    protected double swimming(double weight, int time, int intensityLevel) {
        if(intensityLevel == 1)
            kcal = (double)Math.round((((weight * 17.5) / 200) * time) * 10) / 10;
        if(intensityLevel == 2)
            kcal = (double)Math.round((((weight * 31.5) / 200) * time) * 10) / 10;
        if(intensityLevel == 3)
            kcal = (double)Math.round((((weight * 49) / 200) * time) * 10) / 10; 
        return kcal;
    }
    
    protected double skating(double weight, int time, int intensityLevel) {
        if(intensityLevel == 1)
            kcal = (double)Math.round((((weight * 19.25) / 200) * time) * 10) / 10;
        if(intensityLevel == 2)
            kcal = (double)Math.round((((weight * 31.5) / 200) * time) * 10) / 10;
        if(intensityLevel == 3)
            kcal = (double)Math.round((((weight * 47.25) / 200) * time) * 10) / 10;
        return kcal;
    }
    
    protected double yoga(double weight, int time, int intensityLevel) {
        if(intensityLevel == 1)
            kcal = (double)Math.round((((weight * 7) / 200) * time) * 10) / 10;
        if(intensityLevel == 2)
            kcal = (double)Math.round((((weight * 10.5) / 200) * time) * 10) / 10;
        if(intensityLevel == 3)
            kcal = (double)Math.round((((weight * 14) / 200) * time) * 10) / 10;
        return kcal;
    }
    
    protected double jumpingRope(double weight, int time, int intensityLevel) {
        if(intensityLevel == 1)
            kcal = (double)Math.round((((weight * 30.8) / 200) * time) * 10) / 10;
        if(intensityLevel == 2)
            kcal = (double)Math.round((((weight * 41.3) / 200) * time) * 10) / 10;
        if(intensityLevel == 3)
            kcal = (double)Math.round((((weight * 43.05) / 200) * time) * 10) / 10;
        return kcal;
    }
}
