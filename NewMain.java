package javaapplication80;
import java.util.Arrays;

class GenericArrayOperations<T> {
    private Object[] array;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    public GenericArrayOperations() {
        this.array = new Object[DEFAULT_CAPACITY];
        this.size = 0;
    }
    public void addToBeginning(T element) {
        ensureCapacity();
        System.arraycopy(array, 0, array, 1, size);
        array[0] = element;
        size++;
    }

    public void addToMiddle(int position, T element) {
        ensureCapacity();
        if (position < 0 || position > size) {
            throw new IndexOutOfBoundsException("Invalid position");
        }

        System.arraycopy(array, position, array, position + 1, size - position);
        array[position] = element;
        size++;
    }

    public void addToEnd(T element) {
        ensureCapacity();
        array[size++] = element;
    }

    public void deleteFromPosition(int position) {
        if (position < 0 || position >= size) {
            throw new IndexOutOfBoundsException("Invalid position");
        }

        System.arraycopy(array, position + 1, array, position, size - position - 1);
        size--;
    }

    private void ensureCapacity() {
        if (size == array.length) {
            array = Arrays.copyOf(array, 2 * size);
        }
    }

    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}

public class NewMain {
    public static void main(String[] args) {
        GenericArrayOperations<Integer> arrayOperations = new GenericArrayOperations<>();

        arrayOperations.addToEnd(1);
        arrayOperations.addToEnd(3);
        arrayOperations.addToEnd(4);

        System.out.println("Original Array:");
        arrayOperations.display();

        arrayOperations.addToBeginning(0);
        arrayOperations.addToMiddle(2, 2);
        arrayOperations.addToEnd(5);

        System.out.println("\nArray after adding elements:");
        arrayOperations.display();

        arrayOperations.deleteFromPosition(3);

        System.out.println("\nArray after deleting element from position 3:");
        arrayOperations.display();
    }
}
