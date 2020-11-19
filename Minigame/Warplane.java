import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Warplane here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Warplane extends Actor
{

    public void act() 
    {
        setRotation(-90);
        int x = getX();
        int y = getY();
        if(Greenfoot.isKeyDown("a") && Greenfoot.isKeyDown("d")){}
        else{
            if(Greenfoot.isKeyDown("a")){
                setLocation(x - 4, y);
            }
            if(Greenfoot.isKeyDown("d")){
                setLocation(x + 4, y);
            }
        }
        
    }    
}
