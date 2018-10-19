package ExceptionHandling;

public class Invalid_RateofInterestException extends Exception {

        public static final double MIN_RATE = 4;
        public static final double MAX_RATE = 25;

        Invalid_RateofInterestException() {
            super("Rate of Interest must be in range" +MIN_RATE +"to" +MAX_RATE);
        }
    }

