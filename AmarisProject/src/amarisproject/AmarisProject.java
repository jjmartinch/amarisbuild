/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amarisproject;

/**
 *
 * @author Jorge
 */

import Amaris.Objects.*;

public class AmarisProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Create building
		Building building = new Building("My apartment");

		//Create floors
		Floor firstFloor = new Floor(building);
		Floor secondFloor = new Floor(building);
		Floor thirdFloor = new Floor(building);

		//Create rooms
		Room basicRoom = new Room(10,10,3);
		Room doubleRoom = new Room (20,20,3);
		Room kitchen = new Room (10,10,3);
	
		//Add rooms to first floor
		firstFloor.addRoom (basicRoom);
		firstFloor.addRoom (basicRoom);
		firstFloor.addRoom (kitchen);

		//Add rooms to second floor
		secondFloor.addRoom (basicRoom);
		secondFloor.addRoom (doubleRoom);
		secondFloor.addRoom (basicRoom);

		//Add rooms to third floor
		thirdFloor.addRoom (doubleRoom);

		//Print outputs
		System.out.println("First floor area: " + firstFloor.getArea());
		System.out.println("Second floor area: " + secondFloor.getArea());
		System.out.println("Third floor area: " + thirdFloor.getArea());

		System.out.println ("Building area before adding floors: " + building.getTotalArea());

		//Add the floors to the building
		building.addFloor(firstFloor);
		building.addFloor(secondFloor);
		building.addFloor(thirdFloor);

		// Print outputs
		System.out.println ("Building area after adding floors: " + building.getTotalArea());
        
    }
    
}
