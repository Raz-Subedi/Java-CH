package com.raz.Java_CH.encapsulation;

public class Test {
    public static void main(String[] args) {

        Customer c =  new Customer();
        c.setId(154);
        c.setName("Raz");
        c.setAge(25);
        c.setCity("Pokhara");
        c.setPhone("984567130");

        System.out.println(c);

//        System.out.println("Id = "+c.getId());
//        System.out.println("Name = "+c.getName());
//        System.out.println("Age = "+c.getAge());
//        System.out.println("Phone = "+c.getPhone());
//        System.out.println("City = "+c.getCity());
    }
}
