/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factories;

import Car.Car;
import Car.MiddleEastCompactCar;
import Car.MiddleEastFullsizeCar;
import Car.MiddleEastMidsizeCar;

/**
 *
 * @author hp
 */
public class MiddleEastCarFactory implements CarFactory {

    @Override
    public Car createCompactCar() {
        return new MiddleEastCompactCar();
    }

    @Override
    public Car createMidsizeCar() {
        return new MiddleEastMidsizeCar();
    }

    @Override
    public Car createFullsizeCar() {
        return new MiddleEastFullsizeCar();
    }
}