package ExceptionHandling;

public class Exception_handling {
    public static void main(String[] args) {
        try{

            int k = 100 / 2;
            int data[] = new int [1];
            data[2]=k;
            System.out.println("Answer: "+k);
        }catch (ArithmeticException ex)
        {
            System.out.println(ex.getMessage());

        } catch (ArrayIndexOutOfBoundsException ex1)
        {
            System.out.println("Invalid Index "+ex1.getMessage());
         // Can handle both the above exception by saying catch (RuntimeException ex)
        }
        finally{
            System.out.println("Finally");
        }
        // All exceptions were handled using CATCH block
        //  So JVM allows execution of next statement!!

        System.out.println("End of Main");
    }
}
