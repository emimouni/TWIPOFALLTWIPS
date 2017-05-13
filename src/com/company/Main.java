package com.company;

import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner kb1 = new Scanner(new File("Data.txt"));
        ArrayList<Student> myStud = new ArrayList<Student>();
        kb1.nextLine();
        Scanner kb2 = new Scanner(new File("Data.txt"));
        kb2.nextLine();
        int c = 1;
        while (kb2.hasNextLine()) {
            double FRQ1 = 0;
            double FRQ2 = 0;
            if (c % 2 == 0) {
                String record = kb2.nextLine();
                Scanner field = new Scanner(record);
                field.useDelimiter("\t");
                field.next();
                double syntax = 0;
                while (field.hasNext()) {
                    try {
                        boolean b = true;
                        String field1 = field.next();
                        if (!field1.isEmpty()) {
                            String s3 = field1.substring(0, 1);
                            if (s3.equals("0") || s3.equals("1") || s3.equals("2") || s3.equals("3") || s3.equals("4") || s3.equals("5") || s3.equals("6") || s3.equals("7") || s3.equals("8") || s3.equals("9")) {
                                double m = Double.parseDouble(field1);
                                syntax += m;
                            }
                        }
                        for (int i = 0; i < field1.length(); i++) {
                            String j = field1.substring(i, i + 1);
                            if (j.equals("+")) {
                                String xx = field1.substring(i + 2, i + 4);
                                xx = xx.replaceAll("\\s", "");
                                for (int h = 0; h < xx.length(); h++) {
                                    String r = xx.substring(h, h + 1);
                                    if (!(r.equals("0") || r.equals("1") || r.equals("2") || r.equals("3") || r.equals("4") || r.equals("5") || r.equals("6") || r.equals("7") || r.equals("8") || r.equals("9"))) {
                                        b = false;
                                    }
                                }
                                if (b) {
                                    double newNum = Double.parseDouble(xx);
                                    FRQ1 += newNum;
                                }
                            }
                        }
                    } catch (IndexOutOfBoundsException e) {
                    }
                }
                FRQ1 = FRQ1 - (syntax / 4);
            } else {
                String record = kb2.nextLine();
                Scanner field = new Scanner(record);
                field.useDelimiter("\t");
                String k = field.next();
                int secNum = Integer.parseInt(k);
                field.next();
                double syntax = 0;
                while (field.hasNext()) {
                    try {
                        boolean b = true;
                        String field1 = field.next();
                        if (!field1.isEmpty()) {
                            String s3 = field1.substring(0, 1);
                            if (s3.equals("0") || s3.equals("1") || s3.equals("2") || s3.equals("3") || s3.equals("4") || s3.equals("5") || s3.equals("6") || s3.equals("7") || s3.equals("8") || s3.equals("9")) {
                                double m = Double.parseDouble(field1);
                                syntax += m;
                            }
                        }
                        for (int i = 0; i < field1.length(); i++) {
                            String j = field1.substring(i, i + 1);
                            if (j.equals("+")) {
                                String xx = field1.substring(i + 2, i + 4);
                                xx = xx.replaceAll("\\s", "");
                                for (int h = 0; h < xx.length(); h++) {
                                    String r = xx.substring(h, h + 1);
                                    if (!(r.equals("0") || r.equals("1") || r.equals("2") || r.equals("3") || r.equals("4") || r.equals("5") || r.equals("6") || r.equals("7") || r.equals("8") || r.equals("9"))) {
                                        b = false;
                                    }
                                }
                                if (b) {
                                    double newNum = Double.parseDouble(xx);
                                    FRQ1 += newNum;
                                }
                            }
                        }
                    } catch (IndexOutOfBoundsException e) {
                    }
                }
                FRQ2 = FRQ2 - (syntax / 4);
                Student stu = new Student(secNum, FRQ1, FRQ2);
                myStud.add(stu);
            }

            c++;
        }
        Scanner kb3 = new Scanner(new File("Names.txt"));
        while (kb3.hasNextLine()) {
            String name = kb3.next();
            int num = kb3.nextInt();
            for (int i = 0; i < myStud.size(); i++) {
                Student dum = myStud.get(i);
                if (dum.secretNumber == num) {
                    dum.setName(name);
                    myStud.set(i, dum);
                }
            }
            kb3.nextLine();
        }
        System.out.println("Name\tSecretNumber\tFRQ1\tFRQ2\tTotal");
            for (int j = 0; j < myStud.size(); j++) {
                Student dummy = myStud.get(j);
                System.out.println(dummy.name +  "   " + dummy.secretNumber + "   " + dummy.FRQ1 + "   " + dummy.FRQ2 + "   " + dummy.getTotal());
            }

        }
    }
