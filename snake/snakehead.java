import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class snakebody here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class snakehead extends Actor
{
    private snaketail last;
    private snaketail first;

    public snakehead()
    {
        GreenfootImage img = new GreenfootImage(15, 15); 
        img.setColor(Color.BLACK);
        img.fill();
        setImage(img);

    }

    public void act()
    {

        move();
        directions();
        eatFood();
    }
    int x;
    public void move()
    {
        
        x++;
        if (x == 10)
        {
            

            
            last.setLocation(getX(), getY());
            first.setNext(last);
            first = last;
            last = last.getNext(); 
            
            move(1);
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

    public void setLast (snaketail last)
    {
        this.last = last;
    }

    public void setFirst (snaketail first)
    {
        this.first = first;
    }

    public void eatFood()
    {

    }
}
