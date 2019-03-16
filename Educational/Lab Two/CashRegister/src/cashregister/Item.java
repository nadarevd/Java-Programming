package cashregister;

/**
  *
 * @author nadarevd
 * @id 104445626
 * @date October 2nd, 2018
 * 
 */

import java.util.*;

public class Item 
{
    
 /**
  * Item will contain 3 things:
  *     - Name of the item
  *     - Quantity of the item
  *     - Price of the item
  */
    
    //Name: A descriptive name for the item, can't be empty
    private String name;
    
    //Quantity: Amount of the item being bought, cannot be less than 0
    private int qtty;
    
    //Price: How much it will cost to purchase this item, cannot be negative
    private double price;
    
    
    /** This is the default constructor used to initialize the item */
    public Item()
    {
        name = "missing";
        qtty = 0;
        price = 0;
    }
    
    
    /**Overloaded constructor used to initialize but with some given values by the instantiating object*/
    /**
     * 
     * @param name the name of the item
     * @param qtty the quantity purchased
     * @param price the unit price of the item
     */
    public Item(String name, int qtty, double price)
    {
        this();
        setName(name);
        setQtty(qtty);
        setPrice(price);
    }
    
    
    /**
     *  Overloaded copy constructor used to initialize an item from an existing item
     * 
     */
    public Item(Item itm)
    {
        name = itm.getName();
        qtty = itm.getQtty();
        price = itm.getPrice();
    }

    /**
     * sets the name of the priv var
     *
     */
    public void setName(String name)
    {
        if ((name.trim().length()) > 0)
            this.name = name;
    }
    
    /**
     * sets the qtty of the priv var
     * 
     */
    public void setQtty(int qtty)
    {
        if (qtty > 0)
            this.qtty = qtty;
        
    }
    /**
     * sets the price of the priv var
     *  
     */
    public void setPrice (double price)
    {
        if (price > 0)
            this.price = price;
        
    }
    /**
     * gets the name of the priv var
     * @return this method returns the name of the private variable
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * gets the qtty of the priv var
     * @return qtty
     */
    public int getQtty()
    {
        return qtty;
    }
    /**
     * gets the price of the priv var
     * @return  price
     */
    public double getPrice()
    {
        return price;
    }
    
    
    /**
     * 
     * overrides the object class toString method.
     * @return 
     * 
     */
    /**
     * puts it into a string
     * @return string
     */
    public String toString()
    {
        
        return name + "\t\t\t\t" + qtty + "\t\t" + price + "\t" + "[total]";
    }
    
}
