/**
 * Write a description of class Vector here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Vector  
{
    // instance variables - replace the example below with your own
    double x,y;

    public Vector()
    {
        x=0;
        y=0;
    }

    public Vector(double x_new, double y_new)
    {
        x=x_new;
        y=y_new;
    }

    public void set(double x_new, double y_new)
    {
        x=x_new;
        y=y_new;
    }

    //static: diese funktion wird nicht auf einem objekt (einer instanz) sondern allgemein 
    //auf der klasse auf gerufen
    //man addiert 2 vektoren und gibt einen neuen vektor als ergebnis zurück
    static public Vector add(Vector v1, Vector v2)
    {
        Vector result = new Vector(v1.x+v2.x,v1.y+v2.y);
        return result;        

        //c=a+b
    }

    //man zählt zu einem  Vektor einen anderen dazu!
    public Vector add(Vector v)
    {
        x=x+v.x;
        y=y+v.y;
        return this;
    }

    public Vector sub(Vector v)
    {
        x = x - v.x;
        y = y - v.x;
        return this;
    }

    public Vector mult(Vector v, double k)
    {
        return new Vector(k*v.x, k*v.y);
    }

    public static double skalar(Vector v1, Vector v2)
    {
        return v1.x*v2.x+v2.y*v2.y;
    }
    
    //TODO:
    //sub subtracts 2 vectors

    //TODO: 
    //mult: multiplies with a skalar
    //puhblic Vector mult(double k)

    //TODO:
    //dot: skalarprodukt zweier vectoren (->double) (static?)

}
