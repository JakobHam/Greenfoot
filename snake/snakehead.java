import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class snakebody here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class snakehead extends Actor
{
    int x;
    int score;
    int numberofbodies;
    int a;
    int b;
    public snakehead()
    {
        GreenfootImage img = new GreenfootImage(15, 15); 
        img.setColor(Color.BLACK);
        img.fill();
        setImage(img);
        setRotation(Greenfoot.getRandomNumber(4)*90);
    }

    public void act()
    {
        timer();
        move();
        directions();
        eatFood();
        getLocation();
    }

    public int timer()
    {
        x++;
        return x;
    }

    public void move()
    {
        snaketail s = new snaketail(score, a, b);
        if (x == 10)
        {
            move(1);
            if (score != numberofbodies)
            {
                getWorld().addObject(s , getX(), getY());

                numberofbodies++;
            }

            x = 0;
        }
    }

    public void directions()
    {
        if (Greenfoot.isKeyDown("down")) turnTowards(getX(),getY() + 1);
        if (Greenfoot.isKeyDown("up")) turnTowards(getX(),getY() - 1);
        if (Greenfoot.isKeyDown("right")) turnTowards(getX() + 1,getY());
        if (Greenfoot.isKeyDown("left")) turnTowards(getX() - 1,getY());
    }

    public void eatFood()
    {
        if (isTouching(food.class) == true)
        {
            score++; 
            //System.out.println(score);
            getWorld().addObject(new food() ,Greenfoot.getRandomNumber(30), Greenfoot.getRandomNumber(30));
        }
    }

    public void getLocation()
    {
        a = getX();
        b = getY();
    }

}
