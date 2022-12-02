/*Write a program that creates an array of String type and initializes it with the strings “red”, “green”, “blue” and “yellow”. Print out the array length. Make a copy using the clone( ) method. Use the Arrays.toString( ) method on the new array to verify that the original array was copied.
 */

import java.util.Arrays;

public class App3 {

    public static void main(String[] args) {
        String[] arr1 = {"red", "green", "blue", "yellow"};
        System.out.println(arr1.length);

        String[] arr2 = arr1.clone();

        System.out.println(Arrays.toString(arr2));
    }
}
