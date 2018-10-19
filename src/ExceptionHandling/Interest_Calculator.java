package ExceptionHandling;

public class Interest_Calculator {

        static void calc ( double p, double r, int d)throws Exception{
            // validate p,r and d
            // if any one of them is INVALID, THROW an exception
            if (p < InvalidPrincipalException.MIN_PRINCIPAL || p > InvalidPrincipalException.MAX_PRINCIPAL)
                throw new InvalidPrincipalException();

            if (r < Invalid_RateofInterestException.MIN_RATE || r > Invalid_RateofInterestException.MAX_RATE)
                throw new Invalid_RateofInterestException ();

            if (d < Invalid_DurationException.MIN_DURATION || d > Invalid_DurationException.MAX_DURATION)
                throw new Invalid_DurationException();

            double interest = p * r / 100 / 12 * d;
            System.out.println("Interest : "+interest);
        }


}

