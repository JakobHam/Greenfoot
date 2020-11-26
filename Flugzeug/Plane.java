import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Plane here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Plane extends Actor
{
    int speed = 5;
    public Plane()
    {
        setRotation(270);
    }

    public void act() 
    {
        if (Greenfoot.isKeyDown("W"))
        {
            move(speed);
        }
        if (Greenfoot.isKeyDown("S"))
        {
            move(-speed);
        }
        if (Greenfoot.isKeyDown("A"))
        {
        turn(2);
        }
        if (Greenfoot.isKeyDown("D"))
        {
        turn(-2);
        }
    }    
}
