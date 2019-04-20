package HomeWork.hw4;

import java.util.Arrays;

public class MyArrayList<T> implements MyList<T> {
    private T[] array;
    private int size;
    private int capacity;
    private static final int INITIAL_CAPACITY = 10;

    public MyArrayList() {
        capacity = INITIAL_CAPACITY;
        array = (T[]) new Object[capacity];
    }

    private void increaseCapacity() {
        capacity = capacity * 3 / 2;
        array = Arrays.copyOf(array, capacity);
    }

    @Override
    public void add(T value) {
        if (size == capacity) {
            increaseCapacity();
        }
        array[size] = value;
        size++;
    }

    @Override
    public void add(T value, int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        if (size >= capacity) {
            increaseCapacity();
        }
        System.arraycopy(array, index, array, index + 1, size - index);
        array[index] = value;
        size++;
    }

    @Override
    public void addAll(MyList<T> list) {
        T[] addArray = list.toArray();
        while (list.size() + this.size() > capacity) {
            increaseCapacity();
        }
        for (int i = 0; i < list.size(); i++) {
            add(addArray[i]);
        }
    }

    @Override
    public T get(int index) {
        isIndexCorrect(index);
        return array[index];
    }

    @Override
    public void set(T value, int index) {
        isIndexCorrect(index);
        array[index] = value;
    }

    @Override
    public T remove(int index) {
        isIndexCorrect(index);
        T removeItem = array[index];
        System.arraycopy(array, index + 1, array, index, size - index - 1);
        array[size - 1] = null;
        size--;
        return removeItem;
    }

    @Override
    public T remove(T t) {
        for (int i = 0; i < size; i++) {
            if (t.equals(array[i])) {
                return remove(i);
            }
        }
        return null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    private void isIndexCorrect(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
    }

    @Override
    public T[] toArray() {
        return Arrays.copyOf(array, size());
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(array, size()));
    }
}
