package Property;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertyDemo {
    public static void main(String[] args) {

        // System Properties - read from OS (Env Vars)

        System.out.println(System.getProperty("user.home"));
        System.out.println(System.getProperty("os.name"));

    Properties ps = new Properties();
    try{
        // get a file as Stream from a location relative to 'PropertyDemo.class' file
        // That means, 'app.properties' is at same directory as 'PropertyDemo.class

        ps.load(PropertyDemo.class.getResourceAsStream("app.properties"));
        System.out.println("Db Name: "+ps.getProperty("db.name"));
        System.out.println("Student passing Score"+ps.getProperty("student.passing-score"));
        System.out.println("Institution Name " +ps.getProperty("institution.name" , "Not set"));
        ps.setProperty("db.name", "HHH");
        ps.store(new FileWriter("app.properties"), "Added new Property");
    }
    catch (IOException ex){
        System.out.println("Unable to load the properties");
        ex.printStackTrace();
        }
    }
}
