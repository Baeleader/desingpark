package com.example.birdhit;

public class MemberInfo {
    private String name;
    private String major;
    private String student;

    public MemberInfo(String name, String major, String student){
        this.name = name;
        this.major = major;
        this.student = student;
    }

    public String getName(){
        return this.name;
    }
    public  void setName(String name){
        this.name = name;
    }

    public String getMajor(){
        return this.major;
    }
    public  void setMajor(String major){
        this.major = major;
    }

    public String getStudent(){
        return this.student;
    }
    public  void setStudent(String student){
        this.student = student;
    }

}
