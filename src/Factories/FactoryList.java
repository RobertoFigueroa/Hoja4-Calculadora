package Factories;

import List.CircularList;
import List.DoublyLinkedList;
import Stack.PileList;
import List.SinglyLinkedList;

public  class FactoryList<E> {

    public PileList<E> buildList(int type){
        if(type == 1){
            return new SinglyLinkedList<>();
        }
        else if(type == 2){
            return  new DoublyLinkedList<>();
        }
        else{
            return new CircularList<>();
        }
    }
}
