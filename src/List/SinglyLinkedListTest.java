package List;

import static org.junit.Assert.*;

public class SinglyLinkedListTest {

    @org.junit.Test
    public void size() {
        SinglyLinkedList<Integer> lista = new SinglyLinkedList<Integer>();
        lista.addFirst(1);
        assertEquals(lista.size(),0);
    }


    @org.junit.Test
    public void removeFirst() {
        SinglyLinkedList<Integer> lista = new SinglyLinkedList<Integer>();
        lista.addFirst(1);
        lista.removeFirst();
        assertEquals(lista.size(),0);
    }
}