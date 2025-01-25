package com.raz.Java_CH.static_keyword;

public class Utils {
    public static int max(int a, int b){
        if(a>b){
            return a;
        }
        return b;
    }
    public static int min(int a, int b){
        if(a<b){
            return a;
        }
        return b;
    }

    public static String trimAndUppercase(String str){
        if(str!=null){
            return str.trim().toUpperCase();
        }else{
            return "";
        }
    }
}
