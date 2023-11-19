package javaapplication39;
public class NewMain1 {

    public static <T extends Comparable<T>> T findMinValue(T[] array) {
        if (array == null || array.length == 0) {
            return null; 
        }

        T minValue = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i].compareTo(minValue) < 0) {
                minValue = array[i];
            }
        }

        return minValue;
    }

    public static void main(String[] args) {
        Integer[] intArray = {5, 2, 8, 1, 6};
        Integer minInt = findMinValue(intArray);
        System.out.println("Minimum value in the Integer array: " + minInt);

        Double[] doubleArray = {3.5, 1.2, 7.8, 0.5, 4.2};
        Double minDouble = findMinValue(doubleArray);
        System.out.println("Minimum value in the Double array: " + minDouble);

        String[] stringArray = {"apple", "orange", "banana", "grape", "kiwi"};
        String minString = findMinValue(stringArray);
        System.out.println("Minimum value in the String array: " + minString);
    }
}
