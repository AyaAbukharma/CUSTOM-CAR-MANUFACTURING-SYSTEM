/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factories;

import Car.AsiaCompactCar;
import Car.AsiaFullsizeCar;
import Car.AsiaMidsizeCar;
import Car.Car;

/**
 *
 * @author hp
 */
public class AsiaCarFactory implements CarFactory {

    @Override
    public Car createCompactCar() {
        return new AsiaCompactCar();
    }

    @Override
    public Car createMidsizeCar() {
        return new AsiaMidsizeCar();
    }

    @Override
    public Car createFullsizeCar() {
        return new AsiaFullsizeCar();
    }
}