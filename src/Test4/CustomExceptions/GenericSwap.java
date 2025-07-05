package Test4.CustomExceptions;

import java.util.Arrays;

public class GenericSwap {
    public static <T> void swap(T[] array,int i,int j){
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {

        Integer[] numbers = {1, 2, 3};
        swap(numbers, 0, 2);
        System.out.println(Arrays.toString(numbers));

        String[] letters = {"A", "B", "C"};
        swap(letters, 0, 1);
        System.out.println(Arrays.toString(letters));

    }
}
