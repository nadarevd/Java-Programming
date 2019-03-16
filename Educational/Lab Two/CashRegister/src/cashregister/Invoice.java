package cashregister;



/**
  *
 * @author nadarevd
 * @id 104445626
 * @date October 2nd, 2018
 * 
 */

public class Invoice {
    
    //itemList: class composition - arrays with classes
    private Item itemList[];
    
    //itemCount: counts the number of items in the array
    private int numItems = 0;
    
    //maximumCount: maximum count of items in the array
    private final int maximumCount = 3;
    
    //total: used to compute the total price
    private float total;
    private float subtotal;
    private final float tax = 0.0625f;
    
    public Invoice()
    {
        itemList = new Item[maximumCount];
        numItems = 0;
        total = 0;
        subtotal = 0;        
    }
    
            

    public boolean buyItem(Item itm)
    {
        if (!(numItems > maximumCount))
        {
            itemList[numItems++] = new Item(itm);
            return true;
        }
        else
        {
            System.err.println("You cannot purchase anymore items.");
            return false;
        }
            
    }
    /**
     * returns the array
     * @return itemlist array
     */
    public Item[] getItemList()
    {
        return itemList;
    }
    
    
    
    /**
     * Returns the bill in proper form
     * @return 
     */
    public String getItem()
    {
        String items = "";
        for (int i = 0 ; i < numItems ; i++)
        {
            
            items += itemList[numItems].toString();
            items += "\n";
        }
        return items;
    }
    
    
    /**
     * goes through the list to determine the subtotal
     * @param itemList
     * @return subtotal of the invoice
     */
    public float subTotal(Item itemList[])
    {
        float tempTotal = 0;
        for (int i = 0 ; i < numItems ; i++)
        {
           tempTotal += (itemList[i].getPrice()) * (itemList[i].getQtty());  // computer subtotal of invoice  
        }
        
        return tempTotal; //returns subtotal
    }
    
    
    /**
     * takes in the subtotal variable and returns a taxed amount
     * @param subtotal
     * @return returns the amount due 
     */
    public float total(float subtotal)
    {
        
        return (subtotal * (1+tax));
    }
    
    
    /**
     * returns the tax applied from the subtotal
     * @param subtotal
     * @return returns the tax applied
     */
    public float tax(float subtotal)
    {
        return (subtotal * tax);
    }
    
    
    /**
     * gets the tax value
     * @return returns the float value for the tax
     */
    public float getTax()
    {
        return tax;
    }
    
}