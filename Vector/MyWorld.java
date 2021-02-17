import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    

        super(600, 400, 1); 
        Vector v1 = new Vector(5, 10);
        Vector v2 = new Vector(2, 4);
        Vector v3 = new Vector(6, 8);

        v1.add(v3);
        Vector.add(v1, v2);

        System.out.println("Liste der Vektoren");
        System.out.println("Addition:"+ add(v1));
        System.out.println("Subtraction:"+ sub(v2));
        System.out.println("multiplikation:"+ mult(v1 , 10));
        System.out.println("Skalarprodukt:"+ skalar(v1, v2));
        
    }
}
