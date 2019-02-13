package Utilities;

public class FactoryPile<E> {

    public Stack<E> buildStack(String type){

        if(type.equals("AL")){
            return new PileArrayList<E>();
        }
        else if(type.equals("LI")){
            return new PileList<E>();
        }
        else{
            return new PileVector<E>();
        }
    }

}
