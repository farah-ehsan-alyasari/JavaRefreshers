/*there is a problem with this program, but i
* don't know what is it*/

import java.util.Scanner;

public class App2 {
    public static void main(String[] args) {
        System.out.println("please enter the first positive integer");

        Scanner scanner = new Scanner(System.in);

        int n1 = scanner.nextInt();

        System.out.println("please enter the second positive integer");

        int n2 = scanner.nextInt();

        int gcd = 1;

        for(int k = smallest(n1, n2); k>1;k--){
            if(n1 % k == 0 && n2 % k ==0){
                gcd = k;
            }
        }

        System.out.println("The gcd is: " + gcd);

    }

    public static int smallest(int n, int m){
        if(n<m) return n;
        else return m;
    }
}
