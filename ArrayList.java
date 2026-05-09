public class ArrayList<T> {

    private Object[] data;
    private int size;

    public ArrayList() {
        data = new Object[10];
        size = 0;
    }


    public void add(T element) {
        ensureCapacity();
        data[size++] = element;
    }


    public void add(int index, T element) {
        checkPositionIndex(index);

        ensureCapacity();

        for (int i = size; i > index; i--) {
            data[i] = data[i - 1];
        }

        data[index] = element;
        size++;
    }

    public T remove(int index) {
        checkElementIndex(index);

        T removed = (T) data[index];

        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }

        data[size - 1] = null;
        size--;

        return removed;
    }


    public T get(int index) {
        checkElementIndex(index);

        return (T) data[index];
    }


    public int size() {
        return size;
    }


    public int capacity() {
        return data.length;
    }


    private void ensureCapacity() {
        if (size >= data.length) {

            Object[] newData = new Object[data.length * 2];

            for (int i = 0; i < data.length; i++) {
                newData[i] = data[i];
            }

            data = newData;
        }
    }


    private void checkElementIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException(
                    "Неправильний індекс: " + index
            );
        }
    }


    private void checkPositionIndex(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException(
                    "Неправильний індекс: " + index
            );
        }
    }

    public void printList() {

        System.out.print("[ ");

        for (int i = 0; i < size; i++) {
            System.out.print(data[i] + " ");
        }

        System.out.println("]");
    }
}