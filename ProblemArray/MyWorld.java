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
        //ersteAufgabe();
        //zweiteAufgabe();
        //dritteAufgabe();
        //vierteAufgabe();
        //fuenfteAufgabe();
        //Fib();
        sechsteAufgabe();
    }

    public void ersteAufgabe()
    {
        int zahlen [] = new int [10];

        for (int i = 0; i < 10; i++)
        {
            zahlen [i] =  i;
        }
        for (int j = 0; j < 10; j++)
        {
            System.out.print(zahlen [j] + " ");
        }
        System.out.println();
    }

    public void zweiteAufgabe()
    {
        int zahlen [] = new int [10];
        for (int i = 0; i < 10; i++)
        {
            zahlen [i] = i * 10;
        }
        for (int j = 0; j < 10 ; j++)
        {
            System.out.print(zahlen [j] + " ");
        }
        System.out.println();
    }

    public void dritteAufgabe()
    {
        int zahlen [] = new int [10];
        for (int i = 0; i < 10; i++)
        {
            zahlen [i] = Greenfoot.getRandomNumber(100);
        }
        for (int j = 0; j < 10 ; j++)
        {
            System.out.print(zahlen [j] + " ");
        }
        System.out.println();
    }

    public void vierteAufgabe()
    {
        int zahlen [] = new int [10];

        for (int i = 0; i < 10; i++)
        {
            zahlen [i] =  i;
        }

        for (int j = 0; j < 10 ; j++)
        {
            System.out.print(zahlen [j] + " ");
        }
        System.out.println();

        Swap(zahlen, 2, 3);

        for (int h = 0; h < 10 ; h++)
        {
            System.out.print(zahlen [h] + " ");
        }
        System.out.println();
    }

    public void Swap(int [] zahlen, int a, int b)
    {
        int x = zahlen [a];
        zahlen [a] = zahlen [b];
        zahlen [b] = x;

    }

    public void fuenfteAufgabe()
    {
        int zahlen [] = new int [10];
        int arraysize = 10;
        for (int i = 0; i < 10; i++)
        {
            zahlen [i] = Greenfoot.getRandomNumber(100);
        }
        for (int j = 0; j < 10 ; j++)
        {
            System.out.print(zahlen [j] + " ");
        }
        System.out.println();

        sort(zahlen, 10);

        for (int h = 0; h < 10 ; h++)
        {
            System.out.print(zahlen [h] + " ");
        }
        System.out.println();
    }

    public void sort(int [] zahlen, int arraysize)
    {
        for (int j = 0; j < arraysize - 1; j++) 
        {
            for (int i = 0; i < arraysize - 1; i++)
            {
                if (zahlen [i] >zahlen[i + 1])
                {
                    Swap(zahlen, i, i + 1);
                }
            }
        }
    }

    public void Fib()
    {
        int range = 100;
        int zahlen [] = new int [range];
        zahlen [1] = 1; 
        zahlen [2] = zahlen [1];
        for (int i = 3; i < range; i++)
        {
            zahlen [i] = zahlen [i-1] + zahlen[i-2];
        }
        for (int j = 0; j < range; j++)
        {
            System.out.print(zahlen [j] + " ");
        }
        System.out.println();
    }

    public void sechsteAufgabe()
    {
        int zahlen [] = new int [10];
        int arraysize = 10;
        for (int i = 0; i < 10; i++)
        {
            zahlen [i] = Greenfoot.getRandomNumber(100);
        }
        for (int j = 0; j < 10 ; j++)
        {
            System.out.print(zahlen [j] + " ");
        }
        mergesort(zahlen, arraysize);
        for (int j = 0; j < 10 ; j++)
        {
            System.out.print(zahlen [j] + " ");
        }
    }

    public void mergesort(int [] zahlen, int arraysize)
    {
        // angenommen arraysize ist gerade
        int temp = 0; // temporärer Speicher um zwei Zahlen zu tauschen
        int x = 0; //erster Vergkeichswert
        int a = 1; //muss positiv sein
        int y = x + a;//zweiter Vergliechswert
        int b = 1; // größe des zu überprüfenden Bereichs

        for (int i = 0; i < arraysize; i++)
        {
            b = b * 2; // Bereichgröße anpassen
            for ( int j = 0; j < arraysize / b; j++)
            {
                for (int h = 0; h < b; h++)
                {
                    if (zahlen [x] < zahlen [y])
                    {
                        temp = zahlen [x];
                        zahlen [x] = zahlen [y];
                        zahlen [y] = temp;
                    }
                }
            }

        } 
    }
}
