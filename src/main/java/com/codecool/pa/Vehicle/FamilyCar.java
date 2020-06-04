package com.codecool.pa.Vehicle;

import com.codecool.pa.Vehicle.AbstrackVehicles.LandVehicle;

public class FamilyCar extends LandVehicle {
    @Override
    public String makeSound() {
        return "Pip pip!";
    }
}
