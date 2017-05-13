package com.company;
import java.util.*;
import java.io.*;
public class Main {

    public static void main(String[] args) throws IOException{
	    double FRQ1 = 0;
        double FRQ2 = 0;
        Scanner kb = new Scanner(new File("Data.txt"));
        ArrayList<Student> myStud = new ArrayList<Student>();
        ArrayList<String> tester = new ArrayList<String>();
        int x =1;
        while(kb.hasNextLine()) {
            String s = kb.nextLine();
            String f = s.substring(0, 1);
            if (f.equals("1") || f.equals("2") || f.equals("3") || f.equals("4") || f.equals("5") || f.equals("6") || f.equals("7") || f.equals("8") || f.equals("9")) {
                String s2 = s;
                s = s.substring(2);
                System.out.println(x);
                if (x%2==0){
                    for (int i = 0; i < s.length(); i++) {
                        tester.add(s.substring(i, i + 1));
                    }
                    String st = "";
                    for (int j = 0; j < tester.size(); j++) {
                        String s1 = tester.get(j);
                        if (!(tester.get(j).equals("+") || tester.get(j).equals("0") || tester.get(j).equals("1") || tester.get(j).equals("2") || tester.get(j).equals("3") || tester.get(j).equals("4") || tester.get(j).equals("5") || tester.get(j).equals("6") || tester.get(j).equals("7") || tester.get(j).equals("8") || tester.get(j).equals("9") || tester.get(j).equals("."))) {
                            s1 = " ";
                            tester.set(j, s1);
                        }
                        st = st + s1;
                    }
                    String[] ary = st.split("\t|\\s+\\s+\\s");
                    for (int i = 0; i < ary.length; i++) {
                        String str1 = ary[i];
                        if (str1.contains("+")) {
                            String str = str1.substring(str1.indexOf("+") + 2);
                            double y = Double.parseDouble(str);
                            FRQ1 += y;
                        }
                        else {
                            double z = Double.parseDouble(str1);
                            z = z/4;
                            FRQ1 -= z;
                        }
                    }

                }else {

                    for (int i = 0; i < s.length(); i++) {
                        tester.add(s.substring(i, i + 1));
                    }
                    String st1 = "";
                    for (int j = 0; j < tester.size(); j++) {
                        String s1 = tester.get(j);
                        if (!(tester.get(j).equals("+") || tester.get(j).equals("0") || tester.get(j).equals("1") || tester.get(j).equals("2") || tester.get(j).equals("3") || tester.get(j).equals("4") || tester.get(j).equals("5") || tester.get(j).equals("6") || tester.get(j).equals("7") || tester.get(j).equals("8") || tester.get(j).equals("9") || tester.get(j).equals("."))) {
                            s1 = " ";
                            tester.set(j, s1);
                        }
                        st1 = st1 + s1;
                    }
                    int b = 0;
                    String[] ary = st1.split("\t|\\s+\\s+\\s");
                    for (int i = 0; i < ary.length; i++) {
                        String str1 = ary[i];
                        if (str1.contains("+")) {
                            String str = str1.substring(str1.indexOf("+") + 2);
                            double y = Double.parseDouble(str);
                            FRQ2 += y;
                        }
                        else {
                            double z = Double.parseDouble(str1);
                            z = z/4;
                            FRQ2 -= z;
                        }
                    }

                    String sec = s2.substring(0,2);
                    String sec1 = "";
                    if (!(sec1.equals("0") || sec1.equals("1") || sec1.equals("2") || sec1.equals("3") || sec1.equals("4") || sec1.equals("5") || sec1.equals("6") || sec1.equals("7") || sec1.equals("8") || sec1.equals("9"))){
                        sec = sec.substring(0,1);
                    }

                    int secNum = Integer.parseInt(sec);
                    Student stu = new Student(secNum);

                    stu.FRQ1 = FRQ1;
                    stu.FRQ2 = FRQ2;
                    myStud.add(stu);
                }
            }
            x++;
        }
    }
}
