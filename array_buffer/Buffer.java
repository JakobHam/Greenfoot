/**
 * Write a description of class Buffer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Buffer  
{
    int arrsize = 100;
    int buffer [] = new int [arrsize];
    int currentFillrate=0;

    public Buffer()
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
            buffer [numberOfElements()] = newitem;
            currentFillrate++;
        }
    }

    public int get()
    {
        int x = 0;
        if(!isEmpty())
        {
            x = buffer[0];
            for (int i = 0; i < numberOfElements()-1; i++)
            {
                buffer [i] = buffer[i+1];
            }
        }
        return x;
    }
}
