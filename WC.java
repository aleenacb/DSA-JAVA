//WrapperClass Example
class WC {
    public static void main(String[] args) {
        byte b = 1;
        Byte byteobj = Byte.valueOf(b);

        int i = 2;
        Integer intobj = Integer.valueOf(i);

        float f = 3.45f;
        float floatobj = Float.valueOf(f);

        double d = 455.34;
        Double doubleobj = Double.valueOf(d);

        char c = 'A';
        Character charobj = c;//Autoboxing

        System.out.println("Wrapper objects");
        System.out.println(byteobj);
        System.out.println(intobj);
        System.out.println(floatobj);
        System.out.println(doubleobj);
        System.out.println(charobj);

        //unboxing
        byte bv = byteobj;
        int iv = intobj;
        float fo = floatobj;
        double dv = doubleobj;
        char co = charobj;

        System.out.println("Unwrapped Classes");
        System.out.println(bv);
        System.out.println(iv);
        System.out.println(fo);
        System.out.println(dv);
        System.out.println(co);
    }
}