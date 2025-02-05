package com.raz.Java_CH.java8.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,9,1,0);
        int sum = numbers.stream().filter(n -> n%2 == 0).mapToInt(n -> n).sum();
        System.out.println(sum);

        Predicate<Integer> isEven = x -> x%2 == 0;
        Predicate<String> startsWithLetterV = x -> x.toLowerCase().charAt(0) == 'v';
       // System.out.println(startsWithLetterV.test("Hello"));

        Predicate<String> endsWithLetterL = x -> x.toLowerCase().charAt(x.length()-1) == 'l';
        Predicate<String> and = startsWithLetterV.and(endsWithLetterL);
        System.out.println(and.test("Vipul"));

        Predicate<String> or = startsWithLetterV.or(endsWithLetterL);
        System.out.println(or.test("Vivek"));

        System.out.println(startsWithLetterV.negate().test("Vipul"));

        Predicate<Object> predicate = Predicate.isEqual("Vipul");
        System.out.println(predicate.test("Vipul"));

        
        Student s1 = new Student("Vipul",1);
        Student s2 = new Student("Ram",2);
        Predicate<Student> studentPredicate = x -> x.getId()>1;
        System.out.println(studentPredicate.test(s2));
    }

    private static class Student{
        private String name;
        private int id;

        public Student(String name, int id) {
            this.name = name;
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }
    }
}
