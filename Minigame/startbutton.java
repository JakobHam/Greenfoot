import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class startbutton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class startbutton extends Actor
{
    /**
     * Act - do whatever the startbutton wants to do. This method is called whenever
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
            Greenfoot.setWorld(new MyWorld());
            /**
            World world1 = getWorld();
            MyWorld myWorld1 = (MyWorld)world1;
            Health health = myWorld1.getHealth();
            health.resetlife();
            */
        }
    }
}
