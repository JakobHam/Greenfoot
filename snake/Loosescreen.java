import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Loosescreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Loosescreen extends World
{

    public Loosescreen()
    {    
       
        super(450, 450, 1); 
        addObject(new Text2(), 225, 225);
        addObject(new Text1(), 225, 185);
    }
    public void act()
    {
        if (Greenfoot.isKeyDown("space") == true)
            Greenfoot.setWorld(new MyWorld());
    }
}
