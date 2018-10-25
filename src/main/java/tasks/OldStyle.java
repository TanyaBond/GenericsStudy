package tasks;

import java.util.Iterator;
import java.util.List;


public class OldStyle implements Iterator {

    List values;
    int currentVal = 0;

    public OldStyle(List val) {
        this.values = val;
    }

    public void addElement(Object val) {
        this.values.add(val);
        currentVal++;
    }

    public void addElements(List values) {
        values.addAll(values);
        currentVal = currentVal + values.size();
    }

    public Object getElement(int index) {
        if (values.size() > index | index < 0) {
            throw new IndexOutOfBoundsException();
        }
        currentVal--;
        return values.get(index);
    }

    public Iterator iterator() {
        return values.iterator();
    }


    public boolean hasNext() {
        if (values.get(currentVal) != null)
            return true;
        else return false;
    }

    public Object next() {
        if (values.get(currentVal) != null) {
            currentVal--;
            return values.get(currentVal);
        } else throw new IndexOutOfBoundsException();
    }

    public void remove() {
        if (values.get(currentVal) != null) {
            values.set(currentVal, null);
            currentVal--;
        }

    }


}
