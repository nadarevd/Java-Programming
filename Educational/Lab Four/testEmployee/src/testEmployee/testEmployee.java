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

public class testEmployee {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        employee e1 = new employee("jim", 19, 2017);             // name, age, date hired
        employee e2 = new employee("jenny smith", 23, 2014); // name, age, date hired
        employee e3 = new employee("", 185, 2777);              // name, age, date hired
        
        System.out.println(e1); // displays: Jim was hired in 2017 and is 19 years old
        System.out.println(e2); // displays: Jenny Smith was hired in 2014 and is 23 years old
        System.out.println(e3); // displays: private contractor was hired in 2018 and is 18 years old
    }
    
}
