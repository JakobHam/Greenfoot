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
<<<<<<< HEAD
    
    String refernce = "o";
=======

>>>>>>> cd40bbf48a910d5b7453bbfab62431296753adbe
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
<<<<<<< HEAD
        
        if (Greenfoot.isKeyDown("enter") & stop == true)
        {
            
=======

        if (Greenfoot.isKeyDown("enter") & stop == true)
        {

>>>>>>> cd40bbf48a910d5b7453bbfab62431296753adbe
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
<<<<<<< HEAD
            win(a,b,c,d,e,f,g,h,i, refernce);
=======
>>>>>>> cd40bbf48a910d5b7453bbfab62431296753adbe
            System.out.println("Choose a number from 1 to 9 to place your " + Playericon);
            System.out.println("1   2   3");
            System.out.println("4   5   6");
            System.out.println("7   8   9");
            stop = false;
<<<<<<< HEAD
            //one = false;
=======
            one = false;
>>>>>>> cd40bbf48a910d5b7453bbfab62431296753adbe
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
<<<<<<< HEAD
        //if (one == false)
        //{
=======
        if (one == false)
        {
>>>>>>> cd40bbf48a910d5b7453bbfab62431296753adbe
            if (Greenfoot.isKeyDown("1"))
            {
                a = Playericon;
                return  a;
<<<<<<< HEAD
                //one = true;
=======
                one = true;
>>>>>>> cd40bbf48a910d5b7453bbfab62431296753adbe
                
            }
            if (Greenfoot.isKeyDown("2"))
            {
                b = Playericon;
                return b;
<<<<<<< HEAD
                //one = true;
=======
                one = true;
>>>>>>> cd40bbf48a910d5b7453bbfab62431296753adbe
            }
            if (Greenfoot.isKeyDown("3"))
            {
                c = Playericon;
                return c;
<<<<<<< HEAD
                //one = true;
=======
                one = true;
>>>>>>> cd40bbf48a910d5b7453bbfab62431296753adbe
            }
            if (Greenfoot.isKeyDown("4"))
            {
                d = Playericon;
                return d;
<<<<<<< HEAD
                //one = true;
=======
                one = true;
>>>>>>> cd40bbf48a910d5b7453bbfab62431296753adbe
            }
            if (Greenfoot.isKeyDown("5"))
            {
                e = Playericon;
                return e;
<<<<<<< HEAD
                //one = true;
=======
                one = true;
>>>>>>> cd40bbf48a910d5b7453bbfab62431296753adbe
            }
            if (Greenfoot.isKeyDown("6"))
            {
                f = Playericon;
                return f;
<<<<<<< HEAD
                //one = true;
=======
                one = true;
            }
            if (Greenfoot.isKeyDown("7"))
            {
                g = Playericon;
                return g;
                one = true;
>>>>>>> cd40bbf48a910d5b7453bbfab62431296753adbe
            }
            if (Greenfoot.isKeyDown("8"))
            {
                h = Playericon;
                return h;
<<<<<<< HEAD
                //one = true;
=======
                one = true;
>>>>>>> cd40bbf48a910d5b7453bbfab62431296753adbe
            }

            if (Greenfoot.isKeyDown("9"))
            {
                i = Playericon;
                return i;
<<<<<<< HEAD
                //one = true;
=======
                one = true;
>>>>>>> cd40bbf48a910d5b7453bbfab62431296753adbe
            }
            else
            {return " ";}

<<<<<<< HEAD
       // }
    }
    public void win(String a, String b, String c, String d, String e, String f, String g, String h, String i, String reference)
    {
    if (a == b && b == c && c == "o" || a == d && d== g && g== "o" || a == e && e == i && i == "o" || b == e && e== h && h == "o" || c == f && f == i && i == "o" || c == e && e == g && g == "o" || d == e && e == f && f =="o" || g == h && h == i && i == "o")
    {
    System.out. println ("Player O won!!!");
    }
    if (a == b && b== c && c == "x" || a == d && d == g && g == "x" || a == e && e == i && i == "x" || b == e && e == h && h == "x" || c == f && f == i && i == "x" || c == e && e == g && g == "x" || d == e && e == f && f == "x" || g == h && h == i && i == "x")
    {
    System.out. println ("Player X won!!!");
    }

}
}
=======
        }
    }

}
>>>>>>> cd40bbf48a910d5b7453bbfab62431296753adbe

