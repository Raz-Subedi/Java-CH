package com.raz.Java_CH.interfaces;

public class Test {
    public static void main(String[] args) {

        SmartPhone smartPhone = new SmartPhone();
        smartPhone.makeCall("384560");
        smartPhone.endCall();
        smartPhone.playMusic();
        smartPhone.stopMusic();
        smartPhone.recordVideo();
        smartPhone.takePhoto();
    }
}
