import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Aufage1: verhindere dass man mehrere Kreuze/ Kreise pro Zug setzten kann 
 * --> boolean one!!!
 */
public class MyWorld extends World
{
    String x;
    String Playericon = "";

    boolean stop = false;
    boolean one = false;

    String a = " ";
    String b = " ";
    String c = " ";
    String d = " ";
    String e = " ";
    String f = " ";
    String g = " ";
    String h = " ";
    String i = " ";

    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 

        System.out.println("      |      |      ");
        System.out.println("______|______|______");
        System.out.println("      |      |      ");
        System.out.println("______|______|______");
        System.out.println("      |      |      ");
        System.out.println("      |      |      ");
        Playericon = "o";

        System.out.println("Choose a number from 1 to 9 to place your o");
        System.out.println("1   2   3");
        System.out.println("4   5   6");
        System.out.println("7   8   9");

    }

    public void act() 
    {
        keylistener(Playericon, one);

        if (Greenfoot.isKeyDown("enter") & stop == true)
        {

            System.out.println("   "+ a +"   |   "+ b +"   |   "+ c +"   ");
            System.out.println("_______|_______|_______");
            System.out.println("   "+ d +"   |   "+ e +"   |   "+ f +"   ");
            System.out.println("_______|_______|_______");
            System.out.println("   "+ g +"   |   "+ h +"   |   "+ i +"   ");
            System.out.println("       |       |       ");
            if (Playericon == "o")
            {
                Playericon = "x";

            }else
            {
                Playericon = "o";

            }
            System.out.println();
            System.out.println();
            System.out.println("Choose a number from 1 to 9 to place your " + Playericon);
            System.out.println("1   2   3");
            System.out.println("4   5   6");
            System.out.println("7   8   9");
            stop = false;
            one = false;
        }else
        {
            if (!Greenfoot.isKeyDown("enter"))
            {
                stop = true;
            }
        }
    }

    public String keylistener(String Playericon, boolean one)
    {
        if (one == false)
        {
            if (Greenfoot.isKeyDown("1"))
            {
                a = Playericon;
                return  a;
                one = true;
                
            }
            if (Greenfoot.isKeyDown("2"))
            {
                b = Playericon;
                return b;
                one = true;
            }
            if (Greenfoot.isKeyDown("3"))
            {
                c = Playericon;
                return c;
                one = true;
            }
            if (Greenfoot.isKeyDown("4"))
            {
                d = Playericon;
                return d;
                one = true;
            }
            if (Greenfoot.isKeyDown("5"))
            {
                e = Playericon;
                return e;
                one = true;
            }
            if (Greenfoot.isKeyDown("6"))
            {
                f = Playericon;
                return f;
                one = true;
            }
            if (Greenfoot.isKeyDown("7"))
            {
                g = Playericon;
                return g;
                one = true;
            }
            if (Greenfoot.isKeyDown("8"))
            {
                h = Playericon;
                return h;
                one = true;
            }

            if (Greenfoot.isKeyDown("9"))
            {
                i = Playericon;
                return i;
                one = true;
            }
            else
            {return " ";}

        }
    }

}

