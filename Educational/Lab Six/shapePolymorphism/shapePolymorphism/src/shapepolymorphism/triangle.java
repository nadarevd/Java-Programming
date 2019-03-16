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
public class triangle extends Shape
{
    private double base; //base of the triangle, must not be negative
    private double height; //height of the triangle, must not be negative

    /**
     * Default Constructor 
     * @param base - base of the triangle
     * @param height - height of the triangle
     */
    public triangle(double base, double height)
    {
        this.base = setBase(base);
        this.height = setHeight(height);
    }
    
    /**
     * sets the triangle's base
     * @param base
     * @return base
     */
    public double setBase(double base)
    {
        if (isValid(base))
            this.base = base;
        return this.base;
    }
    
    /**
     * sets the triangle's height
     * @param height 
     * @return height 
     */
    public double setHeight(double height)
    {
        if (isValid(height))
            this.height = height;
        return this.height;
    }
    
    /**
     * gets the base of the triangle
     * @return base
     */
    public double getBase()
    {
        return base;
    }
    
    /**
     * gets the height of the triangle
     * @return height
     */
    public double getHeight()
    {
        return height;
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
     * Calculates the area of the triangle
     * @return area - double
     */
    public double calculateArea()
    {
        return ((base * height)/2);
    }
    
    @Override
    public String toString()
    {
        return  "△ - ID of this " + super.getLabel() + " is: " + super.getID() + " " + "\nArea of the triangle: " + calculateArea() + "\n---------------------------";
    }
}
