/*Write a program where you create an array of 5 elements. Loop through the array and print the value of each element, except for the middle (index 2) element.*/

public class App7 {
    public static void main(String[] args) {
        int[] arr = {2,4,6,7,8};
        int middle = arr.length/2; //because it is an int it will trunacate on it's own, no reason to use floor func
        for(int i=0; i<arr.length; i++){
            if(i == middle){
                continue;
            }
            System.out.println(arr[i]);
        }
    }
}
