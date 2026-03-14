class Parameter {
    public static void main(String[] args) {
        Parameter obj = new Parameter();
        obj.add(2, 3);
    }
    public static void add(int a, int b) {
        int s = a + b;
        System.out.println("Sum : " + s);
    }
}
