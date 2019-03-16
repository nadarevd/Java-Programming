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

import java.util.Random;

public class TestEmployee {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        //name, age, date hired, number of hours, hourly rate
        hourlyWorker hw1 = new hourlyWorker("Jim", 19, 2017, 10, 15.75);
        
        System.out.println(hw1);    //displays: Jim was hired in 2017 and is 19 years old
        
        hw1.PayWorker();            //displays: Jim is an employee who needs to be paid
                                    //Jim is an hourly worker and is paid $157.5 this week
                                    
        hw1.PayWorker();
        
        employee list[];
        list = new employee[5];
        
        list[0] = new hourlyWorker("Emily", 19, 2016, randNum(), 15.75);
        list[1] = new hourlyWorker("Denis", 20, 2010, randNum(), 15.75);
        list[2] = new hourlyWorker("Matthew", 19, 2011, randNum(), 17.00);
        list[3] = new hourlyWorker("Abayomi", 17, 2017, randNum(), 15.00);
        list[4] = new hourlyWorker("Ben", 27, 2009, randNum(), 27.00);
        
        for (int i = 0 ; i < 5 ; i++)
        {
            list[i].PayWorker();
        }
    }
 
    /**
     * Method that returns a random number from 0 to 40
     * @return integer
     */
    public static int randNum()
    {
        Random rand = new Random();
        return rand.nextInt(40);
    }
}
