/*
     * @author: Mays Jabbar
     * Class ID: 415
     * Assignment #: 2
     * 
     * 
     * This class contains a simple calculator subtraction, addition, multiplication, and dividing
     * The subtract method should subtract the parameter.
     * The get total method should return the total.
     * the multiply method shpuld multiply the total * parameters.
     * 
     * 
     */
package cse360assignment2;
/** 
 * This class contains calculation that has some methods.
 * adding the method, subtracting method, get the total and return it
 * multiply method that should multiply the total by the parameter
 * the divide method should divide the total by the parameter and also
 * a getHistory method.
 * 
 * @author:     Mays Jabbar
 */
public class Calculator {

    private int total;
    StringBuilder history;
	 /**
         * This is a constructor method that initializes the total to 0. 
         */
	public Calculator () {
		total = 0;  
                history = new StringBuilder("0");
	}
	/**
         * this is a method that returns the current value of the total.
         * @return 
         */
	public int getTotal () {
		return total;
	}
	/**
         * This is an add method that should add the parameter to the total variable. 
         */
	public void add (int value) {
                history.append(" + " + value);
		total +=  value;
	}
		/**
         * This is a method that subtract the parameter from the total variable.
         */

	public void subtract (int value) {
                history.append(" - " + value);
		total -= value;
	}
	/**
         * This is a multiply method the total by the parameter.
         */
	public void multiply (int value) {
                history.append(" * " + value);    
		total *= value;
	}
	/**
         * The divide method is dividing the total by the parameter by using an integer division
         * If the parameter is 0 then set the total to 0.
         */
	public void divide (int value) {
            history.append(" / " + value);
            if(value == 0)
                total = 0;
            else
                total /= value;
	}
	/**
         * The get history method will use normal operation, which returns the history of all the actions as a string.
         * @return a String that separates all operations and values with a space.
         */
	public String getHistory () {
		return history.toString();
	}
}