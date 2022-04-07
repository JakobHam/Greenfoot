/**
 * Write a description of class Node here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Node  
{
    private Node next = null;
    private int value;
    public Node()
    {
    }
    
    public void setNext(Node next)
    {
    this.next = next;
    }
    
    public Node getNext()
    {
    return next;
    }
    
    public void setValue(int newvalue)
    {
    value = newvalue;
    }
    public int getValue()
    {
    return value;
    }

}
