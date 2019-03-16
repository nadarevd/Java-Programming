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
public class person 
{  
    //person attributes
    protected String name;
    protected int age;
    
    /**
     * Default constructor: Sets default values
     */
    public person()
    {
        name = "Private Contractor";
        age = 18;
    }
    
    /**
     * Overloaded constructor: Fills with custom inputs
     * @param name
     * @param age 
     */
    public person(String name, int age)
    {
        this();
       setName(name);
       setAge(age);
    }
    
    /**
     * Sets name to custom input
     * @param name 
     */
    public void setName(String name)
    {
        if (name.trim().length() > 0)
            this.name = name.substring(0, 1).toUpperCase() + name.substring(1);
    }
    
    /**
     * Sets age to custom input
     * @param age 
     */
    public void setAge(int age)
    {
        if (age < 150)
            this.age = age;
    }
    
    /**
     * getName gives you the name of the person instance
     * @return name in this instance
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * getAge gives you the age of the person in this instance
     * @return age in this instance
     */
    public int getAge()
    {
        return age;
    }
    
    
}
