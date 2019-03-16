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
abstract class Shape
{
    private int id;
    private String label;
    private static int counter = 0;
    
    abstract public double calculateArea();
    
    
    /**
     * Default Constructor
     */
    public Shape()
    {
        id = ++counter; //unique ID for each shape
    }
    
    /**
     * Gets the id of the shape
     * @return id - ID of the shape
     */
    public int getID()
    {
        return id;
    }
    
    /**
     * gets the label of the shape
     * @return label - shape's label
     */
    public String getLabel()
    {
        return label;
    }
    
    /**
     * sets the shape's label
     * @param label 
     * @return 
     */
    public String setLabel(String label)
    {
        if (label.trim().length() > 0)
            this.label = label;
        return this.label;
    }
    
    //~~~~ Methods ~~~~
    
    /**
     * Outputs a description of the shape, such as label and ID
     */
    protected void describeShape()
    {
        System.out.println("This is just a shape labelled: " + label);
        System.out.println("> ID: " + id);
    }
}
