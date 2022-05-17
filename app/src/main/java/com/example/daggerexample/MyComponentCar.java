package com.example.daggerexample;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {MyModuleCar.class})
interface MyComponentCar {
    Vehicle provideVehicle();

    void inject(MainActivity main);
}
