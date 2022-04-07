/**
 * Write a description of class Stack here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Stack  
{
    int arrsize = 100;
    int stack [] = new int [arrsize];
    int currentFillrate = 0;

    public Stack()
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
            stack [numberOfElements()] = newitem;
            currentFillrate++;
        }
    }

    public int get()
    {
        if(!isEmpty())
        {
            currentFillrate--;
            return stack [numberOfElements()];
        }else return 0;
    }
}
