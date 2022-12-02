/*Write a program that returns the middle element in an array. Give the following values to the integer array: {13, 5, 7, 68, 2} and produce the following output: 7
 */

public class App2 {
    public static void main(String[] args) {

        int[] arr = {13, 5, 7, 68, 2};

        int middleIndex = (int) Math.floor(arr.length/2);

        System.out.println(arr[middleIndex]);
    }
}
