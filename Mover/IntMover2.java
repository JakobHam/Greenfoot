import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class IntMover2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class IntMover2 extends Actor
{
    int x;
    int y;
    int speedx = 10; 
    int speedy = 10;
    int speed = 10;
    int degree = 270;

    public void act() 
    {

        if(Greenfoot.isKeyDown("a") && Greenfoot.isKeyDown("d")){}
        else{
            if(Greenfoot.isKeyDown("a")){
                degree = degree + 1;
            }
            if(Greenfoot.isKeyDown("d")){
                degree = degree - 1;
            }
        }

        speedx = (int) (speed * Math.cos(Math.toRadians(degree)));
        speedy = (int) (speed *  Math.sin(Math.toRadians(degree)));
        x = speedx + x;
        y = speedy + y;
        setLocation(x, y);

    }    
    protected void addedToWorld(World world)
    {
        x = getX();
        y = getY();
    }
}
