
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Health extends Actor
{
    int lifebarh = 20;
    int lifebarw = 150;
    int lifes = 3;
    int removepixels = (int) lifebarw / lifes;
    public Health()
    {
        health();
    }

    public void act() 
    {
        health();
        gameover();
    }   

    public void health()
    {   
        GreenfootImage myImage = new GreenfootImage(lifebarw, lifebarh);
        myImage.setColor(Color.RED);
        myImage.fillRect(1, 1, removepixels*lifes, lifebarh);
        this.setImage(myImage);
        //System.out.println("Test1");
    }

    public void resetlife()
    {
        lifes = 3;
    }

    public void getlife()
    {
        if (lifes != 3)
        {
            lifes++;
        }
    }
    int v = 0;
    public void loselife()
    {
        v++;
        if(lifes != 0)
        {
            lifes--;
        }

    }

    public void damage()
    {
        if(lifes != 0)
        {
            lifes--;
        }
    }

    public void gameover()
    {
        if(lifes == 0)
        {
            Greenfoot.setWorld(new gameover());
            Greenfoot.stop();
        }
    }
}