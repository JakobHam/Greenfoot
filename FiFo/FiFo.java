/**
 * Write a description of class FiFo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FiFo  
{
    private Node first = null;

    int numberOfNodes=0;
    public FiFo()
    {
    }
    
    public int numberOfElements()
    {
        return numberOfNodes;
    }

    public boolean isEmpty()
    {
        return numberOfElements()==0;
    }
    public void put(int newvalue)
    {
        Node node = new Node();
        node.setNext(node);
        node.setValue(newvalue);
        if (numberOfNodes == 0) first = node;
        numberOfNodes++;
    }

    public int get()
    {
        if (isEmpty())
            return 0;
        int x=0;
        x = first.getValue();
        first = first.getNext();
        return x;
    }
}
