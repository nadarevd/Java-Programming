/*
 * This code belongs to Denis Nadarevic (104445626) and is copyrighted under his name
 * Any usage of his work for commercial use or without credit will result in legal action being taken
 * This code is meant as a learning purpose under the University of Windsor (2018).
 */
package shapepolymorphism;

import static java.lang.Math.pow;

/**
 *
 * @author Denis Nadarevic <nadarevd@uwindsor.ca>
 */
public class circle extends Shape
{
    private double radius; //radius of the circle, must not be negative
    
    /**
     * Default Constructor
     * @param radius - radius of the circle 
     */
    public circle(double radius)
    {
        this.radius = setRadius(radius);
    }
    
    /**
     * sets the circle's radius
     * @param radius
     * @return 
     */
    public double setRadius(double radius)
    {
        if (isValid(radius))
            this.radius = radius;
        return this.radius;
    }
    
    /**
     * gets the radius of the circle
     * @return radius - radius of the circle
     */
    public double getRadius()
    {
        return radius;
    }
    
    /**
     * Checks if the number inputted is positive
     * @param num
     * @return boolean - true or false
     */
    public boolean isValid(double num)
    {
        return (num >=  0);
    }
    
    //~~~~ Methods ~~~~
    
    /**
     * Calculates the area of the circle, using MATH.PI
     * @return area - double
     */
    public double calculateArea()
    {
        return (Math.round(Math.PI * pow(radius,2)));
    }
    
    @Override
    public String toString()
    {
        return "O - ID of this " + super.getLabel() + " is: " + super.getID() + " " + "\nArea of the circle: " + calculateArea() + "\n---------------------------";
    }
}
