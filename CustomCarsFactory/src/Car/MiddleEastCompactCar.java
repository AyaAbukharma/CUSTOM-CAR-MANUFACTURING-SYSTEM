/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Car;

/**
 *
 * @author hp
 */
public class MiddleEastCompactCar implements Car {

    private String name;
    private String description;
    private String region;
    private String size;

    public MiddleEastCompactCar() {
        name = "Middle East Compact Car";
        description = "Compact passenger car designed for the Middle East market";

        region = "Middle East";
        size = "Compact";
    }

    @Override
    public String getDescription() {
        return name + " - " + description;
    }

    @Override
    public void formSize() {
        System.out.println("Middle East Compact chassis structural layout");
    }

    @Override
    public String getRegion() {
        return region;
    }

    @Override
    public String getSize() {
        return size;
    }
}