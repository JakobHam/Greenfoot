import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        // counter erschaffen 
        int counter = 0;
        
        //schliefe 100 mal ausführen 
        for(int i = 0; i <= 100; i++){
            //und bei jedem mal um 1 erhöhen
            counter++;
            // überprüfen ob counter durch 3 oder 5 teilbar ist
            if(counter % 3  != 0 && counter % 5 != 0)
            // wenn nicht dann in Konsole anzeigen
            {
                System.out.println(counter);
            }
            // wenn nicht dann bei 
            else{
                // teilbar durch 3 und 5 fizzbuzz in Konsole 
                if(counter % 3 == 0 && counter % 5 == 0)
                {
                    System.out.println("FizzBuzz");
                }
                // teilbar durch 3 fizz in Konsole
                else if(counter % 3 == 0)
                {
                    System.out.println("Fizz");
                }
                // teilbar durch 5 buzz in Konsole
                else if(counter % 5 == 0)
                {
                    System.out.println("Buzz");
                }
            }

        }
    }
}
