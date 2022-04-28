package org.example._2_basics;

public class Main {
    public static void main(String[] args) {
        Month january = Month.JANUARY;
        switch(january){
            case JANUARY:
                System.out.println("Happy new year!");
                break;
            default:
                System.out.println("Just a standard month - sigh");
        }
        LogLevel log = LogLevel.DEBUG;
        System.out.println(log);

    }
}
