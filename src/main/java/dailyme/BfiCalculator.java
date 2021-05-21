package dailyme;

public class BfiCalculator {
    protected double bfi;
    
    protected double calculateBfi(double weight, double waist, int gender) {
        if(gender == 0)
            bfi = (double) (((((4.15 * waist) / 2.54) - (0.082 * weight * 2.2) - 76.76) / (weight * 2.2)) * 100);
        if(gender == 1)
            bfi = (double) (((((4.15 * waist) / 2.54) - (0.082 * weight * 2.2) - 98.42) / (weight * 2.2)) * 100);
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
