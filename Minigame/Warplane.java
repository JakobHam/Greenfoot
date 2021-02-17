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
    int speed = 8;
    public void act() 
    {
        moveWarplane();
        fireProjectile();
    }  

    public void moveWarplane()
    {
        if(Greenfoot.isKeyDown("a") && Greenfoot.isKeyDown("d")){}
        else{
            if(Greenfoot.isKeyDown("a")){
                setLocation(getX() - speed, getY());
            }
            if(Greenfoot.isKeyDown("d")){
                setLocation(getX() + speed, getY());
            }
        }

    }
    int v = 0;
    int powerupvariable = 10;
    public void fireProjectile()
    {

        if (Greenfoot.isKeyDown("space")){
            v++;
            if (v == powerupvariable)
            {
                getWorld().addObject(new Projectile(), getX(), getY() - 60);
                v = 0;
            }
        }
    }
}
