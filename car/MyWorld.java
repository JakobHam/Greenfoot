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
     * 
     */
    public MyWorld()
    {   
        super(600, 400, 1);
    }

    int f = 0;
    boolean sDown = false;

    public void act() 
    {

        if(Greenfoot.isKeyDown("S")){
            if(!sDown){
                int x = Greenfoot.getRandomNumber(getWidth());
                int y = Greenfoot.getRandomNumber(getHeight());
                addObject(new projektil(), x , y );
            }
            sDown = true;
        }
        else{sDown = false;}
    }
}
