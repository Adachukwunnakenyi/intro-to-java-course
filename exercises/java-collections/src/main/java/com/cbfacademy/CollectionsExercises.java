package com.cbfacademy;

import java.util.*;

public class CollectionsExercises {

    public LinkedList<Integer> useLinkedList() {
        // TODO: create an empty linked list
        //  - add 4 as the first element of the list
        //  - then add 5, 6, 8, 2, 9 to the list
        //  - add another 2 as the last element of the list
        //  - add 4 as the 3rd element of the list
        //  - invoke the method element() on the list and print the result on the screen
        //  - return the list
        //throw new RuntimeException("Not implemented");
        LinkedList<Integer> linkedElement = new LinkedList<>();
        linkedElement.addFirst(4);
        linkedElement.add(5);
        linkedElement.add(6);
        linkedElement.add(8);
        linkedElement.add(2);
        linkedElement.add(9);
        linkedElement.addLast(2);
        linkedElement.add(2, 4);
        System.out.print(linkedElement.element());
        return linkedElement;
    }

    public Stack<Integer> useStack() {
        // TODO: create an empty stack
        //  - add 5, 6, 8, 9 to the stack
        //  - print the first element of the stack on the screen
        //  - print the last element of the stack on the screen
        //  - invoke the method pop() on the stack and print the result on the screen
        //  - invoke the push(4) method on the stack
        //  - return the stack
        // throw new RuntimeException("Not implemented");
        Stack<Integer> stack = new Stack<>();
        stack.add(5);
        stack.add(6);
        stack.add(8);
        stack.add(9);
        System.out.print(stack.get(0));
        System.out.print(stack.getLast());
        System.out.print(stack.pop());
        stack.push(4);
        return stack;
    }

    public ArrayDeque<Integer> useArrayDeque() {
        // TODO: create an empty arrayDeque
        //  - add 5, 6, 8, 9 to the queue
        //  - print the first element of the queue on the screen
        //  - print the last element of the queue on the screen
        //  - invoke the method poll() on the queue and print the result on the screen
        //  - invoke the element() method on the queue and print the result on the screen
        //  - return the queue
       // throw new RuntimeException("Not implemented");
       ArrayDeque<Integer> ad = new ArrayDeque<>();
       ad.add(5);
       ad.add(6);
       ad.add(8);
       ad.add(9);
       System.out.print(ad.getFirst());
       System.out.print(ad.getLast());
       System.out.print(ad.poll());
       System.out.print(ad.element());
       return ad;
    }

    public HashMap<Integer, String> useHashMap() {
        // TODO: create an empty hash map
        //  - add {1, TypeScript} entry to the map
        //  - add {2, Kotlin} entry to the map
        //  - add {3, Python} entry to the map
        //  - add {4, Java} entry to the map
        //  - add {5, JavaScript} entry to the map
        //  - add {6, Rust} entry to the map
        //  - determine the set of keys from the map and print it on the screen
        //  - determine the set of values from the map and print it on the screen
        //  - determine whether the map contains "English" as a language and print the result on the screen
        //  - return the map
        //throw new RuntimeException("Not implemented");
        HashMap<Integer,String> hm = new HashMap<>();
        // hm.entrySet() = {1, "TypeScript"};
        hm.put(1, "TypeScript");
        hm.put(2, "Kotlin");
        hm.put(3, "Python");
        hm.put(4, "Java");
        hm.put(5, "JavaScript");
        hm.put(6, "Rust");
        System.out.print(hm.keySet());
        System.out.print(hm.values());
        System.out.print(hm.containsValue("English"));
        return hm;
    }

    public String getName() {
        return "Collections Exercises";
    }
}
