package com.Rohit.logic;

public class CompoundInterestCalculator extends InterestCalculator{

    // constructor chaining - calling base class constructor from derived class
    // code reusability
    public CompoundInterestCalculator (double principal, double rate, double duration)
    {
        //Call to Super() must be first statement
        super (principal,rate,duration);
    }

    // Overridden method
    // exact same Method signature in Base/Super class

    public double calculate()
    {
      return(principal*Math.pow(1+(rate/100),duration/12));

    }
}
