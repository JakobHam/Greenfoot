import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Actor
{
    public Enemy()
    {
        setRotation(180);
    }

    public void act() 
    {
        moveEnemy();
        remove();
        hitEnemy();

    }    

    public void moveEnemy()
    {
        setLocation(getX(), getY() + 5);
    }
    public void remove()
    {
    if (getY() == 899)
        {
            getWorld().removeObject(this);
        }
    }
    public void hitEnemy()
    {
        Actor projectile = getOneIntersectingObject(Projectile.class); 
        if (projectile != null) 
        {
            getWorld().removeObject(projectile);
            getWorld().removeObject(this);
            
            World world = getWorld();
            MyWorld myWorld = (MyWorld)world;
            Counter counter = myWorld.getCounter();
            counter.addScore();
        }
        
    }

}
