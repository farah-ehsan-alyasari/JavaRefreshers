public class App5 {
    public static void main(String[] args) {
        int x = 7;
        int y = 17;

        /*
        * Here is my guess for 7 & 17
        * 7      = 00111
        * 17     = 10001
        * 7 & 17 = 00001
        * which is 1 in decimal
        * */

        int z = x & y;
        System.out.println(z);
        System.out.println(Integer.toBinaryString(z));

        System.out.println("*****");
        /*
        * Here is my guess for 7 | 17
        * 7      = 00111
        * 17     = 10001
        * 7 | 17 = 10111
        * which is 23 in decimal
        * */

        z = x | y;
        System.out.println(z);
        System.out.println(Integer.toBinaryString(z));
    }
}
