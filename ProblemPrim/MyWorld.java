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
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        int a = 0;
        int b = 0;
        int rahmen = 0;
        int anzahlBereiche = 0;
        int größeBereiche = 0;
        int AnzahlPrimzahlen = 0;

        rahmen = 1000;
        anzahlBereiche = 10;

        größeBereiche = rahmen / anzahlBereiche;

        for(int h = 0; h < anzahlBereiche; h++)
        {
            a = h * größeBereiche;
            b = (h + 1) * größeBereiche;

            AnzahlPrimzahlen = PrimAnzahl(a, b);

            //System.out.println("Im Bereich von " + a + " bis " + b + " sind " + AnzahlPrimzahlen + " Primzahlen" );
            System.out.print(a + " - " + b + ": ");
            for (int k = 0; k < AnzahlPrimzahlen; k++)
            {
            System.out.print("X");
            }
            System.out.println();
        }

    }

    public boolean Prim(int Zahl)
    {

        for(int j = 2; j < Zahl; j++)
        {

            if(Zahl%j == 0)
            {
                return false;
            }
        }
        return true;
    }
    int x = 0;
    public int PrimAnzahl(int a, int b)
    {
        x = 0;
        for (int i = a; i < b; i++)
        {
            if (Prim(i))
            {
                x++;
            }
        }
        return x;

    }
}   
