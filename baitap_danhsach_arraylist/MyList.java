package baitap_danhsach_arraylist;


import java.nio.charset.IllegalCharsetNameException;
import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public void add(E element) {
        if (size >= DEFAULT_CAPACITY) {
            elements = Arrays.copyOf(elements, size * 2);
            elements[size++] = element;
        }
    }

    public void add(int index, E element) {
        if (size - index >= 0) System.arraycopy(elements, index, elements, index + 1, size - index);
        elements[index] = element;
        size++;
    }

    public boolean contains(E o) {
        for (int index = 0; index < size; index++) {
            if (elements[index].equals(o)) {
                return true;
            }
        }
        return false;
    }

    public void remove(int index) {
        Object deletedElement = elements[index];
        for (int i = index; i < size; i++) {
            elements[i] = elements[i + 1];
        }
        elements[size - 1] = null;
        size--;

    }

    public int size() {
        return size;
    }
    public E get(int i){
        if (i >= size || i < 0){
            throw new IllegalCharsetNameException("Index: " + i + ", Size" + i);
        }
        return (E) elements[i];
    }
    public void clear(){
        for (int i = 0; i < size; i++){
            elements[i] = null;
        }
        size = 0;
    }
    int indexOf(E o){
        for (int i =0; i < size; i++){
            if (elements[i].equals(o)){
                return i;
            }
        }
        return -1;
    }
    void addLast(E e){
        addLast(e);
    }



}
