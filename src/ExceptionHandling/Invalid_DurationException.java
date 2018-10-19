package ExceptionHandling;

public class Invalid_DurationException extends Exception {


        public static final double MIN_DURATION = 12;
        public static final double MAX_DURATION = 240;

        Invalid_DurationException() {
            super("Duration must be in range" +MIN_DURATION +"to" +MAX_DURATION);
        }
    }


