package lab1;
import java.util.*;



/**
 *
 * @author Denis Nadarevic
 * Student ID: 104445626
 * Date Completed: September 18th, 2018
 * 
 */
public class myClass {

    
    /**
     * Calculates a number using the formula in the function
     * @param x user's first number
     * @param y user's second number
     * @return newAnswer, which is the calculated number
     */
    public static double calc(int x, int y)
    {
        double answer = Math.sqrt(Math.PI * Math.pow(y, 2)) /  (2 * x);
        
        double newAnswer = Math.round(answer * 100.00) / 100.00; //rounds number to two decimal places
        
        return newAnswer;
    }
    
    /** 
    * Properly capitalizes a word, making the first letter uppercase
    * @param scWord user's string called scWord
    * @return properly capitalized version of the input
    */
    public static String wordCap(String scWord)
    {
        String wordOne = scWord.substring(0,1); //gets the first letter of the word
        wordOne = wordOne.toUpperCase(); //uppercases the first letter
        scWord = scWord.substring(1); //this string is everything after the first letter
        scWord = scWord.toLowerCase(); //converts it into lower case
        
        wordOne = wordOne.concat(scWord); //appends the rest to the capitalized letter
        
        return wordOne; //returns the corrected word
        
    }
    
   /**
    * Checks to see if the user's keyword is found in the inputted word
    * @param strInput user's word inputted
    * @param keywordInput user's keyword inputted
    * @return returns true or false, if the keyword is in the word respectively
    * 
    */
   public static boolean findKeyWord(String strInput, String keywordInput)
    {
        return strInput.contains(keywordInput);
    }
   
    public static void main(String[] args) {
        
        //Used to get the x value for calc
        System.out.println("Please enter x:");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        
        //Used to get the y value for calc
        System.out.println("Please enter y:");
        Scanner scTwo = new Scanner(System.in);
        int j = scTwo.nextInt();
        //Prints out the final answer from calc
        System.out.println("The answer is " + calc(i,j) + ".");
        
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
        
        //Used to get the word from the user
        System.out.println("Please enter your word:");
        Scanner scWord = new Scanner(System.in);
        String input = scWord.next();
        System.out.println("Your word is: " + wordCap(input));
        
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");
        
        //Used to get the word from the user
        System.out.println("Please enter your word(s):");
        Scanner str = new Scanner(System.in);
        String strInput = str.nextLine();
        //this is for checking the keyword
        System.out.println("Please enter your keyword :");
        Scanner keyword = new Scanner(System.in);
        String keywordInput = str.next();
        
        System.out.println("Answer: " + findKeyWord(strInput, keywordInput));
    }
    
    
    
}
