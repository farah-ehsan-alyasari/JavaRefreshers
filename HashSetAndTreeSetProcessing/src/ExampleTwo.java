import java.util.*;

public class ExampleTwo {
    public static void main(String[] args) {
        HashSet<Integer> evenNumbers = new HashSet<>();
        evenNumbers.add(2);
        evenNumbers.add(4);
        evenNumbers.add(6);
        System.out.println("hashset1: " + evenNumbers);

        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(2);
        numbers.add(4);
        System.out.println("hashset2: " + numbers);

        //union of the two sets
        //numbers.addAll(evenNumbers);
        //System.out.println("union: " + numbers);

        //difference between the two sets
        //numbers.removeAll(evenNumbers);
        //System.out.println("difference: "+numbers);

        numbers.add(null);

        for(Integer i: numbers){
            System.out.println(i);
        }


    }
}
