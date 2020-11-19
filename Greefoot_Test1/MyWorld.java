import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    public MyWorld()
    {    
        // Create a new world with 10000x10000 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        /** 
         * addObject(new Bee (), getWidth()/2, getHeight()/2
        );
         */
        addObject(new Ant (), getWidth()/2, getHeight()/2
        );
    }
}

