package com.raz.Java_CH.static_keyword;

public class Test {

/*    final int a;

    {
        a = 10;
    }*/

     int a = 10;

    static void check(){
        Test t = new Test();
        System.out.println(t.a);
    }

    public static void main(String[] args) {

       // static int roll = 5;

        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        Student student4 = new Student();
        Student student5 = new Student();
        System.out.println(Student.count);
        Student.getCount();
        System.out.println(Utils.max(1,22));
        System.out.println(Utils.min(50,55));
        Utils.trimAndUppercase("raz    kumar  subedi ");

        School instance = School.getInstance();

        Test t = new Test();

        t.check();
    }
}
