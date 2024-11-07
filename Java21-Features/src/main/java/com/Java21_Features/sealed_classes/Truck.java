package com.Java21_Features.sealed_classes;

import lombok.Getter;

/**
 * Sous-classe finale Truck qui étend Vehicle.
 */
@Getter
public final class Truck extends Vehicle {
    private final double cargoCapacity;

    public Truck(String registrationNumber, double cargoCapacity) {
        super(registrationNumber);
        this.cargoCapacity = cargoCapacity;
    }

    @Override
    public void startEngine() {
        System.out.println("Truck engine started");
    }
}