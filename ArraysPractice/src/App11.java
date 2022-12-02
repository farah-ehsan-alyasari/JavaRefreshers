/*
* Write some Java code that asks the user how many favorite things they have. Based on their answer, you should create a String array of the correct size. Then ask the user to enter the things and store them in the array you created. Finally, print out the contents of the array.
Example

How many favorite things do you have?
7

Enter your thing: phone
Enter your thing: tv
Enter your thing: xbox
Enter your thing: wine
Enter your thing: beer
Enter your thing: sofa
Enter your thing: book
Your favorite  things are:
phone tv xbox wine beer sofa book
*/

import java.util.Arrays;
import java.util.Scanner;

public class App11 {
    public static void main(String[] args) {
        System.out.println("how many favorite things do you have? ");

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        String[] things = new String[num];

        for(int i = 0; i<num; i++){
            System.out.println("Enter your thing: ");
            String thing = scanner.next();
            things[i] = thing;
        }

        System.out.println("Your favorite things are: " + Arrays.toString(things));
    }
}
