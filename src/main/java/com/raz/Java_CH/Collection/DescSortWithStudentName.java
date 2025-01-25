package com.raz.Java_CH.Collection;

import java.util.Comparator;

public class DescSortWithStudentName implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Student student1 = (Student) o1;
        Student student2 = (Student) o2;

        if(student1.rollnumber > student2.rollnumber){
            return -1;
        }
        if(student1.rollnumber < student2.rollnumber){
            return 1;
        }
        return 0;

    }
}
