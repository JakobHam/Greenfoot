/**
 * Write a description of class movingBauffer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class movingBuffer  
{
    int arrsize = 100;
    int buffer [] = new int [arrsize];
    int currentFillrate=0;

    public movingBuffer()
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
            int temp;
            for (int i = 0; i < buffer.length; i++)
            {
            temp = buffer[i + 1];
            buffer [i + 1] = buffer [i];
            }
            
            buffer [0] = newitem;
            currentFillrate++;
        }
    }

    public int get()
    {
        int x = 0;
        if(!isEmpty())
        {
            x = buffer[numberOfElements()];
            
            currentFillrate--;
        }
        return x;
    }
}
