package com.Java21_Features.sealed_classes;

import lombok.Getter;

/**
 * Classe scellée Vehicle qui ne peut être étendue que par Car et Truck.
 */
@Getter
public sealed class Vehicle permits Car, Motorcycle, Truck {
    private final String registrationNumber;

    public Vehicle(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public void startEngine() {
        System.out.println("Vehicle engine started");
    }
}