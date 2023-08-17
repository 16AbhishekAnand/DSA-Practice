package com.example.demo;
import ch.qos.logback.core.util.Loader;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DepartureTime {
    private static LocalTime appointment;
    private static int distance;
    private static int speed;


    public DepartureTime(LocalTime appointment, int distance, int speed) {
        super();
        DepartureTime.appointment = appointment; // static variable is initiasied via class name.
        DepartureTime.distance = distance;
        DepartureTime.speed = speed;
    }
    public LocalTime getAppointment() {
        return appointment;
    }

    public void setAppointment(LocalTime appointment) {
        DepartureTime.appointment = appointment;
    }
    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        DepartureTime.distance = distance;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        DepartureTime.speed = speed;
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
}
