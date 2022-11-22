public class App4 {
    public static void main(String[] args) {
        int x = 150;
        System.out.println(x);
        System.out.println(Integer.toBinaryString(x));

        /*Before printing the results
        I guess that x will be divided by 4, which is 2^2
        **/
        x = x >> 2;
        System.out.println(x);
        System.out.println(Integer.toBinaryString(x));

        /*my guess was correct, right shift divided the number by 4
        however, i forgot to guess that it will also truncate any decimals
        because we are using int type not double
         * */

        /*Now, let's repeat the excerise for three more numbers
         * */

        System.out.println("******");

        x = 225;
        System.out.println(x);
        System.out.println(Integer.toBinaryString(x));
        x = x >> 2;
        System.out.println(x);
        System.out.println(Integer.toBinaryString(x));

        System.out.println("******");

        x = 1555;
        System.out.println(x);
        System.out.println(Integer.toBinaryString(x));
        x = x >> 2;
        System.out.println(x);
        System.out.println(Integer.toBinaryString(x));

        System.out.println("******");

        x = 32456;
        System.out.println(x);
        System.out.println(Integer.toBinaryString(x));
        x = x >> 2;
        System.out.println(x);
        System.out.println(Integer.toBinaryString(x));

        /*
         * I notice that a left shift by x,
         *  multiplies the number that's being shifted
         * by 2^x
         * */
    }
}