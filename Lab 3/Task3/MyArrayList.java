class MyArrayList<E> implements MyCollection<E> {
    private Object[] data = new Object[10];
    private int count = 0;

    @Override
    public int size() { 
        return count; 
    }

    @Override
    public boolean add(E element) {
        if (count < data.length) {
            data[count++] = element;
            return true;
        }
        return false;
    }

    @Override
    public boolean isEmpty() { 
        return count == 0; 
    }

    @Override
    public boolean contains(Object o) {
        for (int i = 0; i < count; i++) {
            if (data[i].equals(o)) return true;
        }
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false; 
    }

    @Override
    public void clear() { 
        count = 0; 
    }
}