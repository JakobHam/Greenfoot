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

        addObject(new Warplane(), 200, 800);

    }
    int i = 1;
    public void act(){
        if(i < 2){
            
            addObject(new Rocks(),Greenfoot.getRandomNumber(1000),0);
            
        }

    }
}

