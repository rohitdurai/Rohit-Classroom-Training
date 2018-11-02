package Streams;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.File;
import java.net.URI;

public class FileDemo {
    public static void main(String[] args) {

        try{
            File file = new File ("D:\\app");
            //File file = new File (URI.create("file:///D/app")); // using URI
            if (file.exists()){
                System.out.println("File Exists");
            }
            if (file.isDirectory()){
                System.out.println("Its a Directory");
            }
            else {
                System.out.println("Its not a Directory");
            }

            File newfile = new File(file,"data2.txt");

            if (newfile.exists()){
                System.out.println("File already exists");
            }
            else{
                System.out.println("Creating a New File");
                newfile.createNewFile();
            }

            }
        catch (IOException ex){
            System.out.println("Unable to Create");

        }
    }

}