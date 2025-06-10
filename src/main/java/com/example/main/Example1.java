package com.example.main;

import com.example.beans.Vehicle;

public class Example1 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Honda Amaze...");
        System.out.println("Vehicle name from Non-Spring Context : " + vehicle.getName());
    }
}
