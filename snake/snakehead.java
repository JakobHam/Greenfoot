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
    String direction;

    int length;
    int oldlength;

    int t;
    int a;
    int b;
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

        biteSnake();
        hitWall();
        eatfood();
    }

    public void move()
    {

        t++;

        if (t == 10 )
        {
            if (isAtEdge() == true)
            {
            
            }else
            {

                a = getX();
                b = getY();
                move(1);

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
                t = 0;
            }
        }

    }

    public void eatfood()
    {
        if (isTouching(food.class) == true)
        {
            length ++;
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

    public void biteSnake()
    {
        if (isTouching(snaketail.class) == true)
        {
            Greenfoot.setWorld(new Loosescreen());
        }
    }
    int time = 300;
    public void hitWall()
    {


    }

}
