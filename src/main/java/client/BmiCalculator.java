package client;

public class BmiCalculator {
    protected double bmi;
    
    protected double calculateBmi(double weight, double height) {
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
}
