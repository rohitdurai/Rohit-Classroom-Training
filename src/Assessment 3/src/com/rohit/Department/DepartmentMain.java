package com.rohit.Department;

public class DepartmentMain {
    public static void main(String[] args) {

        DepartmentJDBC jdbc = new DepartmentJDBC();

        Department dept = jdbc.getDetailsfromDB();

        System.out.println(dept);
    }



}
