import java.util.Collection;

public interface MyList<E> {

    void add(E obj);

    void addAll(Collection<E> newColl);

    E getFirst();

    E getLast();

    E get(int index);

    Integer indexOf(E obj);

    void remove(int index);

    void set(int index, E obj);

    Integer size();
}
