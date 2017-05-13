package com.company;

public class Student {

    public int secretNumber = 0;
    public double FRQ1 = 0;
    public double FRQ2 = 0;
    public double average = 0;
    public String name;

    public Student(int sn, double num1, double num2){
        secretNumber = sn;
        FRQ1 = num1;
        FRQ2 = num2;
    }

    public double getTotal(){
        average = (FRQ1 + FRQ2);
        return average;
    }

    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }

}
