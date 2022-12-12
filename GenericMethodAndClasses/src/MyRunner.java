public class MyRunner {
    public static void main(String[] args) {
        DemoClass dObject = new DemoClass();
        dObject.genericMethod((23));
        dObject.genericMethod("Testing");
        dObject.genericMethod(234.3);
        dObject.genericMethod('C');
    }
}
