import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Poison here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Poison extends Actor
{
    /**
     * Act - do whatever the Poison wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move();
        intersecting();
    }    

    public void move()
    {
        setLocation(getX(), getY() + 5);

    }

    public void intersecting()
    {
        Actor projectile = getOneIntersectingObject(Projectile.class);
        if (projectile != null)
        {
            World world = getWorld();
            MyWorld myWorld = (MyWorld)world;
            Health health = myWorld.getHealth();
            health.damage();
            getWorld().removeObject(this);
        }
    }
}
