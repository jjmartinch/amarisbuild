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

public class Room {
    
    int width;
	 	int lenght;
	 	int height;

	 	public Room(int width, int lenght, int height) {
	 		//Initialize the object variables using the parameters
	 		this.width = width;
	 		this.lenght = lenght;
	 		this.height = height;
	 	}

	 	public int getArea() {
	 		//Return the area
	 		return width * lenght;
	 	}
    
}
