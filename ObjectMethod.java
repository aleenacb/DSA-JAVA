class Object {
    //Methods using for two integers to add
    int s = 0;
    public int AddTwoInt(int a, int b) {
        s = a + b;
        return s; 
    }
}
class ObjectMethod {
    public static void main(String[] args) {
        Object o = new Object();
        int res = o.AddTwoInt(2, 4);
        System.out.println("Sum : " + res);
    }
}