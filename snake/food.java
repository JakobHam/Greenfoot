import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class food here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class food extends Actor
{
    
    public food()
    {
        GreenfootImage img = new GreenfootImage(15, 15); 
        img.setColor(Color.GREEN);
        img.fill();
        setImage(img);

        
    }

int score; 
    public void act()
    {
        if (isTouching(snakehead.class) == true)
        {
            score++;
            World world = getWorld();
            MyWorld myWorld = (MyWorld)world;
            Counter counter = myWorld.getCounter();
            counter.addScore();
            getWorld().addObject(new food(), Greenfoot.getRandomNumber(30), Greenfoot.getRandomNumber(30));
            getWorld().removeObject(this);
            
        }
    }
}
