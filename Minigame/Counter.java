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
        boss();
    }

    public void addScore()
    {
        score++;
    }
    int n = 0;
    public void boss()
    {
        if (score == 10)
        {
            
            if(n == 0)
            {
                getWorld().addObject(new Boss(), 300, 0);
                n++;
            }
           
        }
        
    }
}
