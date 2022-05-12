import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class array here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class array extends Actor
{
    public void act()
    {
        // Add your action code here.
    }
    //1.
    int array [];
    //2.
    public void arraysize(int arrsize)
    {
        array = new int [arrsize];
    }
    //3.
    public void fillRandom()
    {

        for (int i = 1; i < array.length; i++)
        {
            array [i] = Greenfoot.getRandomNumber(100);
        }

    }
    //4.
    public void setAll(int parameter)
    {

        for(int i = 0; i < array.length; i++)
        {
            array [i] = parameter;
        }

    }
    //5.
    public int mittelwert()
    {
        int summe = array[0];
        for (int i = 0; i < array.length; i++)
        {
            summe += array [i];
        }

        return summe / array.length; 
    }
    //6.
    public int min()
    {
        int min = array [1];
        for (int i = 1; i < array.length; i++)
        {
            if (min > array [i])
                min = array [i];
        }

        return min;
    }
    //7.
    public void clamp(int min, int max)
    {
        for (int i = 1; i < array.length; i++)
        {
            if(min > array [i])
                array [i] = min;
            if(max < array [i])
                array [i] = max;
        }
    }

    public void sort()
    {
        int temp;
        for (int j = 0; j < array.length; j++)
        {
            for (int i = 0; i < array.length; i++)
            {
                if (array [i] > array [i + 1])
                {
                    temp = array [i + 1];
                    array [i +1] = array [i];
                    array [i] = temp;
                }
            }
        }

    }

}
