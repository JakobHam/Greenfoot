import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class score here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Count extends Actor
{
    int score;
    public Count()
    {
        setImage (new GreenfootImage("Score: " + score, 30, Color.BLACK, Color.WHITE));
    }

    public void act()
    {
        setImage (new GreenfootImage("Score: " + score, 30, Color.BLACK, Color.WHITE));
    }

    public void setScore(int score)
    {
        this.score = score; 
    }
}
