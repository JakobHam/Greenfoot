import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy2 extends Actor
{
    /**
     * Act - do whatever the Enemy2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        moveEnemy();
        hitEnemy();
        
    }    

    public void moveEnemy()
    {
        setLocation(getX(), getY() + 3);
    }
    int timeshit = 0;
    public void hitEnemy()
    {
        Actor projectile = getOneIntersectingObject(Projectile.class); 

        if (projectile != null) 
        {
            getWorld().removeObject(projectile);
            timeshit++;
        }
        else 
        {
            if (timeshit == 2)
            {
                getWorld().removeObject(this);
            }
            else remove();
            
        }
    }

    public void remove()
    {
        if (getY() == 899)
        {
            getWorld().removeObject(this);
        }
    }
}
