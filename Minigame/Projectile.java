import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Projektil here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Projectile extends Actor
{
    /**
     * Act - do whatever the Projektil wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Projectile()
    {
    setRotation(-90);
    }
    public void act() 
    {
        move(10);
        hit();
        remove();
    }    
    public void remove()
    {
    if (getY() == 0)
    {
    getWorld().removeObject(this);
    }
    }
    public void hit()
    {
    if(isTouching(Enemy.class))
    {
    removeTouching(Enemy.class);
    }
    }
}
