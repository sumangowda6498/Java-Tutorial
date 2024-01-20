package Chapter12Collections;

import java.util.LinkedList;
import java.util.Queue;

public class Ques {
    public static void main(String[] args) {
        Queue fruite= new LinkedList();
        fruite.add("mango");
        fruite.add("lemon");
        fruite.add("Chikku");
        fruite.add("Papaya");
        fruite.add("Apple");
        fruite.add("lemon");

        System.out.println(fruite.size());//6
        System.out.println(fruite);//[mango, lemon, Chikku, Papaya, Apple, lemon]

        fruite.remove();
        System.out.println(fruite);//[lemon, Chikku, Papaya, Apple, lemon]


        System.out.println(fruite.peek());//lemon
    }
}
// add -adds element to tyhe trail of the queue
//element- Similar to peek but throws exception if queue is empty
//remove- removes and returns the head of the queue' Throws exception if queue is empty
//poll - Similarto remove(), but returns null if queue is empty
