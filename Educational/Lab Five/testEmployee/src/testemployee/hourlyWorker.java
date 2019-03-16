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

import java.lang.*;
import java.text.DecimalFormat;


public class hourlyWorker extends employee
{
    private int num_hours;
    private double hourly_rate;
    
    /**
     * Constructor: Sets all the information
     * @param name name of the hourly worker
     * @param age age of the hourly worker
     * @param year_hired the year the hourly worker was hired
     * @param num_hours number of hours worked
     * @param hourly_rate the rate of pay for the hourly worker
     */
    public hourlyWorker(String name, int age, int year_hired, int num_hours, double hourly_rate)
    { 
        super(name,age,year_hired);
        setHours(num_hours);
        setRate(hourly_rate);
    }
    
    /**
     * Method for setting data for num_hours
     * @param num_hours 
     */
    public void setHours(int num_hours)
    {
        if (num_hours > 0)
            this.num_hours = num_hours;
        else
            this.num_hours = 0;
    }
    
    /**
     * Method for setting data for hourly rate
     * @param hourly_rate 
     */
    public void setRate(double hourly_rate)
    {
        if (hourly_rate > 0)
            this.hourly_rate = hourly_rate;
        else
            this.hourly_rate = 0.00;
    }
    
    /**
     * Access method for getting the number of hours
     * @return num_hours
     */
    public int getHours()
    {
        return num_hours;
    }
    
    /**
     * Access method for getting the rate of pay
     * @return hourly_rate
     */
    public double getRate()
    {
        return hourly_rate;
    }
    
    /**
     * Override method for returning information
     * @return 
     */
    @Override
    public String toString()
    {
        return name + " was hired in " + getYear() + " and is " + age + " years old.\n" ;
    }
    
    /**
     * Calculates the pay for the hourly worker, once per worker
     */
    @Override
    public void PayWorker()
    {
        double pay = num_hours * hourly_rate;
        DecimalFormat df = new DecimalFormat("###.##");
        if (num_hours != 0)
        {
            super.PayWorker();
            System.out.println(name + " is an hourly worker and is paid $" + df.format(pay) + " this week.\n");
            num_hours = 0;
        }
        else
            System.out.println(name + " has already been paid and needs to work more hours this week.\n");
    }
}