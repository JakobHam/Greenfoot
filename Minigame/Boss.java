import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Boss here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Boss extends Actor
{
    public void act() 
    {
        moveBoss();
        hitBoss();

    }    

    public void moveBoss()
    {
        setLocation(getX(), getY() + 1);
    }
    int timeshit1 = 0;
    public void hitBoss()
    {
        Actor projectile = getOneIntersectingObject(Projectile.class); 

        if (projectile != null) 
        {
            getWorld().removeObject(projectile);
            timeshit1++;
        }
        else 
        {
            if (timeshit1 == 20)
            {
                getWorld().removeObject(projectile);
                World world = getWorld();
                MyWorld myWorld = (MyWorld)world;
                Counter counter = myWorld.getCounter();
                counter.addScore();
                counter.addScore();
                counter.addScore();
                counter.addScore();
                counter.addScore();
                counter.addScore();
                counter.addScore();
                counter.addScore();
                counter.addScore();
                counter.addScore();
                getWorld().removeObject(this);
            }
            else {
                remove();
                Greenfoot.setWorld(new Startscreen());
            }
        }
    }

    public void remove()
    {
        if (getY() == getWorld().getHeight()-1)
        {

            if (timeshit1 > 0)
            {
                World world = getWorld();
                MyWorld myWorld = (MyWorld)world;
                Health health = myWorld.getHealth();
                health.loselife();
            }
            else {World world = getWorld();
                MyWorld myWorld = (MyWorld)world;
                Health health = myWorld.getHealth();
                health.loselife();
                health.loselife();
            }
            getWorld().removeObject(this);
            Greenfoot.setWorld(new gameover());

        }
    }  
}
