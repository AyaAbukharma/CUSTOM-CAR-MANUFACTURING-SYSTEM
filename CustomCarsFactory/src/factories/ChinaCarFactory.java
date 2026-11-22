/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factories;

import Car.Car;
import Car.ChinaCompactCar;
import Car.ChinaFullsizeCar;
import Car.ChinaMidsizeCar;

/**
 *
 * @author hp
 */
public class ChinaCarFactory implements CarFactory {

    @Override
    public Car createCompactCar() {
        return new ChinaCompactCar();
    }

    @Override
    public Car createMidsizeCar() {
        return new ChinaMidsizeCar();
    }

    @Override
    public Car createFullsizeCar() {
        return new ChinaFullsizeCar();
    }
}