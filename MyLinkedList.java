package ua.hillel.martyniuk;

import java.util.Iterator;
import java.util.LinkedList;

public class MyLinkedList {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList ();
        linkedList.add (5);
        linkedList.add (6);
        linkedList.add (3);
        linkedList.add (7);
        linkedList.add (8);
        linkedList.add (2);
        linkedList.add (1);
        Iterator iterator = linkedList.iterator ();
        while (iterator.hasNext ()) {
            System.out.println (iterator.next ());

        }
    }
}