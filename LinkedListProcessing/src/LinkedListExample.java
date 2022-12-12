import java.util.*;

public class LinkedListExample {
    public static void main(String[] args) {
        //LinkedLIst declaration
        LinkedList<String> linkedlist = new LinkedList<>();

        linkedlist.add("item1");
        linkedlist.add("Item5");
        linkedlist.add("Item3");
        linkedlist.add("Item6");
        linkedlist.add("Item2");

        //display linkedlist content
        System.out.println("linkedlist content: " + linkedlist);

        linkedlist.addFirst("first item");
        linkedlist.addLast(" last item");

        System.out.println("linkedlist content after addition" + linkedlist);

        //getting and setting values
        Object firstVar = linkedlist.get(0);
        String secondVar = linkedlist.get(1);
        var thirdVar = linkedlist.get(2);

        linkedlist.set(0, "changed first item");
        Object firstVar2 = linkedlist.get(0);

        System.out.println("First element after update by set method: " +firstVar2);

        /*Remove first and last element*/
        linkedlist.removeFirst();
        linkedlist.removeLast();
        System.out.println("LinkedList after deletion of first and last element: "+ linkedlist);
                /* Add to a Position and remove from a position*/
                linkedlist.add(0, "Newly added item");
        linkedlist.remove(2);
        System.out.println("Final Content: " +linkedlist);
    }
}
