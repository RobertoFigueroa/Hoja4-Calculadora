package Utilities;

import java.util.AbstractList;

public  class FactoryList<E> {

    public PileList<E> buildList(int type){
        if(type == 1){
            return new SimplyChainedList<>();
        }
        else if(type == 2){
            return  new DoubleChainedList<>();
        }
        else{
            return new CircularList<>();
        }
    }
}
