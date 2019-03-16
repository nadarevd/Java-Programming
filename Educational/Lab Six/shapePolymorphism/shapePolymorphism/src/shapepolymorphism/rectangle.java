/*
 * This code belongs to Denis Nadarevic (104445626) and is copyrighted under his name
 * Any usage of his work for commercial use or without credit will result in legal action being taken
 * This code is meant as a learning purpose under the University of Windsor (2018).
 */
package shapepolymorphism;

/**
 *
 * @author Denis Nadarevic <nadarevd@uwindsor.ca>
 */
public class rectangle extends Shape 
{
    private double length = 0; //length of the rectangle, must be a positive number
    private double width = 0; //width of the rectangle, must be a positive number
    
    /**
     * Overloaded Constructor
     * @param length - length of the rectangle
     * @param width  - width of the rectangle
     */
    public rectangle(double length, double width)
    {
        super();
        this.length = setLength(length);
        this.width = setWidth(width);
    }
    
    /**
     * Sets the rectangle's length
     * @param length
     * @return length - double
     */
    public double setLength(double length)
    {
        if (isValid(length))
            this.length = length;
        return this.length;
    }
    
    /**
     * Set's the rectangle's width
     * @param width
     * @return width - double
     */
    public double setWidth(double width)
    {
        if(isValid(width))
            this.width = width;
        return this.width;
    }
    
    /**
     * gets the length of the rectangle
     * @return length - double
     */
    public double getLength()
    {
        return length;
    }
    
    /**
     * gets the width of the rectangle
     * @return width - double
     */
    public double getWidth()
    {
        return width;
    }
    
    /**
     * Checks if the number inputted is positive
     * @param num
     * @return boolean - true or false
     */
    public boolean isValid(double num)
    {
        return (num >= 0);
    }
    
    //~~~~ Methods~~~~

    /**
     * returns the calculated area of this shape
     * @return area -double
     */
    @Override
    public double calculateArea()
    {
        return  (length * width);
    }
   
    @Override
    public String toString()
    {
        return "☐ - ID of this " + super.getLabel() + " is: " + super.getID() + " " + "\nArea of the rectangle: " + calculateArea() + "\n---------------------------";
    }
}
