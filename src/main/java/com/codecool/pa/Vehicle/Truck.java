package com.codecool.pa.Vehicle;

import com.codecool.pa.Vehicle.AbstrackVehicles.LandVehicle;

public class Truck extends LandVehicle {
    @Override
    public String makeSound() {
        return "Bu bu!";
    }
}
