import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is where the food that the snake eats is made.
 * 
 * @author (Andrico Zacharia) 
 * @version (v1.0 26/01/2018)
 */
public class Food extends Actor
{
    public Food() //Constructor.
    {
       GreenfootImage img = new GreenfootImage(20,20); //Create a new image with 20x20 as the size.
       img.setColor(Color.GREEN); //Set image colour to green using Greenfoot colour class.
       img.fill(); //Fill the block with this colour.
       setImage(img); //Save our changes.
    }    
}
