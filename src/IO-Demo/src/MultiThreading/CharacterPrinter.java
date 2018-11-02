package MultiThreading;

public class CharacterPrinter implements Runnable {

        private String statement; //= "The quick brown fox jumps over the lazy dog");

    public CharacterPrinter(String statement) {
        this.statement = statement;
    }

    public void run(){
        for (int i=0; i<statement.length(); i++){
            System.out.print(" " +statement.charAt(i));
            Thread.yield();// I have done some of my job, let other thread take control now.
            try{
              Thread.sleep(100);
            }catch (InterruptedException ie){
                ie.printStackTrace();
            }
        }
    }
}
