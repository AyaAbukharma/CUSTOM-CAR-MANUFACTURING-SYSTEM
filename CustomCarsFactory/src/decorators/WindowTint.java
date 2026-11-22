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
public class WindowTint extends CarDecorator {

    public WindowTint(Car car) {
        super(car);
    }

    @Override
    public String getDescription() {
        return car.getDescription() + " + Window Tint";
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