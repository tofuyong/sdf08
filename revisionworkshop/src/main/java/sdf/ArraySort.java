package sdf;

import java.util.Arrays;
import java.util.Collections;

public class ArraySort {

    public void example(){
        // custom array with data (name)
        String name[] = {"andrew", "ben", "chris", "darryl", "edmund", "fiona", "george", "harold", "ivan",};

        //sort array in ascending order & print
        Arrays.sort(name);
        System.out.println("Sorted arr: " + Arrays.toString(name));

        //sort array in descending order & print
        Arrays.sort(name, Collections.reverseOrder());
        System.out.println("Sorted arr (reversed): " + Arrays.toString(name));
        
        
    }
}
