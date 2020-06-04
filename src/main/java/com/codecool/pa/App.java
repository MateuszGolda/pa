package com.codecool.pa;

import com.codecool.pa.vehicle.*;
import com.codecool.pa.vehicle.abstractVehicles.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new FamilyCar());
        vehicles.add(new Truck());
        vehicles.add(new Helicopter());
        vehicles.add(new MotorBoat());

        vehicles.forEach(Vehicle::move);
    }
}
