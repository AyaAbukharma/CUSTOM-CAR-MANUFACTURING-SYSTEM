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
public class AsiaMidsizeCar implements Car {

    private String name;
    private String description;
    private String region;
    private String size;

    public AsiaMidsizeCar() {
        name = "Asia Midsize Car";
        description = "Midsize passenger car designed for the Asia market";

        region = "Asia";
        size = "Midsize";
    }

    @Override
    public String getDescription() {
        return name + " - " + description;
    }

    @Override
    public void formSize() {
        System.out.println("Asia Midsize chassis structural layout");
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