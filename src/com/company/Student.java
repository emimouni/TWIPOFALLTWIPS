package com.company;

public class Student {

    public int secretNumber = 0;
    public double FRQ1 = 0;
    public double FRQ2 = 0;
    public double average = 0;
    public String name;

    public Student(int sn){
        secretNumber = sn;
    }

    public double getAverage(){
        average = (FRQ1 + FRQ2)/2;
        return average;
    }

    public String getName(){
        return name;
    }

}
