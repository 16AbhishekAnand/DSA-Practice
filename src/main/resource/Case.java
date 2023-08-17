//package com.example.demo;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


public class Case {
    
    private static int distance;
    private static int speed;
    private static LocalTime appointmentTime;
    
    public Case(int distance,int speed,LocalTime appointmentTime) {
        Case.distance = distance;
        Case.speed = speed;
        Case.appointmentTime = appointmentTime;
    }
    
    public String toString() {
        return "dis:"+" "+distance+" "+"speed: "+" "+speed+" "+"AppointmentTime: "+" "+appointmentTime;
    }

    public static double calTime() {
        return distance/speed;
    }
    
    static CharSequence check = "11:10";
    static LocalTime constInp = LocalTime.parse(check); // to pass in constructor input.
    static LocalTime  lt = null;
    public static LocalTime setTime() {
        double finalTime = calTime();
        //System.out.println(finalTime);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm");
        lt = LocalTime.parse(check,dtf); // parse can be implemented only on charSequence & String.
        lt = lt.plusHours(-(long) finalTime);
        return lt;
    }
    public static void main(String args[]) {
        Case cs = new Case(30,20,constInp);
        System.out.println("Patient Details:\n"+cs);
        LocalTime finalDeparture = setTime();
        System.out.println("Departure time to reach on destination is : "+finalDeparture);
        

    }
}
