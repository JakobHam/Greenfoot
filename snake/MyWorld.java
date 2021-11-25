import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    public MyWorld()
    {    
        super(30, 30, 15); 
        addSnake();
        //addFood();
    }

    public void addSnake()
    {
        snaketail tail1 = new snaketail();
        snaketail tail2 = new snaketail();
        tail1.setNext(tail2);
        
        addObject(new snakehead(), 16, 15);
        for (int i; i < 10)
        {}
        addObject(new snaketail(), 15, 15);
        addObject(new snaketail(), 14, 15);
        addObject(new snaketail(), 13, 15);
        addObject(new snaketail(), 12, 15);
        addObject(new snaketail(), 11, 15);
    }

    public void addFood()
    {
        addObject(new food(),Greenfoot.getRandomNumber(30),Greenfoot.getRandomNumber(30));

    }

    public void act()
    {

    }

}
