/*The distance a vehicle travels can be calculated as follows:
Distance 5 Speed * Time
Write a method named distance that accepts a vehicle’s speed and time as arguments, and
returns the distance the vehicle has traveled. Modify the “Distance Traveled” program you
wrote in Chapter 4 (Programming Challenge 2) to use the method..*/

public class App2 {
    public static void main(String[] args) {
        System.out.println(distance(4,60));
    }
    public static int distance(int metersPerSeconds, int seconds){
        return metersPerSeconds * seconds;
    }
}
