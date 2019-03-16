package weathertester;
import static java.lang.Math.pow;

/**
 * 
 * @author Denis Nadarevic <nadarevd@uwindsor.ca>
 */
public class weather 
{
    private int tempF;          //Used to store the temperature in Fahrenheit
    private int windSpeed;      //Used to store the speed of the wind
    private double windChill;      //Used to store the chilliness of the wind (?)
    private boolean severe;     //Used to store a boolean value for severity
    
    
    /**
     * Default constructor
     */
    public weather()
    {
        tempF = 32;
        windSpeed = 1;
        calcChill();
        calcSevere();
    }
    
    /**
     * Overloaded constructor: takes in two attributes
     * @param tempF
     * @param windSpeed 
     */
    public weather(int tempF, int windSpeed)
    {
        //this(); //invokes the default constructor
        setTemp(tempF);
        setSpeed(windSpeed);
    }
    
    /**
     * access method to set value to tempF
     * @param temp 
     */
    public void setTemp(int temp)
    {
        if ((temp > -50) && (temp < 150))
        {
            this.tempF = temp;
            calcChill();
            calcSevere();
           
        }
    }
    
    /**
     * access method to set value to windSpeed
     * @param speed 
     */
    public void setSpeed(int speed)
    {
        if (speed > 0)
        {
            this.windSpeed = speed;
            calcChill();
            calcSevere();
        }
    }
    
    /**
     * returns the object's tempF
     * @return int
     */
    public int getTemp()
    {
        return tempF;
    }
    
    /**
     * returns the object's windSpeed
     * @return int
     */
    public int getSpeed()
    {
        return windSpeed;
    }
    
    /**
     * returns the object's windChill
     * @return double
     */
    public double getWindChill()
    {
        return windChill;
    }
    
    /**
     * returns severity of the weather
     * @return boolean
     */
    public boolean isSevere()
    {
        return severe;
    }
     
    /**
     * Calculates the wind chill
     * No params, no return
     */
    private void calcChill()
    {
        windChill = (35.74 + (0.6215*tempF) - (35.75*pow(windSpeed, 0.16)) + (0.4275*tempF*pow(windSpeed, 0.16)));
        double roundOff = (double) Math.round(windChill*100)/100;
        windChill = roundOff;
    }
    
    
    /**
     * Determines if severe
     * no params, no return
     */
    private void calcSevere()
    {
        severe = (windChill < -15);
    }
    
    
    /**
     * returns the weather formatted properly
     * @return String
     */
    public String toString()
    {
        return "Current Temperature is " + tempF + "'F. Feels like " + windChill + "'F and wind speed is " + windSpeed + "mph."; 
    }
}
