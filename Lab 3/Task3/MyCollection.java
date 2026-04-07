public interface MyCollection<E> {
    int size();
    boolean add(E element);
    boolean remove(Object o);
    boolean isEmpty();
    boolean contains(Object o);
    void clear();
}