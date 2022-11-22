public class App8 {
    public static void main(String[] args) {
        int x = 5;
        int y = 8;

        int sum1 = ++x + y;
        System.out.println(sum1);

        x=5;
        int sum2 = x++ + y;
        System.out.println(sum2);
    }
}
