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
        super(600, 400, 1); 

        addObject(new object2(), 300, 200);
        
        /*
        for(int i = 0; i < 10; i++)
        {
        addObject(new object1(), Greenfoot.getRandomNumber(600), Greenfoot.getRandomNumber(400));
        }
         */
    }
}
