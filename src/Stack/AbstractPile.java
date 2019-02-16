
//Roberto Figueroa , Steven Chan
//Obtenido de: JavaStructures, data structures for the principled programmer. Bailey, Duane

package Stack;

import Interface.Stack;

public abstract class AbstractPile<E> implements Stack<E> {

    @Override
    public boolean empty() {
        return size() == 0;
    }
}
