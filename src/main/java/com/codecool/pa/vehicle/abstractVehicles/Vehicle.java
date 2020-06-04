package com.codecool.pa.vehicle.abstractVehicles;

import com.codecool.pa.vehicle.abstractVehicles.interfaces.Movable;
import com.codecool.pa.vehicle.abstractVehicles.interfaces.Audible;

public abstract class Vehicle implements Audible, Movable {
    protected String sound;
    protected String move;

    @Override
    public void makeSound() {
        System.out.println(sound);
    }

    @Override
    public void move() {
        System.out.println(move);
        makeSound();
    }
}
