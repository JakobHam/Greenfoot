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
        // höhe und breite definieren
        int w = 5; 
        int h = 5;

        // schleife mit h wiederhohlungen
        // in der schleife X h mal ausgeben
        // x ist (6 mal X ausgeben)
        for(int j = 0; j < h; j++)
        {
            for(int i = 0; i < w; i++) 
            {
                System.out.print("X");
            }
            System.out.println();
        }
        //statt x Koordinaten
        //jedes mal mehr X
    }
}
