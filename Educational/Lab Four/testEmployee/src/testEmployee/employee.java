/*
 * This code belongs to Denis Nadarevic (104445626) and is copyrighted under his name
 * Any usage of his work for commercial use or without credit will result in legal action being taken
 * This code is meant as a learning purpose under the University of Windsor (2018)
 */
package testemployee;

/**
 *
 * @author Denis Nadarevic <nadarevd@uwindsor.ca>
 */
public class employee extends person 
{
    //Employee attributes 
    private int year_hired;
    private int id;
    
    //Counter will be shared as one with all employees
    private static int counter = 0;
    
    /**
     * Constructor: Calls superclass attributes and collect input for employee class attributes
     * @param name - name of person
     * @param age - age of person
     * @param year_hired -year hired for employee
     */
    public employee(String name, int age, int year_hired)
    {
        super(name, age);
        setYear(year_hired);
        id = ++counter;
    }
    
    /**
     * Sets the year to custom value, if within the 1900 and 2999
     * @param year_hired 
     */
    public void setYear(int year_hired)
    {
        if(year_hired > 1900 && year_hired < 2999)
            this.year_hired = year_hired;
        else
            this.year_hired = 2018;
    }
    
    /**
     * Gets the year hired for this employee
     * @return year_hired 
     */
    public int getYear()
    {
        return year_hired;
    }
    
    /**
     * Gets the ID for this employee
     * @return ID for current employee
     */
    public int getID()
    {
        return id;
    }
    
    /**
     * Overrided toString Method to output formatter information
     * @return String of formatted information
     */
    public String toString()
    {
        return name + " was hired in " + year_hired + " and is " + age + ".";
    }
}


