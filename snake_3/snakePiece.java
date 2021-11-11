
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This is the first piece of the snake or the 'head'.
 * 
 * @author (Andrico Zacharia) 
 * @version (v1.0 26/01/2018)
 */
public class snakePiece extends Actor
{
    //Create private constants for direction, speed and counter variable.
    //These are private and final as they will not change in value and symbolise direction of travel.
    private final int RIGHT = 0;
    private final int DOWN = 90;
    private final int LEFT = 180;
    private final int UP = 270;
    
    private int SPEED = 7; //The higher the speed the slower the game works.
    private int counter = 0; //Start counter on 0, it is not final as it can change value.
    private int speedDivision = 0;
    
    private int foodConsumed = 0; //Tells us how much food was eaten.
    
    public snakePiece() 
    {
       GreenfootImage img = new GreenfootImage(20,20); //Create a new image with 20x20 as the size.
       img.setColor(Color.LIGHT_GRAY); //Set colour
       img.fill(); //Fill the block.
       setImage(img); //Save our changes.
       setRotation(Greenfoot.getRandomNumber(4)*90); //This sets the rotation for the piece to move in.
       //Possible answers are between 0 and 3 which means it will be either 0, 90. 180 or 270 which are our directions.
    }    
    
    /** This is our act method, and pressing 'Act' or 'Run' will cause the program to execute this code.*/
    public void act()
    {
        moveAround(); //Calls the moveAround function.
        //If the snakePiece is touch the food then the following will be true and run the code which hides the food.
        if(isTouching(Food.class)) {
            removeTouching(Food.class); //Set to false again as a reset.
            foodConsumed++; //Add that 1 piece of food is eaten to counter.
            snakeGameWorld world = (snakeGameWorld)getWorld(); //Set location of function.
            world.addFood(); //Convert world into subclass using casting as it is present in the world class.
            Greenfoot.playSound("bite.mp3"); //Play chomp sound when food is eaten.
            speedDivision++;  

        }
        
       if(speedDivision == 5) {
            speedDivision = 0;
            SPEED = SPEED - 1;
            Greenfoot.playSound("speedup.mp3");
          }
        
       if (getX() < 0) {
           setLocation(getWorld().getWidth(), getY());
           Greenfoot.playSound("jump.mp3");
        }
        
       if (getX() > getWorld().getWidth()) {
           setLocation(0, getY());
           Greenfoot.playSound("jump.mp3");
        }
        
       if (getY() < 0 ){
           setLocation(getX(), getWorld().getHeight());
           Greenfoot.playSound("jump.mp3");
        }
        
       if (getY() > getWorld(). getHeight()) {
           setLocation(getX(), 0);
           Greenfoot.playSound("jump.mp3");
        }
        
        //Stop game if edge is touched.
       /** if(touchingEdge()){ //Check on each move if the edge is being touched.
            snakeGameWorld world = (snakeGameWorld)getWorld(); //Set location of function.
            world.gameOver();//Call gameOver function.
            Greenfoot.stop(); //If it is touching an edge Greenfoot stops the game.
        }
       **/
       //Check if is snake if touching its tail.
       if(isTouching(tail.class)){
       Greenfoot.setWorld(new gameOver());
       Greenfoot.playSound("gameOver.mp3"); //Play game over sound when user dies.
        }
    }
    
    //Function to check if facing edge of the world up, down, left or right.
    private boolean touchingEdge()
    {
        switch(getRotation()) {
            case UP: return getY()==0;
            case RIGHT: return getX()==getWorld().getWidth()-1;
            case DOWN: return getY()==getWorld().getHeight()-1;
            case LEFT: return getX()==0;
        }
        return false;
    }
    
    public void moveAround()
    {
        counter ++; //Add one to counter.

        if(counter==SPEED) {
            getWorld().addObject(new tail(foodConsumed*SPEED), getX(), getY()); //Add a tail to the world in position of snakehead.
            move(1);
            counter = 0;
    } //This allows the snake to always keep moving and only change direction when arrow keys are pressed.
   
    {
        if( Greenfoot.isKeyDown("up") ) {
            setRotation(UP);
        }
    }
    
    {
        if( Greenfoot.isKeyDown("right") ) {
            setRotation(RIGHT);
        }
    }
    
    {
        if( Greenfoot.isKeyDown("down") ) {
            setRotation(DOWN);
        }
    }
    
        {
        if( Greenfoot.isKeyDown("left") ) {
            setRotation(LEFT);
        }
    }
   
    }
}
