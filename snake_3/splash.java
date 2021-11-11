import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class splash here.
 * 
 * @Andrico Zacharia 
 * @v1.0 26 January 2018
 */
public class splash extends World
{

    /**
     * Constructor for objects of class gameOver.
     * 
     */
    
    public splash()
    {    
        super(30, 30, 20);
        GreenfootImage bg = new GreenfootImage("splash.png");
        bg.scale(600, 600);
        setBackground(bg);
        
    }
    
      public void act()
    {
           if( Greenfoot.isKeyDown("up") ) {
            gameWorld();
        }
        
        
           if( Greenfoot.isKeyDown("down") ) {
            gameWorld();
        }
        
            if( Greenfoot.isKeyDown("left") ) {
            gameWorld();
        }
        
            if( Greenfoot.isKeyDown("right") ) {
            gameWorld();
        }
        
        //Starts the game for us.
       Greenfoot.start();
    }
    
    public void gameWorld(){
    Greenfoot.setWorld(new snakeGameWorld()); 
    Greenfoot.playSound("start.mp3");
    }
    
}