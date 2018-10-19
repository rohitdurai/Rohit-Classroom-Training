package ExceptionHandling;

public class IntCalc_Main {
    public static void main(String[] args) {
        try {
            Interest_Calculator.calc(250000, 4.5, 36);
        } catch (Exception ex) {
            System.out.println("Something went wrong: " + ex.getMessage());
        }
    }
}
