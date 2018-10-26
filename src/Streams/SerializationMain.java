package Streams;

import java.io.*;
import java.time.LocalDate;

public class SerializationMain {
    static void writeFile(String filename){
        SerializationEmployee emp = new SerializationEmployee("Vijay","Mallya",68, LocalDate.of(1990,02,12));
        try{
            File file = new File(filename);
            if(!file.exists())
                file.createNewFile();

            FileOutputStream out = new FileOutputStream(file);
            ObjectOutputStream objout = new ObjectOutputStream(out);
            objout.writeObject(emp);
            objout.close();

        }catch(IOException ex){
            System.out.println("Unable to write "+ex.getMessage());
        }
    }

    static void readFile(String filename){
        try{
            FileInputStream in = new FileInputStream(filename);
            ObjectInputStream oin = new ObjectInputStream(in);
            Object obj = oin.readObject();
            if(obj instanceof SerializationEmployee){
                System.out.println(obj); //Call toString()
            }


        }catch(IOException|ClassNotFoundException  ex){
            System.out.println(ex.getMessage());
        }
    }

    public static void main(String[] args) {
        System.out.println("Creating object and serializing it!");
        writeFile("D:\\app\\data.emp");
        System.out.println("Reading from file");
        readFile("D:\\app\\data.emp");
    }
}
