/*
 * Esta clase hereda los metodos de la Interfaz Stack y de la clase AbstractPile los cuales son definidos por lo que
 * se vuelve una clase concreta
 *
 * */
/**
 * @author Roberto Figueroa, Steven Chan
 * */


package Utilities;

import java.util.List;

public class PileList<E> extends AbstractPile<E> {

    protected List<E> data;

    public PileList(){
        //generate a new List for save the numbers
        data = new List<E>();

    }

}
