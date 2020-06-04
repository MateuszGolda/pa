package com.codecool.pa.Vehicle.AbstrackVehicles;

import com.codecool.pa.Vehicle.AbstrackVehicles.Interfaces.Movable;
import com.codecool.pa.Vehicle.AbstrackVehicles.Interfaces.Soundable;

public abstract class Vehicle implements Soundable, Movable {
    protected String sound;
    protected String move;

    @Override
    public void makeSound() {
        System.out.println(sound);
    }

    public void move() {
        System.out.println(move);
        makeSound();
    }
}
