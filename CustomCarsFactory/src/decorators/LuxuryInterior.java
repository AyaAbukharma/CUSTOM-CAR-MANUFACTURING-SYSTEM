/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorators;

import Car.Car;

/**
 *
 * @author hp
 */
public class LuxuryInterior extends CarDecorator {

    public LuxuryInterior(Car car) {
        super(car);
    }

    @Override
    public String getDescription() {
        return car.getDescription() + " + Luxury Interior Pack";
    }
    @Override
public String getRegion() {
    return car.getRegion();
}

@Override
public String getSize() {
    return car.getSize();
}

  
}