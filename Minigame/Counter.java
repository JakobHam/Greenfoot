import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Score here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Counter extends Actor
{
    public int score = 0;
    
    public Counter()
    {
        setImage(new GreenfootImage("Score:" + score, 60, Color.WHITE, Color.BLACK));
    }

    public void act() 
    {
        setImage(new GreenfootImage("Score:" + this.score, 60, Color.WHITE, Color.BLACK));
        //System.out.println(score);
    }

    public void addScore()
    {
        score = score + 1;
        this.score = score;
    }
}
