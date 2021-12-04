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
    String direction;
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
        //eatFood();
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
        if (Greenfoot.isKeyDown("down") && direction != "up") 
        {
            turnTowards(getX(),getY() + 1 );
            direction = "down";
        }
        if (Greenfoot.isKeyDown("up") && direction != "down")
        {   turnTowards(getX(),getY() - 1); 
            direction = "up";
        }
        if (Greenfoot.isKeyDown("right") && direction != "left") {
            turnTowards(getX() + 1,getY()); 
            direction = "right";
        }
        if (Greenfoot.isKeyDown("left") && direction != "right") {
            turnTowards(getX() - 1,getY()); 
            direction = "left";
        }
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
        if (isTouching(food.class) == true)
        {
            
        }
    }
}
