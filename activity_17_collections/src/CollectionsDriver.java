/*
 * CS2050 - Computer Science II - Spring 2023
 * Instructor: Thyago Mota
 * Description: Activity 17 - CollectionsDriver
 */

import java.util.*;

public class CollectionsDriver {

    public static void main(String[] args) {

        // TO DOd: create a HashMap with the following associations:
        // 511:Joe, 923:Carla, 728:Paula, 298:Zion
        // print the HashMap using its toString implementation
        // note that the order or insertion (or of the keys) is not preserved
        HashMap<Integer, String> hashmap = new HashMap<>();
        hashmap.put(511, "Joe");
        hashmap.put(923, "Carla");
        hashmap.put(728, "Paula");
        hashmap.put(298, "Zion");
        System.out.println("Hashmap: " + hashmap);

        // TO DOd: now create a LinkedHashMap with the same associations
        // note than now the order of insertion is preserved
        LinkedHashMap<Integer, String> linkedMap = new LinkedHashMap<>();
        linkedMap.put(511, "Joe");
        linkedMap.put(923, "Carla");
        linkedMap.put(728, "Paula");
        linkedMap.put(298, "Zion");
        System.out.println("LinkedMap: " + linkedMap);
        
        // TO DOd: now create a TreeMap with the same associations
        // note that the order of the keys is now preserved
        TreeMap<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(511, "Joe");
        treeMap.put(923, "Carla");
        treeMap.put(728, "Paula");
        treeMap.put(298, "Zion");
        System.out.println("TreeMap: " + treeMap);
        
        // TO DOd: create a LinkedList with the following elements:
        // Joe, Carla, Paula, Zion, Paula
        // print the LinkedList using its toString implementation
        // note that duplicates are allowed
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Joe");
        linkedList.add("Carla");
        linkedList.add("Paula");
        linkedList.add("Zion");
        linkedList.add("Paula");
        System.out.println("LinkedList: " + linkedList);

        // TO DOd: now create a HashSet with the same elements
        // note that duplicates are not allowed anymore
        // also note that the order or insertion (or of the keys) is not preserved
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Joe");
        hashSet.add("Carla");
        hashSet.add("Paula");
        hashSet.add("Zion");
        hashSet.add("Paula");
        System.out.println("HashSet: " + hashSet);

        // TO DOd: now create a LinkedHashSet with the same elements
        // note that duplicates are still not allowed
        // also note that now the order of insertion is preserved
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Joe");
        linkedHashSet.add("Carla");
        linkedHashSet.add("Paula");
        linkedHashSet.add("Zion");
        linkedHashSet.add("Paula");
        System.out.println("LinkedHashSet: " + linkedHashSet);

        // TO DOd: finally create a TreeSet with the same elements
        // note that duplicates are still not allowed
        // also note that now the elements are sorted
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Joe");
        treeSet.add("Carla");
        treeSet.add("Paula");
        treeSet.add("Zion");
        treeSet.add("Paula");
        System.out.println("TreeSet: " + treeSet);
    }
}
