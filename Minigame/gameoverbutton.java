import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class gameoverbutton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class gameoverbutton extends Actor
{
    /**
     * Act - do whatever the gameoverbutton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        press();
    }    
    public void press()
    {
    if (Greenfoot.mouseClicked(this))
    {
    Greenfoot.stop();
    }
    }
}
