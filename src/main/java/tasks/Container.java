package tasks;

import java.util.Iterator;
import java.util.List;

public class Container<T> implements Iterable<T> {

    private List<T> values;

    public Container(List<T> values) {
        this.values = values;
    }

    public void addElement(T elem) {
        values.add(elem);
    }

    public void addElements(List<T> elements) {
        values.addAll(elements);
    }

    public T getElement(int index) {
        if (values.size() > index | index < 0) {
            throw new IndexOutOfBoundsException();
        }

        return values.get(index);
    }


    @Override
    public Iterator<T> iterator() {
        return values.iterator();
    }

}
