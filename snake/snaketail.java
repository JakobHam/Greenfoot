import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class snaketail here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class snaketail extends Actor
{
    int b;
    private int score;
    private int x; 
    private int y;

    public snaketail(int score, int x, int y)
    {
        this.score = score;
        this.x = x;
        this.y = y;
        GreenfootImage img = new GreenfootImage(15, 15); 
        img.setColor(Color.BLACK);
        img.fill();
        setImage(img);
    }
snakehead s = new snakehead();
    public void act()
    {
        timer();
        move();
        System.out.println(x);
        System.out.println(y);
        x = snakehead.getX();
        
    }

    public int timer()
    {
        b++;
        return b;
    }

    public void move()
    {

        if (b == 10 * score)
        {
            setLocation(x, y);
            b = 0;
        }
    }
}
