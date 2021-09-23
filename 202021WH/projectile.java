import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class projectile here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class projectile extends Actor
{
    public projectile(int Rotation)
    {
    setRotation(Rotation);
    }
    public void act() 
    {
        move(10);
        
        //getWorld().removeObject(this);
    }    
}
