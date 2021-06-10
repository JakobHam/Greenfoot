import greenfoot.*; 
public class IntMover extends Actor
{
    int x;
    int y;
    int speedx = 10; 
    int speedy = 10;
    int speed = 10;
    int degree = 5;
    public IntMover()
    {
        speedx = (int) (speed * Math.cos(Math.toRadians(degree)));
        speedy = (int) (speed *  Math.sin(Math.toRadians(degree)));

    }

    public void act() 
    {
        x = speedx + x;
        y = speedy + y;
        setLocation(x, y);
    } 

    protected void addedToWorld(World world)
    {
        x = getX();
        y = getY();
    }

}
