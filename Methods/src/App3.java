/*A prime number is a number that is evenly divisible only by itself and 1. For example, the
number 5 is prime because it can be evenly divided only by 1 and 5. The number 6, however,
is not prime because it can be divided evenly by 1, 2, 3, and 6.
Write a method named isPrime, which takes an integer as an argument and returns true if
the argument is a prime number, or false otherwise. Demonstrate the method in a complete
program*/

/*Use the isPrime method that you wrote in Programming Challenge 13 in a program that
stores a list of all the prime numbers from 1 through 100 in a file*/

import java.io.*;

public class App3 {
    public static void main(String[] args) {
        //System.out.println(isPrime(15));
        storeToFile(2, "fileName.txt");
    }
    public static boolean isPrime(int num){
        if(num<=1){
            return false;
        }
        for(int i=2; i< Math.sqrt(num); i++){
            if(num%i == 0){
                return false;
            }
        }
        return true;
    }

    public static void storeToFile(int num, String fileName){
        BufferedWriter out = null;
        try{
            FileWriter fstream = new FileWriter(fileName, true);
            out = new BufferedWriter(fstream);
            out.write(num);
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
        finally{
            if(out!=null){
                try {
                    out.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
