/*Write a program that creates an integer array with 5 elements (i.e., numbers). The numbers can be any integers.  Print out the value at the first index and the last index using length - 1 as the index. Now try printing the value at index = length ( e.g., myArray[myArray.length ] ).  Notice the type of exception which is produced. Now try to assign a value to the array index 5. You should get the same type of exception.*/

public class App4 {
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4};
        //int[] arr = {0,1,2,3,4,5}
        System.out.println(arr[0]);
        System.out.println(arr[arr.length-1]);

        //this should give an exception:
        System.out.println(arr[arr.length]);
    }
}
