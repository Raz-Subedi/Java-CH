package com.raz.Java_CH.methods;

public class FinalMethod {

    public final void displayMessage() {
        System.out.println("This is a final method.");
    }

}

class Test1 extends FinalMethod{
    /*public void displayMessage(){
                                        Cannot override here as it is final in the parent class.
    }*/


    public static void main(String[] args) {
        System.out.println("This is the example for the Final Method");
    }
}
