import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Warplane here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Warplane extends Actor
{
    public Warplane()
    {
        setRotation(-90);
    }

    public void act() 
    {

        if(Greenfoot.isKeyDown("a") && Greenfoot.isKeyDown("d")){}
        else{
            if(Greenfoot.isKeyDown("a")){
                setLocation(getX() - 6, getY());
            }
            if(Greenfoot.isKeyDown("d")){
                setLocation(getX() + 6, getY());
            }
        }
        fireProjectile();
    }  
    int v = 0;
    public void fireProjectile()
    {
        
        if (Greenfoot.isKeyDown("space")){
            v++;
            if (v == 10)
            {
                getWorld().addObject(new Projectile(), getX(), getY() - 60);
                v = 0;
            }
        }
    }
}
