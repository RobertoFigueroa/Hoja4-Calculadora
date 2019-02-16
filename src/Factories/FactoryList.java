package Factories;

import List.AbstractList;
import List.SinglyLinkedList;

public  class FactoryList<E> {

    public AbstractList<E> buildList(int type){
        if(type == 1){
            return new SinglyLinkedList<E>();
        }
        else if(type == 2){
            return  new DoublyLinkedList<E>();
        }
        else{
            return new CircularList<E>();
        }
    }
}
