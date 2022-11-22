public class App3 {
    public static void main(String[] args) {
        int x = 2;
        System.out.println(x);
        System.out.println(Integer.toBinaryString(x));

        /*Before printing the results
        I guess that x will either by divided by 1 or
        multiplied by 1 and the decimal number will stay the same
        **/
        x = x << 1;
        System.out.println(x);
        System.out.println(Integer.toBinaryString(x));

        /*my guess was wrong. the number was multiplied by 2
        * */

        /*Now, let's repeat the excerise for 9, 17, and 88
        * */

        System.out.println("******");

        x = 9;
        System.out.println(x);
        System.out.println(Integer.toBinaryString(x));
        x = x << 1;
        System.out.println(x);
        System.out.println(Integer.toBinaryString(x));

        System.out.println("******");

        x = 17;
        System.out.println(x);
        System.out.println(Integer.toBinaryString(x));
        x = x << 1;
        System.out.println(x);
        System.out.println(Integer.toBinaryString(x));

        System.out.println("******");

        x = 88;
        System.out.println(x);
        System.out.println(Integer.toBinaryString(x));
        x = x << 1;
        System.out.println(x);
        System.out.println(Integer.toBinaryString(x));

        /*
        * I notice that a left shift by x,
        *  multiplies the number that's being shifted
        * by 2^x
        * */
    }
}