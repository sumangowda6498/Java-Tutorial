package Chapter12Collections;

import java.util.HashSet;
import java.util.Set;

public class Sets {
    public static void main(String[] args) {
        Set fruit=new HashSet();
        fruit.add("apple");
        fruit.add("Mango");
        fruit.add("Lemon");
        fruit.add("Orenge");
        fruit.add("apple");
        System.out.println(fruit.size());
        System.out.println(fruit);
        System.out.println(fruit.isEmpty());
    }
}
/*
add- adds an object to set
clear- removes all objects from the collections
contains- Returns true if specified object is an element within the collection
isEmpty()- Retuns true if collection does not have any elements
iterator- returns an Iteratror objects for the collection, which may be used to retrive an object
remove- removes a specefied  object from the collection
size- Returms number of elements in the collection
 */
