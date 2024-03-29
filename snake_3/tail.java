import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This part of the code makes up and adds to the body of the snake.
 * 
 * @author (Andrico Zacharia) 
 * @version (v1.0 26/01/2018)
 */
public class tail extends Actor
{
   private int age = 0; //Allows program to track age of snake piece.
   private int lifeSpan; //Puts a limit on how big the snake can get.
   
   public tail(int lifeSpan) // This function simply generates another black block to be used as a tail.
   {
       GreenfootImage img = new GreenfootImage(20,20); //Create a new image with 20x20 as the size.
       img.setColor(Color.GRAY); //set tail colour
       img.fill(); //Fill the block.
       setImage(img); //Save our changes.
       
       this.lifeSpan = lifeSpan; //Refers to this objects property.
   }
   
   
    public void act() 
    {
        if(age == lifeSpan){ //Check if lifespan is reached.
            getWorld().removeObject(this); //Remove this object from the world.
        }
        age++; //Add to age once tail is added on.
      
    }    
    
}
