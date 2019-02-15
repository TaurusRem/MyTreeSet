package ua.hillel.martyniuk;

import java.util.Iterator;
import java.util.TreeSet;

public class MyTreeSet {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet ();
        treeSet.add (2);
        treeSet.add (5);
        treeSet.add (1);
        treeSet.add (4);
        treeSet.add (7);
        treeSet.add (3);
        treeSet.add (9);
        treeSet.add (6);
        Iterator iterator = treeSet.iterator ();
        while (iterator.hasNext ()){
            System.out.println (iterator.next ());
        }
    }
}
