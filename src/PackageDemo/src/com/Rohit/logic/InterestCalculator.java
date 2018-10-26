package com.Rohit.logic;

public class InterestCalculator {

        protected double principal;
        protected double rate;
        protected double duration;

        public InterestCalculator (double principal, double rate, double duration){
            this.principal = principal;
            this.rate = rate;
            this.duration = duration;
        }

        public double calculate()
        {
            return((principal*rate*duration) / 100);
        }

}
