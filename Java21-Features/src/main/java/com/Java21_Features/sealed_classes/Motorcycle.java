package com.Java21_Features.sealed_classes;

// Cette classe ne compilera pas car Vehicle est scellée et ne permet pas Motorcycle
public final class Motorcycle extends Vehicle {
    public Motorcycle(String registrationNumber) {
        super(registrationNumber);
    }
}