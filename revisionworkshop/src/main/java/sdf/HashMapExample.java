package sdf;

import java.io.Console;
import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

    public void example(){
        Map<String, Integer> phones = new HashMap<>();

        phones.put("iphone", 10);
        phones.put("Huawei", 2);
        phones.put("Oppo", 4);
        phones.put("Samsung", 20);
        
        System.out.println("Total phone types: " + phones.size());

        //Iterate through the entire map and print out key + value as get method returns value to which the specific key is mapped
        for (String key : phones.keySet()){
            System.out.println(key + " - " + phones.get(key));
        }


        String searchString = "";
        Console con = System.console();

        while (!searchString.equals("quit")){
            searchString = con.readLine("Enter searchString: ");
        
            if (phones.containsKey(searchString)) {
                System.out.println(searchString + " - " + phones.get(searchString));
            } else {
                System.out.println("Item not found");
            }
        }

        //Remove all the Map data
        phones.clear();

        //Checks the size of map after clear()
        System.out.println("Total phone types after clearing map data: " + phones.size());

    }
    
}
