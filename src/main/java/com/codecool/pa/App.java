package com.codecool.pa;

import com.codecool.pa.Vehicle.*;
import com.codecool.pa.Vehicle.AbstrackVehicles.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new FamilyCar());
        vehicles.add(new Truck());
        vehicles.add(new Heli());
        vehicles.add(new MotorBoat());

        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.makeSound());
            System.out.println(vehicle.move());
        }
    }
}
