package com.rohit.Department;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;
import java.sql.SQLException;

public class DepartmentJDBC {

        //public static void main(String[] args) {



            public Department getDetailsfromDB(){
                Department department = null;

            try{
                Class.forName("oracle.jdbc.OracleDriver");
                JdbcRowSet rowSet = RowSetProvider.newFactory().createJdbcRowSet();
                rowSet.setUrl("jdbc:oracle:thin:@localhost:1521:orcl");
                rowSet.setUsername("hr");
                rowSet.setPassword("hr");
                rowSet.setCommand("select * from departments where department_id = 30");
                rowSet.execute();
                rowSet.next();

                int deptid = rowSet.getInt(1);
                String deptname = rowSet.getString(2);
                int mgrid = rowSet.getInt(3);
                int locid = rowSet.getInt(4);

                department = new Department(deptid,deptname, mgrid, locid);

                while(rowSet.next()) {

                    System.out.println("Department ID: " + rowSet.getString(1) +  "" + rowSet.getString(2)+  "" + rowSet.getString(3)+  "" + rowSet.getString(4));
                }



            }catch(ClassNotFoundException | SQLException ce){
                System.out.println("Cannot load driver "+ce.getMessage());
                return null;
            }
             return (department);
        }
    }

