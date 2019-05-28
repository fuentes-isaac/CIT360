/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit360test;
import java.util.*;
/**
 *
 * @author isaacfuentes
 */
public class CIT360Test {

    public static void main (String[] args) 
    { 
        System.out.println("+++++Java Collections - List+++++");
        System.out.println();
        
        System.out.println("A List collection can store elements by insertion order\n"
                + "and also to a specific place in the list because it keeps\n"
                + "indices of its elements.\n"
                + "It also allows to store duplicates.\n" );
        
        System.out.println();
        System.out.println("Creating a list");
        List<String> listStrings = new ArrayList<String>();
        // OK to add Strings:
        listStrings.add("One");
        listStrings.add("Two");
        listStrings.add("Three");
        System.out.println(listStrings); 
        
        System.out.println();
        System.out.println("Inserting a new item in the 2nd position\n"
                + "by using the add keyword");
        listStrings.add(1, "Four");
        System.out.println(listStrings); 
        
        System.out.println();
        System.out.println("We can get elements from a list using the get keyword.");
        String element = listStrings.get(3);
        System.out.println(element); 
        
        System.out.println();
        System.out.println("We can update an item in the list with the set keyword");
        listStrings.set(2, "Nine");
        System.out.println(listStrings);
        
        System.out.println();
        System.out.println("We can delete an item in the list with the remove keyword");
        listStrings.remove(0);
        System.out.println(listStrings);
        
        System.out.println();
        System.out.println();
        System.out.println("+++++Java Collections - Set+++++");
        
        System.out.println();
        System.out.println("Does not allow duplicates and the elements\n"
                + "are not stored in order, so it is not possible to\n"
                + "itinerate betwenen its elements. This type of collection\n"
                + "is used when we want to ensure that only unique elements\n"
                + "are part of the collection or array.");
        System.out.println();
        System.out.println("We can use HashSet if we do not care about order\n"
                + "and to have no duplicates.\n"
                + "We can use LinkedHashSet to order items in the array based on\n"
                + "the order they were inserted.");
        
        System.out.println();
        System.out.println("Create an array with different numbers and some are duplicates.");
        List<Integer> listNumbers = Arrays.asList(3, 9, 1, 4, 7, 2, 2, 78, 78, 43, 5, 3, 8, 9, 1, 3, 8, 6, 89);
        System.out.println(listNumbers);
        
        System.out.println();
        System.out.println("Apply the HashSet to the current list of numbers.\n"
                + "All duplicated were eliminated from the list");
        Set<Integer> uniqueNumbers = new HashSet<>(listNumbers);
        System.out.println(uniqueNumbers);
        
        
        uniqueNumbers.add(5);
        uniqueNumbers.add(158);
        
        System.out.println();
        System.out.println("After trying to inser two nuw numbers, only the one that\n"
                + "is not duplicate is added to the array.");
        System.out.println(uniqueNumbers);
        
        
        System.out.println();
        System.out.println("We can use a while loop to itinerate through the array\n"
                + "and show the list of numbers in the array");
        Iterator<Integer> iterator = uniqueNumbers.iterator();

        while (iterator.hasNext()) {
            Integer name = iterator.next();
            System.out.println(name);
        }
        
        System.out.println();
        System.out.println("We can look fir an element inside the array and make it\n"
                + "display a message it the element is found. We need to use the\n"
                + "contains word to locate the item.");
        System.out.println();
        if (uniqueNumbers.contains(158)) {
        System.out.println("Found 158 inside the array");
        }
        
        System.out.println();
        System.out.println();
        System.out.println("+++++Java Collections - Map+++++");
        
        System.out.println();
        System.out.println("Map is used to match a value with other.\n"
                + "Is great to use it like a dictonary, where a value has it own description..\n"
                + "HashMap can be use when the order does not matter and nulls are acceptable.\n"
                + "LinkedHashMap should be use when we want the value and key sorted\n"
                + "by the insertion order.\n"
                + "TreeMap also matches the value with the corresponding key and accepts\n"
                + "a data structure to specify how we want to sort the values in the array.");
        
        
        System.out.println();
        System.out.println("HashMap list creation");
        Map<Integer, String> mapEmployes = new HashMap<>();
        mapEmployes.put(89, "Isaac Fuentes ");
        mapEmployes.put(10, "Daniel Fuentes");
        mapEmployes.put(02, "Jahziel Fuentes");
        mapEmployes.put(103, "Grecia Nava");

        System.out.println(mapEmployes);
        
        System.out.println();
        System.out.println("LinkedHashMap list creation");
        Map<String, String> mapAge = new LinkedHashMap<>();
 
        mapAge.put("60", "Gregorio Fuentes");
        mapAge.put("32", "Manuel Nava");
        mapAge.put("8", "Zoe Fuentes");
        mapAge.put("2", "Lena Uriostegui");

        System.out.println(mapAge);
        
        System.out.println();
        System.out.println("TreeMap list creation");
        
        Map<String, String> mapCountryCity = new TreeMap<>();
 
        mapCountryCity.put("Mexico", "Puerto Vallarta");
        mapCountryCity.put("France", "Paris");
        mapCountryCity.put("Turkey", "Istanbul");
        mapCountryCity.put("Japan", "Tokyo");
        mapCountryCity.put("USA", "New York");
        mapCountryCity.put("Canada", "Calgary");
        mapCountryCity.put("Chile", "Santiago");

        System.out.println(mapCountryCity);
        
        System.out.println();
        System.out.println();
        System.out.println("+++++Java Collections - Queue+++++");
        
        System.out.println();
        System.out.println("This type of collection is used to hold data or elements that\n"
                + "will be place one after the other when an item in the queue is\n"
                + "processed just until the one in front is moved out of the queue. ");
        System.out.println();
        System.out.println("We have the Queue interface which mantains the items in \n"
                + "their insertions order."
                + "Dequeue allows to have two heads, meaning that we cna add or remove\n"
                + "elements from both ends of the array.");
        System.out.println();
        
        System.out.println("We will create a Queue array  wit the LinkedList,\n"
                + "with no size specified and add items to it.");
        
        Queue<String> ordersQueue = new LinkedList<>();
        ordersQueue.add("Hamburguer");
        ordersQueue.add("Hot Dog");
        ordersQueue.add("Taco");
        ordersQueue.add("Soda");
        ordersQueue.add("Burrito");
        
        System.out.println();
        System.out.println(ordersQueue);
        
        System.out.println();
        System.out.println("We will create a Dequeue array and add items using,\n"
                + "the offer keyword.");
        
        Deque<String> collectablesQueue = new ArrayDeque<>();
 
        collectablesQueue.offer("Goku");
        collectablesQueue.offer("Vegeta");
        collectablesQueue.offer("Goku");
        collectablesQueue.addFirst("Freezer");
        collectablesQueue.addLast("Krilin");

        System.out.println();
        System.out.println(collectablesQueue);
        
        System.out.println();
        System.out.println("This type of collection allows to have duplicates");
        
        System.out.println();
        System.out.println();
        System.out.println("+++++Java Collections - Tree+++++");
        
        System.out.println();
        System.out.println("Duplicate Elements are not allowed and the items inside\n"
                + "the array are sorted by their natural ordering.");
        
        System.out.println();
        System.out.println("We create the array using the SortedSet keyword that \n"
                + "will sort the items in thei natural order.");
        
        SortedSet<Integer> setNumbers = new TreeSet<>();
        setNumbers.addAll(Arrays.asList(2, 1, 4, 3, 6, 5, 8, 7, 0, 9, 10, 34, 67, 2, 4));
        
        System.out.println();
        System.out.println("We can also use different operators to retieve specific\n"
                + "information from the array like the first element, last, between\n"
                + "a range of items inside the array and the first or last items\n"
                + "depending on how many we specified.");
        
        System.out.println();
        System.out.println("Original Set: " + setNumbers);
        Integer first = setNumbers.first();
        System.out.println("First element: " + first);
        Integer last = setNumbers.last();
        System.out.println("Last element: " + last);
        SortedSet<Integer> subSet = setNumbers.subSet(3, 7);
        System.out.println("Sub Set: " + subSet);
        SortedSet<Integer> headSet = setNumbers.headSet(5);
        System.out.println("Head Set: " + headSet);
        SortedSet<Integer> tailSet = setNumbers.tailSet(5);
        System.out.println("Tail Set: " + tailSet);
        Comparator comparator = setNumbers.comparator();
        System.out.println("Sorted by natural ordering? " + (comparator == null));
        
        
    } 
} 
