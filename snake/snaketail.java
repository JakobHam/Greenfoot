import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class snaketail here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class snaketail extends Actor
{
    private snaketail next;
    public snaketail()
    {    
        GreenfootImage img = new GreenfootImage(15, 15); 
        img.setColor(Color.RED);
        img.fill();
        setImage(img);
    }
    
    public snaketail getNext()
    {
        return next;
    }
    
    public void setNext(snaketail next)
    {
        this.next =next;
    }
    
}
