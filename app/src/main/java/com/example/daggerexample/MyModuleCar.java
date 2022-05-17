package com.example.daggerexample;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class MyModuleCar {

    @Provides
    @Singleton
    Motor provideMotor() {
        return new Motor();
    }

    @Provides
    @Singleton
    Vehicle provideVehicle() {
        return new Vehicle(new Motor());
    }
}
