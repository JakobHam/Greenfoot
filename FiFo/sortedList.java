/**
 * Write a description of class sortedList here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class sortedList  
{
    private Node first = null;
    int numberOfNodes = 0;
    public sortedList()
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
        if (numberOfNodes == 0)
        {  Node node = new Node();
            node.setNext(null);
            node.setValue(newvalue);
            first = node;
            numberOfNodes++;
        }else{
            Node current=first;
            Node last=null;
            while(current!=null)
            {
                if (current.getValue()<newvalue)
                {
                    last=current;
                    current=current.getNext();
                }else{
                    //hier einhängen
                    return;
                }
                
            }
        }

    }
}
