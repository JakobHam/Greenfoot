/**
 
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Health extends Actor
{
    int lifes = 0;
    public Health()
    {
    setImage(new GreenfootImage("Lifes:" + lifes, 60, Color.WHITE, Color.BLACK));
    }
    public void act() 
    {
        
    }   
    public void resetlife()
    {
        lifes = 3;
    }
    public void removelife()
    {
        if(lifes != 0)
        {
            lifes = lifes - 1;
        }
    }
}
*/