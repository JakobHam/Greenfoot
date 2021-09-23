import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class object1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class object1 extends Actor
{
    int x = 0;
    public object1()
    {
        turn(Greenfoot.getRandomNumber(360));
    }

    public void act() 
    {
        move (1);
        x++;
        if (x == 60)
        {
            if (Greenfoot.getRandomNumber(2) == 1)
            {
                turn(90);
            }else
            {
                turn(-90);
            }
            x = 0;
        }

    }    
}
