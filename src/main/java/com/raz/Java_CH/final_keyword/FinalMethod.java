package com.raz.Java_CH.final_keyword;


class Calculation {
    public final double fixedCalculation(int amount) { //Final Method
        double fixed = amount + (amount * 0.7);
        return fixed;
    }

    public double premiumCalculation(int amount) {  // normal method, which can be overridden
        double premium = amount + (amount * 1.2);
        return premium;
    }
}

class Loan extends Calculation {

    public double premiumCalculation(int amount) {    // Override the method by changing rate
        double premium = amount + (amount * 0.2);
        return premium;
    }

   /* public double fixedCalculation(int amount) {   // Error compile-time
        double fixed = amount + (amount * 1.0);
        return fixed;
    }*/
}

class FinalMethod {

    public static void main(String[] args) {
        Loan obj = new Loan();
        System.out.println("Premium Calculation - " + obj.premiumCalculation(1000));
        System.out.println("Fixed Calculation - " + obj.fixedCalculation(1000));
    }
}

