package MultiThreading;

public class CharacterMain {
    public static void main(String[] args) {
        // Define Task

        CharacterPrinter printer1 = new CharacterPrinter(" The Quick Brownn fog jumps over the lazy Dog");
        CharacterPrinter printer2 = new CharacterPrinter("123456789101112131151617181920");

        Thread t1 = new Thread(printer1);
        Thread t2 = new Thread(printer2);

        //t1.start();
        //t2.start();

        //t1.setPriority(Thread.MIN_PRIORITY);
        //t2.setPriority(Thread.MAX_PRIORITY);

        try{
            t1.start();
            System.out.println("Hey JVM, let T1 finish");
            t1.join();
            //t2.join();
        }catch (InterruptedException ie){
            ie.printStackTrace();
        }

        try{
            t2.start();
            System.out.println("Hey JVM, let T2 finish");
            //t1.join();
            t2.join();
        }catch (InterruptedException ie){
            ie.printStackTrace();
        }

        System.out.println("end of main");

    }
}
