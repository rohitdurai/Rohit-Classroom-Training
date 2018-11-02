package Property;

import com.intellij.codeInsight.template.postfix.templates.SoutPostfixTemplate;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class DBPropertyDemo {
    public static void main(String[] args) {

        Properties ps = new Properties();
        try{
            ps.load(DBPropertyDemo.class.getResourceAsStream("DB.properties"));
            System.out.println("Driver is " +ps.getProperty("db.driver"));
            System.out.println("Name is " +ps.getProperty("db.name"));
            System.out.println("User is " +ps.getProperty("db.user"));
            System.out.println("Password is " +ps.getProperty("db.password"));
            System.out.println("URL is " +ps.getProperty("db.url"));

        } catch (IOException ex){
            System.out.println("Unable to load the Property file");
            ex.printStackTrace();

        }

    }
}
