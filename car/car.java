
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * @author Jakob 
 * @version 1
 */
public class car extends Actor
{
    int speed = 1;
    int x1=250;
    int x2=x1+100;
    int a=1;
    int bx=598;
    int by=398;
    public void act() 
    {
        int x=getX();
        int y=getY();
        if (x < x1 || x > x2) {
            speed=1;
        } else {
         speed = 5;
        }
        if (Greenfoot.isKeyDown("w")){
            move(speed);
        }
        if (Greenfoot.isKeyDown("s")){
            move(-2);
        }
        if (Greenfoot.isKeyDown("a")){
            turn(-2);
        }
        if (Greenfoot.isKeyDown("d")){
            turn(2);
        }
        if (x > bx) {
        setLocation (a, y);
        }
        if (x < a) {
        setLocation (bx, y);
        }
        if (y > by){
        setLocation (x, a);
        }
        if (y<a) {
        setLocation (x, by);
        }
    } 
}
