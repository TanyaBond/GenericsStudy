import java.util.Arrays;
import java.util.Collection;

public class MyArrayList<E extends Comparable<E>> implements MyList {


    private Object[] elements;
    private Integer DEFAULT_CAPACITY = 16;
    private Integer size = 0;


    public MyArrayList() {
        this.elements = new Object[DEFAULT_CAPACITY];

    }

    public MyArrayList(int capacity) {
        this.elements = new Object[capacity];
    }

    @Override
    public void add(Object obj) {
        if (size == elements.length) {
            ensureCapacity();
        }

        elements[size++] = (E) obj;
    }

    @Override
    public void addAll(Collection newColl) {
        for (Object e :
                newColl) {
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
        throw new NullPointerException("This element not in the list");
    }

    public void remove(int index) {
        if (index < elements.length && index > 0) {
            elements[index] = null;
            size--;
        } else
            throw new NullPointerException("This index out of the list");
    }

    @Override
    public void set(int index, Object obj) {
        elements[index] = obj;
    }

    public Integer size() {
        return size;
    }

    private void ensureCapacity() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

}
