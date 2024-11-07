package com.Java21_Features.sealed_classes;

import lombok.Getter;

/**
 * Sous-classe finale Car qui étend Vehicle.
 */
@Getter
public final class Car extends Vehicle {
    private final int numberOfDoors;

    public Car(String registrationNumber, int numberOfDoors) {
        super(registrationNumber);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void startEngine() {
        System.out.println("Car engine started");
    }
}