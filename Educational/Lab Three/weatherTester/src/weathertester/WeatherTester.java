/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weathertester;


/**
* 
* @author Denis Nadarevic <nadarevd@uwindsor.ca>
*/
public class WeatherTester 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        //instantiate two objects
        weather w1 = new weather();
        weather w2 = new weather(-25, 7);
        
        //print the weather w1,w2
        //System.out.println(w1);
        System.out.println(w2);
        
        //change temp and speed in first object
        w1.setTemp(52);
        w1.setSpeed(2);
        
        //print new weather w1
        System.out.println(w1);
        
        System.out.println("it feels like " + w1.getWindChill() + "\nSeverity: " + w1.isSevere()); 
        System.out.println("it feels like " + w2.getWindChill() + "\nSeverity: " + w2.isSevere()); 
    }
}


/*
Question. What would be the result of the following instantiation if we remove the no argument
constructor?

Answer: 
java will provide a default constructor only if the class doesn't 
already have a constructor. It initialies each variable to default values
(int = 0, float = 0.0f, boolean = false, etc...). In this program, if u remove
only the default constructor, it will not properly work.


*/