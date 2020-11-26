import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    Counter counter = new Counter();
    //Health health = new Health();
    
    public MyWorld()
    {    
        super(600, 900, 1);
        prepare();
    }
    /**
    public Health getHealth()
    {
     return health;   
    }
    */
    public Counter getCounter()
    {
        return counter;
    }

    int v = 0;
    int x = 0;
    public void act()
    {
        v++;
        x++;
        if(v == 60){
            addEnemy();
            v = 0;
        }
        if (x == 600)
        {
            addEnemy2();
            x = 0;
        }
    }

    public void addEnemy()
    {
        addObject(new Enemy(), Greenfoot.getRandomNumber(getWidth()), 0);

    }

    public void addEnemy2()
    {
        addObject(new Enemy2(), Greenfoot.getRandomNumber(getWidth()), 0);
    }

    private void prepare()
    {
        addObject(new Warplane(), 300, 800);
        addObject(counter, 84, 20);
        //addObject(health, 500, 20);

    }
}

