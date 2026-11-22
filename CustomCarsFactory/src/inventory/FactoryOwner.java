/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventory;

import observer.Observer;

/**
 *
 * @author hp
 */
public class FactoryOwner implements Observer {

    private String name;

    public FactoryOwner(String name) {
        this.name = name;
    }

    @Override
    public void update(String region, String size, int totalSold) {

        System.out.println("Notification for Factory Owner: " + name);

        System.out.println("Region: " + region);

        System.out.println("Chassis Size: " + size);

        System.out.println("Total Sold: " + totalSold);

        System.out.println("-------------------------");
    }
}