
/**
 * @author Roberto Figueroa, Steven Chan
 * Esta clase hereda los metodos de la Interfaz Stack y de la clase AbstractPile los cuales son definidos por lo que
 *  * se vuelve una clase concreta
 * */


package Utilities;


public abstract class PileList<E> implements MyList<E> {

    public boolean isEmpty()
    // post: returns true iff list has no elements
    {
        return size() == 0;
    }

    public boolean contains(E value)
    // pre: value is not null
    // post: returns true iff list contains an object equal to value
    {
        return -1 != indexOf(value);
    }


}
