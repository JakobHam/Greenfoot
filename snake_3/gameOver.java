import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class gameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class gameOver extends World
{

    /**
     * Constructor for objects of class gameOver.
     * 
     */
    public gameOver()
    {    
        super(30, 30, 20);
        GreenfootImage bg = new GreenfootImage("gameover.png");
        bg.scale(600, 600);
        setBackground(bg);
    }
}
