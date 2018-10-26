package ExceptionHandling;

public class InvalidPrincipalException extends Exception {

        public static final double MIN_PRINCIPAL = 10000;
        public static final double MAX_PRINCIPAL = 10000000;
        InvalidPrincipalException (){
            super ("Principal amount must be in range" +MIN_PRINCIPAL +"to" +MAX_PRINCIPAL);
        }

    }

