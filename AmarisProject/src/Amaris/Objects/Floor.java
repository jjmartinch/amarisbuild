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

public class Floor {
    
    Building building;
		ArrayList<Room> rooms = new ArrayList<Room> (); //Initialize the variable rooms to an empty list

		public Floor(Building building) {
			//Initialize the "building" variable using the parameter
			this.building = building;
		}

		public void addRoom(Room room) {
			//Add the room given in the parameter to the "rooms" list
			rooms.add(room);
		}

		public int getArea() {
			int total = 0;

			// Loop to sum up the area of all rooms
			for(Room room : rooms) {
				// Add the area of the current room to the variable "total"
				total += room.getArea();
			}

			return total;
		}
    
}
