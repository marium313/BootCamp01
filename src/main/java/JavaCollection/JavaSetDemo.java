package JavaCollection;

import java.util.HashSet;
import java.util.Set;

/*
*in java, set interface is a part of the collections which does not allow duplicates.
* it models mathematical set abstraction and provides methods for performing set operations
* such as union, intersection, difference.
*
* No duplicates
* unordered
* only unique elements and each set is unique.
*
* HashSet
* a hash table based implementation of the set.
* it offers constant time performance
*
* TreeSet
* a Navigable implementation based on TreeMap.
* it maintains elements in sorted order
*
* LinkedHashSet
* a LinkedHashSet implementation is based on a predictable iteration order.
* it maintains doubly linked list.
* it provides insertion ordered iteration.
*
 */
public class JavaSetDemo {
    public static void main(String[] args){
        Set<String> names = new HashSet<>();

        names.add("John");
        names.add("Mary");
        names.add("John");
        names.add("Charlie");
        names.add("Mona");

        System.out.println("Set elements: " + names);

        names.remove("John");
        System.out.println("is Mona present? " + names.contains("Mona"));

        System.out.println("set size: " + names.size());

        names.clear();
        System.out.println("set is empty? " + names.isEmpty());

    }
}
