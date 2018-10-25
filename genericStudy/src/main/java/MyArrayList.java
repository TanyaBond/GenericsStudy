import java.util.Arrays;
import java.util.Collection;

public class MyArrayList<E> implements MyList<E> {


    private final static Integer DEFAULT_CAPACITY = 16;
    private E[] elements;
    private Integer size = 0;


    public MyArrayList() {
        this.elements = (E[]) new Object[DEFAULT_CAPACITY];

    }

    public MyArrayList(int capacity) {
        this.elements = (E[]) new Object[capacity];
    }

    @Override
    public void add(E obj) {
        ensureCapacity();
        elements[size++] = obj;
    }

    @Override
    public void addAll(Collection<E> newColl) {
        for (E e : newColl) {
            add(e);
        }
    }


    public E getFirst() {
        return (E) elements[0];
    }

    public E getLast() {

        return (E) elements[size - 1];
    }

    public E get(int index) {
        return (E) elements[index];
    }

    @Override
    public Integer indexOf(Object obj) {
        int number = 0;
        for (Object e : elements) {
            if (e.equals(obj)) {
                return number;
            }
            number++;
        }
        return -1;
    }

    public void remove(int index) {

        if (index > elements.length && index < 0) {
            throw new IndexOutOfBoundsException("This index out of the list");
        }
        elements[index] = null;
        size--;

    }

    @Override
    public void set(int index, E obj) {
        if (index > elements.length && index < 0) {
            throw new IndexOutOfBoundsException("This index out of the list");
        }

        elements[index] = obj;
    }

    public Integer size() {
        return size;
    }

    private void ensureCapacity() {
        if (size == elements.length) {
            int newSize = elements.length * 2;
            elements = Arrays.copyOf(elements, newSize);
        }
    }

}
