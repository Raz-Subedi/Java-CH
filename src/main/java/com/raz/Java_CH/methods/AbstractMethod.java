package com.raz.Java_CH.methods;

public abstract class AbstractMethod {

    abstract void draw();                    // This is the abstract method must be implemented by subclass.
}

class Test extends AbstractMethod{

    @Override
    void draw() {
        System.out.println("Iam drawing");
    }

    public static void main(String[] args) {
        AbstractMethod t = new Test();
        t.draw();
    }
}
