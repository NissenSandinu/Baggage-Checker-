package Baggage;
/*
 * Author: Nissen Sandinu Wettasinghe
 * Modified Date: July 28, 2024
 * Description:
 * This class represents a baggage object with dimensions and weight. It includes constructors, 
 * getters and setters, and a `toString` method to provide details about the baggage. The class 
 * integrates with a BaggageChecker utility to determine carry-on eligibility and overweight status.
 */

public class Baggage {
	// Instance variables to store the dimensions and weight of the baggage.
	private int length;
	private int width;
	private int height;
	private double weight;
	
	//Default Constructor
	public static final int DEFAULT_LENGTH = 65; 
	public static final int DEFAULT_WIDTH = 25;
	public static final int DEFAULT_HEIGHT = 50;
	public static final double DEFAULT_WEIGHT = 10.0;
	
	// Default constructor to initialise baggage with default values
	public Baggage() {
		// Calls the overloaded constructor with default values.
		this(DEFAULT_LENGTH, DEFAULT_WIDTH, DEFAULT_HEIGHT, DEFAULT_WEIGHT);
		}
	// Overloaded Constructor for get and set functions
	public Baggage(int length, int width, int height, double weight) {
		this.length = length;
		this.width = width;
		this.height = height;
		this.weight = weight;
	}
	// get and set functions for baggage dimensions and weight.
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	  /**
     * Generates a string representation of the baggage object, including:
     * - Dimensions and weight
     * - Whether it can be used as carry-on
     * - Overweight status and surcharge (if applicable)
     *
     * @return A descriptive string about the baggage.
	*/ 

	public String toString(){
        String msg = "This bag has length " + length + " cm, width " + width 
        		+ " cm, height " + height + " cm, and weight " + weight + " kg.\n";
     // Check if the baggage can be used as a carry on
        if (BaggageChecker.canBeUsedAsACarryOn(this)) {// 'this' is used as an argument to access the gets and sets.
        	msg+= "This bag can be used as a carry on.\n";  
        }
        // Check if the baggage exceeds the allowed weight limit, if it exceeds the weight a surcharge is added.
        if (BaggageChecker.allowedWeightIsMoreThanMax(this)) {
        msg+= "This bag is overweight; it exceeds the allowed weight of 22.00 kg. A surcharge of " +
        		String.format("$%.2f" ,BaggageChecker.calculateWeightSurcharge(this)) + " applies.\n";
        } 	
         return  msg;
	}
	
}
