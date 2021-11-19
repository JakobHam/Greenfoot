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
        addSnakebody();
        addFood();
    }

    public void addSnakebody()
    {
        addObject(new snakehead(), 15, 15);
        
    }

    public void addFood()
    {
        addObject(new food(),Greenfoot.getRandomNumber(30),Greenfoot.getRandomNumber(30));

    }

    public void act()
    {
    }

}
