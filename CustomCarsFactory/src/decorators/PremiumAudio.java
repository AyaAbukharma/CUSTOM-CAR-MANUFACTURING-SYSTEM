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
public class PremiumAudio extends CarDecorator {

    public PremiumAudio(Car car) {
        super(car);
    }

    @Override
    public String getDescription() {
        return car.getDescription() + " + Premium Audio System";
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