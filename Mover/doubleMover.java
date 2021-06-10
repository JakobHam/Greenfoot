import greenfoot.*;  
public class doubleMover extends Actor
{
    double x = 200;
    double y = 100;
    double speedx = 10; 
    double speedy = 10;
    double speed = 10;
    double degree = 5;
    public doubleMover()
    {
        speedx = speed * Math.cos(Math.toRadians(degree));
        speedy = speed *  Math.sin(Math.toRadians(degree));

    }

    public void act() 
    {
        x = speedx + x;
        y = speedy + y;
        setLocation((int)x,(int) y);
    }     
}
