package com.raz.Java_CH.jump;

public class BreakExample {
    public static void main(String[] args) {

        for(int i=0; i<10; i++){

            if(i == 5){
                break;
            }
            System.out.println(i);
        }
    }

     // The break statement is used to terminate the execution of a loop or switch statement immediately.
    //   In loops: It exits the loop and transfers control to the statement following the loop.
    //   In switch statements: It exits the switch block after a case is matched.
}
