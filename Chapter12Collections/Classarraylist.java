package Chapter12Collections;
/*
Differnt type of list
#Array list
#Linked list
#Stack
#Vector
 */

import chapter10.Fruite;

import java.util.ArrayList;

public class Classarraylist {
    public static void main(String[] args) {
        ArrayList<String> fruite= new ArrayList<>();
        fruite.add("mango");
        fruite.add("lemon");
        fruite.add("Chikku");
        fruite.add("Papaya");
        fruite.add("Apple");
        fruite.add("lemon");
        System.out.println(fruite.get(4));
        System.out.println(fruite.size());
        System.out.println(fruite);

    }


}
/*
add(int index,Object obj)-inserts object into list at position of index.

addAll(int index, Collection C)- inserts  all elemnts

get(int index)

indexOf(Object obj)

lastIndexOf(Object obj)

listIterator(int iterator), return last index of last instance of obj in the list

remove(int index)  Remove the element at the position ndex amd retuns the element

set(int index, Object obj) assigns obj to the  location specified by the index within the invokinf list

sublist(int start, int end) returb a list containing the element from the  start to end
 */