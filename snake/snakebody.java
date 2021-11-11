import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class snakebody here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class snakebody extends Actor
{
    int x;
    int score;
    public snakebody()
    {
        GreenfootImage img = new GreenfootImage(15, 15); 
        img.setColor(Color.BLACK);
        img.fill();
        setImage(img);
        setRotation(Greenfoot.getRandomNumber(4)*90);
    }

    public void act()
    {
        x++;
        if (x == 10)
        {
            move(1);
            getWorld().addObject(new snaketail() , getX(), getY());

            x = 0;
        }
        if (Greenfoot.isKeyDown("down")) turnTowards(getX(),getY() + 1);
        if (Greenfoot.isKeyDown("up")) turnTowards(getX(),getY() - 1);
        if (Greenfoot.isKeyDown("right")) turnTowards(getX() + 1,getY());
        if (Greenfoot.isKeyDown("left")) turnTowards(getX() - 1,getY());
        if (isTouching(food.class) == true)
        {
            score++; 
            System.out.println(score);
        }
    }
}
