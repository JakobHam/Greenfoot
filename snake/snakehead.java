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
    private snaketail newfirst;
    private Counter counter;
    String direction="right";

    int length = 5;
    int oldlength = 5;

    int timeStuckAtEdge;
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
        eatfood();
        directions();
        biteSnake();       
    }

    public void eatfood()
    {
        if (isTouching(food.class))
        {
            length++;
            removeTouching(food.class);
            getWorld().addObject(new food(), Greenfoot.getRandomNumber(30), Greenfoot.getRandomNumber(30));
        }

    }

    public boolean isAtEdgeMovingOutward()
    {
        return ( getX() == 0 && direction == "left" ) ||
        ( getY() == getWorld().getHeight()-1 && direction == "down" )||
        ( getY() == 0 && direction == "up" ) ||
        ( getX() == getWorld().getWidth()-1 && direction == "right");
    }

    public void move()
    {
        if (isAtEdgeMovingOutward())
        {
            timeStuckAtEdge++;
            if(timeStuckAtEdge == 5)
            {
                Greenfoot.setWorld(new Loosescreen());
                timeStuckAtEdge=0;

            }
        } else {
            int a=getX();
            int b=getY();

            move(1);
            timeStuckAtEdge =0;
            if(length > oldlength)
            {
                oldlength = length;
                snaketail tail = new snaketail();
                getWorld().addObject(tail, a, b);
                first.setNext(tail);
                newfirst = tail;
                first = last;

                first = newfirst;
            }
            else
            {
                last.setLocation(a, b);
                first.setNext(last);
                first = last;
                last = last.getNext(); 
            }
        }
    }

    public void directions()
    {
        if (Greenfoot.isKeyDown("down") && direction != "up") 
        {
            turnTowards(getX(),getY() + 1 );
            direction = "down";
        }else
            if (Greenfoot.isKeyDown("up") && direction != "down")
        {   turnTowards(getX(),getY() - 1); 
            direction = "up";
        }else 
            if (Greenfoot.isKeyDown("right") && direction != "left") {
            turnTowards(getX() + 1,getY()); 
            direction = "right";
        }else 
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

    public void biteSnake()
    {
        if (isTouching(snaketail.class) == true)
        {
            Greenfoot.setWorld(new Loosescreen());
        }
    }
}
