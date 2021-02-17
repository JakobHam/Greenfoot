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
        int w = 6; 
        int h = 5;
        int AnzahlAusführungen1 = 0;

        for(int i = 0; i < h; i++)
        {   
            AnzahlAusführungen1++;
            if (h < w)
            {
                for( int j = 0; j < AnzahlAusführungen1 - 1; j++) 
                {
                    System.out.print("X");
                }
                System.out.print("-");
                for(int o = 0; o < w - AnzahlAusführungen1; o++)
                {
                    System.out.print("X");
                }
            } 
            System.out.println();
        }
    }
}
