package practice;

import java.util.Arrays;

public class ArraysUtility {
    public static void main(String[] args) {

//        toString(): converts array object to string, returns String

        String[] names = {"John", "Smith", "Shay", "Breanna", "Josh"};

        System.out.println(Arrays.toString(names));

//        sort(): sorts the arrray in ascending order

        int[] numbers = {5,1,3,4,2,0};

        System.out.println(Arrays.toString(numbers));

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

//        equal(): compares two array objects if they have same elements in same order

        char[] arr1= {'a','b','c'};
        char[] arr2= {'c','b','a'};

        System.out.println(arr1 == arr2);
        System.out.println(Arrays.equals(arr1, arr2));

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        System.out.println(Arrays.equals(arr1, arr2));

//        copyOf(array, newLenght): copies the specified array elements and sets new length, returns new array

        int[] scores={45,55,65,75,85};
        int[] scores2=Arrays.copyOf(scores, 3);

        System.out.println(Arrays.toString(scores2));

//        copyOfRange(array, begIndex, endIndex): copies the specified range of the array, returns new arrays

        char[] elements = {'A', 'B', 'C', 'D', 'E', 'F'};

        char[] someElements = Arrays.copyOfRange(elements, 1,4+1);

        System.out.println(Arrays.toString(elements));


    }
}
