package cashregister;

/**
 *
 * @author nadarevd
 * @id 104445626
 * @date October 2nd, 2018
 * 
 */

//import java.util.Scanner;
import java.util.*;


public class CashRegister 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
       
       
       Scanner sc = new Scanner(System.in);
       
       Invoice invoice = new Invoice();
       
       for (int i = 0 ; i < 3 ; i++)
       {
           System.out.println("Enter the item's name: ");
           String t_name = sc.nextLine();
           
           System.out.println("Enter " + t_name + "'s quantity purchased: ");
           int t_qtty = sc.nextInt();
           
           System.out.println("Enter " + t_name + "'s price: ");
           double t_price = sc.nextDouble();
           
           String t_nameTest = sc.nextLine();
           Item t_item = new Item(t_name, t_qtty, t_price);
           
           invoice.buyItem(t_item);
       }
       
       System.out.println("Your bill:\n --------------\n");
       System.out.println("Item \t\t\t Quantity \tPrice \tTotal");
       
       double total;
       double subTotal = 0;
       
       
       for (int i = 0 ; i < 3 ; i++)
       {
           String holdName = invoice.getItemList()[i].getName();
           int holdQtty = invoice.getItemList()[i].getQtty();
           double holdPrice = invoice.getItemList()[i].getPrice();
           total = holdQtty * holdPrice;
           
           System.out.printf("%-30s%-10d$%-8.2f$%-8.2f\n", holdName, holdQtty, holdPrice, total);
           //System.out.println(holdName + "  \t\t\t\t" + holdQtty + " \t\t" + holdPrice + " \t" + total);
           subTotal += total;
       }
       
       System.out.printf("Subtotal%-42s%.2f","",invoice.subTotal(invoice.getItemList()));
       System.out.printf("\n6.25 percent Tax%-34s%.3f","", invoice.tax(invoice.subTotal(invoice.getItemList())));
       System.out.printf("\nTotal%-45s%.2f\n","", invoice.total(invoice.subTotal(invoice.getItemList())));
       //System.out.println("Subtotal\t\t\t\t\t $" + subTotal);
       //System.out.println("6.25% Sales Tax\t\t\t\t\t $" + tax);
       //System.out.println("Total\t\t\t\t\t\t $" + amountDue);
      }
    }
    