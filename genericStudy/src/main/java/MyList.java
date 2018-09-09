import java.util.Collection;

public interface MyList {

    void add(Object obj);

    void addAll(Collection<Object> newColl);

    Object getFirst();

    Object getLast();

    Object get(int index);

    Integer indexOf(Object obj);

    void remove(int index);

    void set(int index, Object obj);

    Integer size();
}
