package Utilities;

public class DoubleLinkedList<E> extends AbstractList<E>{
        protected int count;
        protected DoubleLinkedNode<E> head;
        protected DoubleLinkedNode<E> tail;

        public DoubleLinkedList()
// post: constructs an empty list
        {
            head = null;
            tail = null;
            count = 0;
        }


    @Override
    public int size() {
        return 0;
    }

    @Override
    public void clear() {

    }

    public void addFirst(E value)
// pre: value is not null
// post: adds element to head of list
        {
            // construct a new element, making it head
            head = new DoubleLinkedNode<E>(value, head, null);
            // fix tail, if necessary
            if (tail == null) tail = head;
            count++;
        }


        public void addLast(E value)
// pre: value is not null
// post: adds new value to tail of list
        {
            // construct new element
            tail = new DoubleLinkedNode<E>(value, null, tail);
            // fix up head
            if (head == null) head = tail;
            count++;
        }

    @Override
    public E getFirst() {
        return null;
    }

    @Override
    public E getLast() {
        return null;
    }

    @Override
    public E removeFirst() {
        return null;
    }


    public E removeLast()
// pre: list is not empty
// post: removes value from tail of list
        {
            DoubleLinkedNode<E> temp = tail;
            tail = tail.previous();
            if (tail == null) {
                head = null;
            } else {
                tail.setNext();
            }
            count--;
            return temp.value();
        }

    @Override
    public E remove(E value) {
        return null;
    }

    @Override
    public void add(E value) {

    }

    @Override
    public E remove() {
        return null;
    }

    @Override
    public E get() {
        return null;
    }

    @Override
    public int indexOf(E value) {
        return 0;
    }

    @Override
    public int lastIndexOf(E value) {
        return 0;
    }

    @Override
    public E get(int i) {
        return null;
    }

    @Override
    public E set(int i, E o) {
        return null;
    }

    @Override
    public void add(int i, E o) {

    }

    @Override
    public E remove(int i) {
        return null;
    }
}
