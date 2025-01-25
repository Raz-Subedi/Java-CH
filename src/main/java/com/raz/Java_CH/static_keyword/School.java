package com.raz.Java_CH.static_keyword;

public class School {

    private static School school = new School();

    private School(){

    }

    public static School getInstance(){
        return school;
    }
}
