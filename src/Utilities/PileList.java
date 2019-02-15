
/**
 * @author Roberto Figueroa, Steven Chan
 * Esta clase hereda los metodos de la Interfaz Stack y de la clase AbstractPile los cuales son definidos por lo que
 *  * se vuelve una clase concreta
 * */


package Utilities;

import java.util.List;

public abstract class PileList<E> implements List<E> {

    protected List<E> data;

    public PileList(int option){
        //generate a new List for save the numbers
        data = listFactory(option);

    }

}
