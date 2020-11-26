import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class MyWorld extends World
{
    int v = 0;
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 800, 1); 
        prepare();
    }

    public void act()
    {
        v++;
        if (v == 200)
        {
            addFood();
            v = 0;
        }

    }

    public void addFood()
    {
        addObject(new food(), Greenfoot.getRandomNumber(getWidth()), Greenfoot.getRandomNumber(getHeight()));
    }

    private void prepare()
    {
        Plane plane = new Plane();
        addObject(plane,560,383);
        plane.setLocation(596,358);
    }
}
