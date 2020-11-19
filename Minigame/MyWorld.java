import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.

     */
    public MyWorld()
    {    
        super(600, 900, 1);
        prepare();
    }
    int v = 0;
    public void act()
    {
        v++;
        if(v>60){
        addEnemy();
        v = 0;
    }
    }
    public void addEnemy()
    {
    addObject(new Enemy(), Greenfoot.getRandomNumber(600), 0);
    
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        addObject(new Warplane(), 300, 800);
    }
}

