import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    int score;
    public MyWorld()
    {    
        super(30, 30, 15); 
        addSnake();
        addFood();
        addcounter();

    }

    public void addSnake()
    {
        snakehead head = new snakehead();
        addObject(head, 16, 15);

        snaketail tailold = null;
        for (int i = 0; i < 5; i++)
        {
            snaketail tail = new snaketail();
            addObject(tail, 15 - i, 15);
            tail.setNext(tailold);
            tailold = tail;
            if(i == 0)
                head.setFirst(tail); 
            if(i == 4)
                head.setLast(tail);

        }
    }
    public Counter counter = new Counter();
    public void addcounter()
    {
        addObject(counter , 3, 1);
    }

    public void addFood()
    {
        addObject(new food(),Greenfoot.getRandomNumber(30),Greenfoot.getRandomNumber(30));

    }

    public void addScore()
    {

    }

}
