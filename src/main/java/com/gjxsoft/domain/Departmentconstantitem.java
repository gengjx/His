package com.gjxsoft.domain;

public class Departmentconstantitem extends Department{
    String ConstantName;

    public String getConstantName() {
        return ConstantName;
    }

    public void setConstantName(String constantName) {
        ConstantName = constantName;
    }

    @Override
    public String toString() {
        return super.toString()+"Departmentconstantitem{" +
                "ConstantName='" + ConstantName + '\'' +
                '}';
    }
}
