import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ant here.
 * Ant is a Test object. I learned mi first commands in Java with it.
 * @author (Jakob Hammerer) 
 * @version (#1)
 */
public class Ant extends Actor
{
    public void act() 
    {   
        if (Greenfoot.isKeyDown("w")){
            move(5);
        }
        if (Greenfoot.isKeyDown("s")){
            move(-5);
            }    
        if (Greenfoot.isKeyDown("d")){
            turn(5);
            move(1);
        } 
        if (Greenfoot.isKeyDown("a")){
            turn(-5);
            move(1);
        }
    }
}
