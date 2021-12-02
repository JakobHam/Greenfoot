/*
* _   _   _   _   _   _   _   _     _   _   _   _   _     _   _   _   _  
 / \ / \ / \ / \ / \ / \ / \ / \   / \ / \ / \ / \ / \   / \ / \ / \ / \ 
( A | n | d | r | i | c | o | s ) ( S | n | a | k | e ) ( G | a | m | e )
 \_/ \_/ \_/ \_/ \_/ \_/ \_/ \_/   \_/ \_/ \_/ \_/ \_/   \_/ \_/ \_/ \_/ 
*
*/
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * This game is a take on the traditional Snake game found on old Nokia phones.
 * To Play use the arrow keys on the keyboard.
 * 
 * @author (Andrico Zacharia) 
 * @version (v1.0 26/01/2018)
 */
public class snakeGameWorld extends World
{
    /**
     * Constructor for objects of class snakeGameWorld.
     * 
     */
    public snakeGameWorld()
    {   
        super(30, 30, 20, false); // Create a new world with 30x30 cells with a cell size of 20x20 pixels.
        GreenfootImage img = new GreenfootImage(20,20); //This creates the 20x20 block.
        img.setColor(Color.LIGHT_GRAY); //Set colour of grid lines.
        img.drawRect(0,0,20,20); //This tells greenfoot what shape to use.
        setBackground(img); //This line sets background image in code.
        
        /**The next lines of code determine the position of blocks in the world and then adds a new
        piece of the snake to the world. */
        int x = Greenfoot.getRandomNumber(getWidth()); //Generate random width.
        int y = Greenfoot.getRandomNumber(getHeight()); //Generate random height.
        addObject(new snakePiece(), x, y); //Place snakePiece in random spot.
        addFood(); //Calls the addFood function.
      //Greenfoot.playSound("start.mp3"); This music is terrible so I will replace it later.
    }
    
    //Below is the function used to randomly place food items for the snake in the world.
    public void addFood()
    {
        int x = Greenfoot.getRandomNumber(28); //Generate random width.
        int y = Greenfoot.getRandomNumber(28); //Generate random height.
        addObject(new Food(), x+1, y+1); //Place food in random spot.
    }
   
    
    
    public void gameOver()
    {
        Greenfoot.setWorld(new gameOver());
        Greenfoot.playSound("gameOver.mp3"); //Play game over sound when user dies.
        
    }

      public void splash()
    {
        Greenfoot.setWorld(new splash()); 
    }  
}
