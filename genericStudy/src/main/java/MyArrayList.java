import java.util.Arrays;
import java.util.Collection;

public class MyArrayList implements MyList {


    private Object[] elements;
    private Integer DEFAULT_CAPACITY = 16;
    private Integer size = 0;


    MyArrayList() {
        this.elements = new Object[DEFAULT_CAPACITY];

    }

    public void add(Object obj) {
        if (size == elements.length) {
            ensureCapacity();
        }

        elements[size++] = obj;
    }

    public void addAll(Collection<Object> newColl) {
        for (Object e :
                newColl) {
            add(e);
        }
    }

    public Object getFirst() {
        return elements[0];
    }

    public Object getLast() {
        return elements[elements.length - 1];
    }

    public Object get(int index) {
        return elements[index];
    }

    public Integer indexOf(Object obj) {
        int number = 0;
        for (Object e : elements) {
            if (e == obj) {
                return number;
            }
            number++;
        }
        throw new NullPointerException("This element not in the list");
    }

    public void remove(int index) {
        if(index < elements.length &&  index > 0){
            elements[index] = null;
        }
        else
            throw new NullPointerException("This index out of the list");
    }

    public void set(int index, Object obj) {
        elements[index]=obj;
    }

    public Integer size() {
        return elements.length;
    }

    private void ensureCapacity() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }
}
