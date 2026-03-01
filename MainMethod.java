class Instance {
    //Methods to add two integers
    public void addTwoInt() {
        int a = 10;
        int b = 20;
        System.out.println("Sum : " + (a + b));
    }
}
class MainMethod {
    public static void main(String[] args) {
        Instance o = new Instance();
        o.addTwoInt();
    }
}