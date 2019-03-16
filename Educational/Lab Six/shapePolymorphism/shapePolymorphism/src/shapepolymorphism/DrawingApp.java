/*
 * This code belongs to Denis Nadarevic (104445626) and is copyrighted under his name
 * Any usage of his work for commercial use or without credit will result in legal action being taken
 * This code is meant as a learning purpose under the University of Windsor (2018).
 */
package shapepolymorphism;

import java.util.*;

/**
 *
 * @author Denis Nadarevic <nadarevd@uwindsor.ca>
 */
public class DrawingApp 
{
    public DrawingApp()
    {
        Random rand = new Random();
        Shape [] array = new Shape[10]; //array to store all shapes
        int i = 0;
        int test = 2;
        double total = 0;
        do
        {
            switch(rand.nextInt(3)) //number between 0 and 2
            {
                case 0: //new rectangle
                    array[i] = new rectangle(rand.nextInt(50)+1,rand.nextInt(50)+1);
                    array[i++].setLabel("Rectangle");
                    break;
                case 1: //new circle
                    array[i] = new circle(rand.nextInt(50)+1);
                    array[i++].setLabel("Circle");
                    break;
                case 2: //new triangle
                    array[i] = new triangle(rand.nextInt(50)+1,rand.nextInt(50)+1);
                    array[i++].setLabel("Triangle");
                    break;
                    
            }
        }while(i <= 9);
        
        for(int j = 0 ; j < 10 ; j++)
        {
            total += array[j].calculateArea();
            System.out.println(array[j].toString()); //prints information about each shape
        }
        System.out.println("Total: " + total);
    }
    
      /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        DrawingApp myShape = new DrawingApp(); //instantiate new shape array of random shapes, outputs results automatically
    }
    
}
