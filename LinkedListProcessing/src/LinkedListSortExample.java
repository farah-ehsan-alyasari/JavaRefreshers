import java.util.*;

public class LinkedListSortExample {

    public static void main(String[] args) {
        //create LinkedList

        LinkedList<String> linkedlist = new LinkedList<>();

        linkedlist.add("A");
        linkedlist.add("C");
        linkedlist.add("B");
        linkedlist.add("D");

        System.out.println("linkdlist unsorted: " + linkedlist);

        //sort the list
        Collections.sort(linkedlist);

        System.out.println("sorted list " + linkedlist);

        //custom sorting
        //Please note that for custom sorting of
        //objects, we can use Collections.sort(linkedList, comparator) method
        Collections.sort(linkedlist, Collections.reverseOrder());

        System.out.println("reversed list: " + linkedlist);

    }
}
