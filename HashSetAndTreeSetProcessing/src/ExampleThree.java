import java.util.*;
public class ExampleThree {

    public static void main(String[] args) {
        TreeSet<Integer> numTreeSet = new TreeSet<>(new CustomizedComparator());
        numTreeSet.add(20);
        numTreeSet.add(5);
        numTreeSet.add(15);
        numTreeSet.add(25);
        numTreeSet.add(10);

        //call iterator() to define iterator for numTreeSet

        Iterator<Integer> iterSet = numTreeSet.iterator();
        System.out.println("using iterator: ");

        while(iterSet.hasNext()){
            System.out.print(iterSet.next());
            System.out.print(", ");
        }

        boolean value1 = numTreeSet.remove(5);
        System.out.println("is 5 removed? "+ value1);

        boolean value2 = numTreeSet.remove(25);
        System.out.println("is 25 removed? "+ value2);

        Integer first = numTreeSet.first();
        System.out.println("first number: "+ first);

        Integer last = numTreeSet.last();
        System.out.println("last number: "+ last);

        System.out.println("treeset: "+ numTreeSet);

    }
}
