/*Write a program where you create an integer array with a length of 5. Loop through the array and assign the value of the loop control variable (e.g., i) to the corresponding index in the array.
 */

public class App5 {
    public static void main(String[] args) {
        int[] arr = new int[5];

        for(int i = 0; i< arr.length; i++){
            arr[i] = i;
        }
    }
}
