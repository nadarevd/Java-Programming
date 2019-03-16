package cashregister;


import cashregister.Item;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Owner
 */
public class testItem
{
    public static void main(String args[])
    {
        System.out.println("This is a test to see if this works...");
    
        Item i1 = new Item("lollipops", 10, 4.99);           //test default constructor
        Item i2 = new Item("diet soda", 1, 2.99);
        Item i3 = new Item("chocolate bar", 20, 1.99);
        Item i4 = new Item("bts tickets", 2, 399.99);
        
        
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println(i4);
    }
}
