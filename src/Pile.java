/**
 *Esta clase representa a una Pila de objetos
 * @author Roberto Figueroa , Steven Chan
 *
 * */
import java.util.Vector;

public class Pile<T> implements Stack<T> {

    private Vector<T> Data = new Vector<T>(2,0);

    /**
     * Permite ingresar un elemento a la Pila
     * @param item Elemento a ingresar a la pila
     * */
    @Override
    public void push(T item) {
        Data.add(item);
    }
    /**
     * Permite sacar el último elemento de la pila
     * @return Elemento ultimo de la pila
     * */
    @Override
    public T pop() {  //saca el útlimo elemento
        T item = Data.lastElement();
        Data.remove(Data.size()-1);
        return item;
    }
    /**
     * Permite indentificar el último elemento de la pila
     * @return El ultimo elemento de la pila
     * */
    @Override
    public T peek() {
        return Data.lastElement();
    }
    /**
     * Permita saber si la pila esta vacía
     * @return Verdadero si contiene un elemento, falso si esta vacía
    * */
    @Override
    public boolean empty() {
        return Data.isEmpty();
    }
    /**
     * Permite saber el tamaño de la pila
     * @return El tamaño de la pila
     * */

    @Override
    public int size() {
        return Data.size();
    }
}