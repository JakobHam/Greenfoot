import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ant here.
 * Ant is a Test object. I learned mi first commands in Java with it.
 * @author (Jakob Hammerer) 
 * @version (#1)
 */
public class Ant extends Actor
{   
    int speed = 1;
    int tspeed = 5;
    public void act() 
    {   
        move (speed);
        if (Greenfoot.isKeyDown("w")){
            speed = speed + 1;
        }
        if (Greenfoot.isKeyDown("s")){
            speed = speed - 1;
            }    
        if (speed < 0) {
        speed = speed + 1;
    }
            
        if (Greenfoot.isKeyDown("d")){
            turn(tspeed);
        } 
        if (Greenfoot.isKeyDown("a")){
            turn(- tspeed);
        }
    }
}
