package com.Rohit.logic;

public class InterestMain {
    public static void main(String[] args) {
        CompoundInterestCalculator calc = new CompoundInterestCalculator(340000,11.2,60);
        double sinterest = calc.calculate();
        System.out.println ("Compound Interest "+sinterest);

        InterestCalculator cal = new InterestCalculator(340000,11.2,5);
        double cinterest = cal.calculate();
        System.out.println ("Simple Interest "+cinterest);
    }
}
