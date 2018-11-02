package com.rohit.Department;

public class Department {
    private int deptid;
    private String deptname;
    private int mgrid;
    private int locid;

    public Department(int deptid, String deptname, int mgrid, int locid) {
        this.deptid = deptid;
        this.deptname = deptname;
        this.mgrid = mgrid;
        this.locid = locid;
    }

    public int getDeptid() {
        return deptid;
    }

    public String getDeptname() {
        return deptname;
    }

    public int getMgrid() {
        return mgrid;
    }

    public int getLocid() {
        return locid;
    }

    public void setDeptid(int deptid) {
        this.deptid = deptid;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }

    public void setMgrid(int mgrid) {
        this.mgrid = mgrid;
    }

    public void setLocid(int locid) {
        this.locid = locid;
    }

    @Override
    public String toString() {
        return "Department{" +
                "deptid=" + deptid +
                ", deptname='" + deptname + '\'' +
                ", mgrid=" + mgrid +
                ", locid=" + locid +
                '}';
    }
}
