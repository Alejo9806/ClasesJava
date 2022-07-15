package com.clases;

public class Main {
    public static void main(String[] args) {

        SmartPhone xiaomiNote10 = new SmartPhone("redmin Note 10","xiaomi","2020",120,16,"amolet",60.3,true,true);
        SmartWatch appleWatch = new SmartWatch("pro x","apple","2021",64,8,"amolet",true,"plastico");

        System.out.println(xiaomiNote10.toString());
        System.out.println(appleWatch.toString());
    }
}
