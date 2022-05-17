package com.example.daggerexample;

import javax.inject.Inject;

public class Vehicle {
    private Motor motor;

    @Inject
    Vehicle(Motor motor) {
        this.motor = motor;
    }

    void increaseSpeed(int value) {
        motor.acelerate(value);
    }

    void decreaseSpeed(int value) {
        motor.decelerate(value);
    }

    void stop() {
        motor.brake();
    }

    int getSpeed() {
        return motor.getRpm();
    }
}
