public class MyRunners {
    public static void main(String[] args) {
        GMultipleDatatype<String, Integer> obj = new GMultipleDatatype<>("test", 12);
        System.out.println(obj.getValueOne());
        System.out.println(obj.getValueTwo());

        GMultipleDatatype<Double, Character> obj2 = new GMultipleDatatype<>(1.9, 'd');
        System.out.println(obj2.getValueOne());
        System.out.println(obj2.getValueTwo());
    }
}
