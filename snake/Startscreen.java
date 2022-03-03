import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Startscreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Startscreen extends World
{

    public Startscreen()
    {    
        super(450, 450, 1); 
        
        addObject(new Text(), 225, 225);
        Greenfoot.setSpeed(35);
        Greenfoot.start();
    }

    public void act()
    {
        if (Greenfoot.isKeyDown("space") == true)
            Greenfoot.setWorld(new MyWorld());
    }
}
