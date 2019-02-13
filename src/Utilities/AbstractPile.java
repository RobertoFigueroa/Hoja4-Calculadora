package Utilities;

public abstract class AbstractPile<E> implements Stack<E>{

    @Override
    public boolean empty() {
        return size() == 0;
    }
}
