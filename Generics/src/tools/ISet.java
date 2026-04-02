package tools;

public interface ISet<E> {
    boolean isEmpty();
    boolean remove(E elt);
    int size();
    boolean contains(E elt);
    void clear();
    boolean add(E elt);

}
