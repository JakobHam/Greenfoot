import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class extralife here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class extralife extends Actor
{
    /**
     * Act - do whatever the extralife wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation(getX(), getY() + 3);
        intesecting();

    }

    public void intesecting()
    {
        Actor projectile = getOneIntersectingObject(Projectile.class); 
        if (projectile != null) 
        {
            World world = getWorld();
            MyWorld myWorld = (MyWorld)world;
            Health health = myWorld.getHealth();
            health.getlife();

            getWorld().removeObject(this);
        }
    }
}
