import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class object2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class object2 extends Actor
{   public int Rotation;
    int speed = 5;
    boolean a = true;
    public void act() 
    {
        if (Greenfoot.isKeyDown("W"))
        {
            move(speed);
        }
        if (Greenfoot.isKeyDown("S"))
        {
            move(-speed);
        }
        if (Greenfoot.isKeyDown("A"))
        {
            turn(4);
        }
        if (Greenfoot.isKeyDown("D"))
        {
            turn(-4);
        } 
        if (Greenfoot.isKeyDown("space") & a == true)
        {
            getWorld().addObject(new projectile(Rotation), getX() + 10, getY());
            a=false;
        }else{
            if (!Greenfoot.isKeyDown("space")){
                a=true;
            }
        }
        Rotation = getRotation();
    }    
}
