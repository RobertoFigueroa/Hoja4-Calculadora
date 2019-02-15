package Utilities;

public class FactoryPile<E> {

    public Stack<E> buildStack(String type){

        if(type.equals("AL")){
            return new PileArrayList<>();
        }
        else if(type.equals("LI")){
            return new PileList<>();
        }
        else{
            return new PileVector<>();
        }
    }

}
