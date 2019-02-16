package Factories;

import Interface.Stack;
import PileArrayList;
import PileVector;

public class FactoryPile<E> {

    public Stack<E> buildStack(String type){
        FactoryList<E> list = new FactoryList<>();
        if(type.equals("AL")){
            return new PileArrayList<>();
        }
            return new PileVector<>();
    }

}
