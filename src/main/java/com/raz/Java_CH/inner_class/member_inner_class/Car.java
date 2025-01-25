package com.raz.Java_CH.inner_class.member_inner_class;

public class Car {
    private String model;
    private boolean isEngineOn;

    public Car(String model) {
        this.model = model;
        this.isEngineOn = false;
    }

    class Engine{
        void start(){
            if(!isEngineOn){
                isEngineOn = true;
                System.out.println(model + "Engine Started");
            }else{
                System.out.println(model + "Engine is already on");
            }
        }


        void stop(){
            if(isEngineOn){
                isEngineOn = false;
                System.out.println(model +" Engine Stopped");
            }else{
                System.out.println(model + "Engine is already Off");
            }
        }
    }
}
