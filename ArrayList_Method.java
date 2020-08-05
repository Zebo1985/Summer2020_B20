package day38_JavaRecap;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList_Method {
    public static void main(String[] args) {
        ArrayList<String>cars = new ArrayList<>();
        cars.addAll(Arrays.asList("BMW","Tesla","Mercedas","Tesla","Infinity","Tesla","WV","Lexus","Tesla"));
        // cars.remove(3);           0    1         2         3        4        5       6     7       8
        //cars.remove("Tesla");
        //cars.removeAll(Arrays.asList("Tesla"));
        cars.removeIf(p-> p.toLowerCase().contains("m"));
        System.out.println(cars);
        System.out.println("=========================================");
       ArrayList<String>groceryList = new ArrayList<>();
       groceryList.addAll(Arrays.asList("Eggs","Milk","Paper","Mango","Bread","Water","Apple"));
       boolean r1 = groceryList.contains("Pepsi");
        System.out.println(groceryList);
        System.out.println(r1);
        boolean r2 = groceryList.containsAll(Arrays.asList("Eggs","Milk","Water"));
        System.out.println(r2);
        System.out.println("Total number of item: "+groceryList.size());
// apple to banana
groceryList.set(groceryList.size()-1,"Banana");
        System.out.println(groceryList);
groceryList.set(groceryList.indexOf("Paper"),"soap");
        System.out.println(groceryList);
        groceryList.clear();
        System.out.println(groceryList);

    }
}
