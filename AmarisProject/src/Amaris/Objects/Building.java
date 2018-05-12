/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Amaris.Objects;

/**
 *
 * @author Jorge
 */
 import java.util.ArrayList;

public class Building {
    
    String buildingName;
    ArrayList<Floor> floors = new ArrayList<Floor>(); //Initialize the variable floors to an empty list

        public Building(String buildingName) {
	 		//Initialize the "buildingName" variable using the parameter
	this.buildingName = buildingName;
	}

	 	public void addFloor(Floor floor) {
	 		// Add the floor given in the parameter to the "floors" list
	 		floors.add(floor);
	 	}

	 	public int getTotalArea() {
	 		int total = 0;

	 		//Loop to sum up the area of all floors
	 		for(Floor floor : floors) {
	 			// Add the area of the current floor to the variable "total"
	 			total += floor.getArea();
	 		}

	 		return total;
	 	}
    
}
