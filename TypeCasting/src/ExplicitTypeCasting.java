public class ExplicitTypeCasting
{
    public static void main(String[] args) {
        double d = 100.04;
        //explicit type casting
        long l = (long)d;
        int i = (int)l;
        System.out.println("double value: "+d);
        System.out.println("long value: "+l);
        System.out.println("int value:" +i);

        byte b;
        int z = 257;
        double dou = 323.142;
        System.out.println("conversion of int to byte");
        b= (byte)z;
        System.out.println("z= "+z +" b= "+b);
        System.out.println("conversion of double to int");
        z = (int)dou;
        System.out.println("z= "+z + " d=" +dou);
        System.out.println("conversion of double to byte");
        b=(byte)dou;
        System.out.println("d= "+ dou + " b="+b);
    }
}
