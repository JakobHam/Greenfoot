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
        //sechsteAufgabe();
        //siebteAufgabe();
        System.out.println(Teilbarkeit(4, 2));
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
        int zahlen2 [] = new int [arraysize]; //zweites Array
        int temp = 0; // temporärer Speicher um zwei Zahlen zu tauschen
        int x = 0; //erster Vergleichswert
        int a = 1; //muss positiv sein
        int y = x + a;//zweiter Vergliechswert
        for (int b = 0; b <= arraysize; b = b * 2) //Wie oft das array mit anderen Abschnitten verglichen werden muss //???
        {
            for ( int j = 0; j < arraysize / b; j++)
            {
                for (int h = 0; h < b; h++)
                {
                    a = b / 2; //Abstand zwischen den zu vergleichenden Zahlen
                    x = j * b; //Stelle im Array
                    if (zahlen [x] < zahlen [y])
                    {
                        zahlen [x] = zahlen2 [x];   
                        x = x + 1;
                    }      
                    else
                    {
                        zahlen [y] = zahlen [x];
                    }
                }
            }
        } 
        
    }

    public void siebteAufgabe()
    {
        double x = 0;

        double Array [] = new double [100];
        for (int i = 0; i < 100; i++)
        {
            Array [i] = Greenfoot.getRandomNumber(100);
            //System.out.println(Array [i]);
        }

        x = Array [1];
        for (int h = 0; h < 99; h++)
        {
            if (x < Array [h + 1])
            {
                x = Array [h + 1];
            }
        }
        System.out.println("Max: " + x);

        for (int g = 0; g < 99; g++)
        {
            if (x > Array [g +1])
            {
                x = Array [g + 1];
            }
        }
        System.out.println("Min: " + x);

        x = Array [1];
        for (int j = 0; j < 99; j++)
        {
            x = Array [j + 1] + x;
        }
        System.out.println("Durchschnitt: " + x / 100);

        for (int j = 0; j < 100 - 1; j++) 
        {
            for (int i = 0; i < 100 - 1; i++)
            {
                if (Array [i] >Array[i + 1])
                {
                    double y = Array [i];
                    Array [i] = Array [i + 1];
                    Array [i + 1] = x;

                }
            }
        }
        System.out.println("Median: " + Array [50]);
    }

    public boolean Teilbarkeit(int i1, int i2)
    {
        /*
         * if (i1 % i2 == 0)
         * return true;
         * else
         * return false;
        */
        return i1 % i2 == 0;
    }

}

