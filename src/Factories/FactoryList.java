package Factories;

import List.SinglyLinkedList;
import Utilities.CircularList;
import Utilities.DoubleLinkedList;

import java.util.List;

public  class FactoryList<E> {

    public List<E> buildList(int type){
        if(type == 1){
            return new SinglyLinkedList<E>();
        }
        else if(type == 2){
            return  new DoubleLinkedList<E>();
        }
        else{
            return new CircularList<E>();
        }
    }
}
