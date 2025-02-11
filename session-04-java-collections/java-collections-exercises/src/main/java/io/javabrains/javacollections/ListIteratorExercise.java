package io.javabrains.javacollections;
/*
Print the list in forward and reverse order using iterators only
*/
import java.util.ArrayList;
import java.util.ListIterator;
public class ListIteratorExercise {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Item 1");
        list.add("Item 2");
        list.add("Item 3");
        list.add("Item 4");
        list.add("Item 5");
        System.out.println("Forward order of the list:");
        ListIterator<String>forward=list.listIterator();
        while(forward.hasNext()){
            System.out.print(forward.next()+" ");
        }
        System.out.println();
        System.out.println("Reverse order of the list:");
        ListIterator<String>reverse=list.listIterator(list.size());
        while(reverse.hasPrevious()){
            System.out.print(reverse.previous()+" ");
        }
        System.out.println();
    }
}
