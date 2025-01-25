package com.raz.Java_CH.equals;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student(1,"raz","Mathematics",100);
        Student s2= new Student(2,"raz","Computer",90);
        Student s3= new Student(3,"raz","Computer",100);

        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2);

        if(s1.getCourseName().equals("Mathematics")){
            System.out.println("Same");
        }
        else {
            System.out.println("Different");
        }
    }
}
