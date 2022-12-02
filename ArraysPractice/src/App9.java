/*Write a program to sort the following int array in ascending order: {4, 2, 9, 13, 1, 0}. Print the array in ascending order, and print the smallest and the largest element of the array. The output will look like the following:
Array in ascending order: 0, 1, 2, 4, 9, 13
The smallest number is 0
The biggest number is 13
*/

import java.util.Arrays;

public class App9 {
    public static void main(String[] args) {

        int[] arr = {4, 2, 9, 13, 1,0};

        int temp;

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j<arr.length; j++){
                if(arr[i]<arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(arr[0]);
        System.out.println(arr[arr.length-1]);

        int[] arr2 = {4, 2, 9, 13, 1,0};
        Arrays.sort(arr2);

        System.out.println(Arrays.toString(arr2));
        System.out.println(arr2[0]);
        System.out.println(arr2[arr.length-1]);

    }
}
