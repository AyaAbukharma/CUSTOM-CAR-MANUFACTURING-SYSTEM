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
public class AsiaCompactCar implements Car {

    private String name;
    private String description;
    private String region;
    private String size;

    public AsiaCompactCar() {
        name = "Asia Compact Car";
        description = "Compact passenger car designed for the Asia market";

        region = "Asia";
        size = "Compact";
    }

    @Override
    public String getDescription() {
        return name + " - " + description;
    }

    @Override
    public void formSize() {
        System.out.println("Asia Compact chassis structural layout");
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