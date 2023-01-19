package sdf;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionSort {
    
    public static void main(String[] args) {

        //Example 1
        List<Integer> numbers = new ArrayList<Integer>();

        for (int i = 0; i < 10; i++) {
            numbers.add((int) (Math.random() * 100)); //Math.random returns a double, number is between 0 - 100, arraylist is int, so cast is needed
        }

        // Print out unsorted list
        System.out.println("Unsorted list: " + numbers);

        // Sort in ascending & print
        Collections.sort(numbers);
        System.out.println("Sorted list: " + numbers);

        // Sort in descending & print
        Collections.sort(numbers, Collections.reverseOrder());
        System.out.println("Sorted list (reverse): " + numbers);


        //Example 2
        Integer numbers2 [] = {10, 5, 1, 2, 3, 6, 4, 7, 9, 8};
        // int[] numbers2 = {10, 5, 1, 2, 3, 6, 4, 7, 9, 8};

        // sort number array in ascending order & print
        Arrays.sort(numbers2);
        System.out.println("Sorted numbers: " + Arrays.toString(numbers2));

        // sort number array in reverse order & print
        Arrays.sort(numbers2, Collections.reverseOrder());
        System.out.println("Sorted numbers: " + Arrays.toString(numbers2));
    }

    // public void example01(){
    //     List<Integer> numbers = new ArrayList<Integer>();

    //     for (int i = 0; i < 10; i++) {
    //         numbers.add((int) (Math.random() * 100)); //Math.random returns a double, number is between 0 - 100, arraylist is int, so cast is needed
    //     }

    //     // Print out unsorted list
    //     System.out.println("Unsorted list: " + numbers);

    //     // Sort in ascending & print
    //     Collections.sort(numbers);
    //     System.out.println("Sorted list: " + numbers);

    //     // Sort in descending & print
    //     Collections.sort(numbers, Collections.reverseOrder());
    //     System.out.println("Sorted list (reverse): " + numbers);

    // }

    // public void example02(){
    //     Integer numbers [] = {10, 5, 1, 2, 3, 6, 4, 7, 9, 8};
    //     // int[] numbers = {10, 5, 1, 2, 3, 6, 4, 7, 9, 8};

    //     // sort number array in ascending order & print
    //     Arrays.sort(numbers);
    //     System.out.println("Sorted numbers: " + Arrays.toString(numbers));

    //     // sort number array in reverse order & print
    //     Arrays.sort(numbers, Collections.reverseOrder());
    //     System.out.println("Sorted numbers: " + Arrays.toString(numbers));

    // }
    
}
