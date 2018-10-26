package JDBC_Connection;

import javax.sql.RowSet;
import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;
import java.sql.*;

public class Main_RowSet {

    /**
     * Test Database connectivity with JDBC
     * @param args
     */
    public static void main(String[] args) {

        Connection con = null;
        Statement st = null;
        ResultSet rs = null;

        //Step 1: Load JDBC Driver
        try{
            Class.forName("oracle.jdbc.OracleDriver");
            System.out.println("JDBC Driver found and Loaded!");

            JdbcRowSet rowSet = RowSetProvider.newFactory().createJdbcRowSet();
            rowSet.setUrl("jdbc:oracle:thin:@localhost:1521:orcl");
            rowSet.setUsername("hr");
            rowSet.setPassword("hr");
            rowSet.setCommand("select first_name, last_name from employees");
            rowSet.execute();

            while(rowSet.next()) {
                // Generating cursor Moved event
                System.out.println("Name: " + rowSet.getString(1) + "" + rowSet.getString(2));
            }

            System.out.println("-------------PREVIOUS ORDER----------");

            while(rowSet.previous()) {
                // Generating cursor Moved event
                System.out.println("Name: " + rowSet.getString(1) + "" + rowSet.getString(2));
            }


        }catch(ClassNotFoundException | SQLException ce){
            System.out.println("Cannot load driver "+ce.getMessage());
            return; //Close main method
        }




        }
    }

