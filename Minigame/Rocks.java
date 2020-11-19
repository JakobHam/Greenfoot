import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rocks here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rocks extends Actor
{

    public void act() 
    {
        int x = getX();
        int y = getY();
        int i = 1;
        int speed = 2;
        while (i < 1000){
            setLocation(x, y + speed);
            i = i + 1;
        } 
        
        
    }   
}
