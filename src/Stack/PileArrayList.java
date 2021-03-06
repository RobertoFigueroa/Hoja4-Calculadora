/*
* Esta clase hereda los metodos de la Interfaz Stack y de la clase AbstractPile los cuales son definidos por lo que
* se vuelve una clase concreta
*
* */
/**
 * @author Roberto Figueroa, Steven Chan
 * */

package Stack;

import Stack.AbstractPile;

import java.util.ArrayList;

public class PileArrayList<E> extends AbstractPile<E> {

    protected ArrayList<E> data;

    public PileArrayList()
    // post: constructs a new, empty stack
    {
        data = new ArrayList<E>();
    }
    public void push(E item)
    // post: the value is added to the stack
    //          will be popped next if no intervening push
    {
        data.add(item);
    }

    public E pop()
    // pre: stack is not empty
    // post: most recently pushed item is removed and returned
    {
        return data.remove(size()-1);
    }

    public E peek()
    // pre: stack is not empty
    // post: top value (next to be popped) is returned
    {
        return data.get(size() - 1);
    }

    public int size()
    // post: returns the number of elements in the stack
    {
        return data.size();
    }


}
