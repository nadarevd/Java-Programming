package cashregister;

/**
  *
 * @author nadarevd
 * @id 104445626
 * @date October 2nd, 2018
 * 
 */
class testInvoice
{
    public static void main(String args[])
    {
        System.out.println("This is a simple test to see if the Invoice class works...");
       
        
        Item i1 = new Item("exo tickets", 2, 299.99);   
        
                
        Item i2 = new Item("bts tickets", 2, 399.99);
        Item i3 = new Item("monsta x", 2, 249.99);
        
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
    }
}
