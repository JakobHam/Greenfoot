import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class wall here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class wall extends Actor
{
    public wall() //Constructor.
    {
       GreenfootImage img = new GreenfootImage(20,20); //Create a new image with 20x20 as the size.
       img.setColor(Color.RED); //Set image colour to green using Greenfoot colour class.
       img.fill(); //Fill the block with this colour.
       setImage(img); //Save our changes.
    }    
}