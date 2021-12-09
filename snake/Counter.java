import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class score here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Counter extends Actor
{
    int score;
    public Counter()
    {
        setImage (new GreenfootImage("Score: " + score, 30, Color.BLACK, Color.WHITE));
    }

    public void act()
    {
        setImage (new GreenfootImage("Score: " + score, 30, Color.BLACK, Color.WHITE));
    }

    public void addScore()
    {
        score++;
    }
}
