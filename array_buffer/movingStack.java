/**
 * Write a description of class Stack here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class movingStack  
{
    int arrsize = 100;
    int stack [] = new int [arrsize];
    int currentFillrate = 0;

    public movingStack()
    {
    }

    public int numberOfElements()
    {
        return currentFillrate;
    }

    public boolean isEmpty()
    {
        return numberOfElements()==0;
    }

    public boolean isFull()
    {
        return numberOfElements()==arrsize;
    }

    public void put(int newitem)
    {
        if(!isFull())
        {
            for (int i = 1; i < numberOfElements(); i++)
            {
                stack [i] = stack[i-1];
            }
            stack [0] = newitem;
            currentFillrate++;
        }
    }

    public int get()
    {
        if(isEmpty())
        {
            return 0;
        }
        currentFillrate--;
        return stack [0];
    }
}
