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

        hitEnemy();

    }    

    public void moveEnemy()
    {
        setLocation(getX(), getY() + 5);
    }
    public void hitEnemy()
    {
        Actor projectile = getOneIntersectingObject(Projectile.class); 
        if (projectile != null) 
        {
            getWorld().removeObject(projectile);
            World world = getWorld();
            MyWorld myWorld = (MyWorld)world;
            Counter counter = myWorld.getCounter();
            counter.addScore();
            
            getWorld().removeObject(this);
        }
        else if (getY() == getWorld().getHeight()-1)
        {
        getWorld().removeObject(this);
        Greenfoot.setWorld(new gameover());
        }
        

    }

}
