import java.util.Arrays;

/*Write a program that creates a String array of 5 elements and swaps the first element with the middle element without creating a new array.
 */
public class App8 {
    public static void main(String[] args) {
        String[] arr = {"First", "Second", "Third", "Fourth", "Fifth"};

        int middleIndex = arr.length/2;

        String temp = arr[0];
        arr[0] = arr[middleIndex];
        arr[middleIndex] = temp;

        System.out.println(Arrays.toString(arr));
    }
}
