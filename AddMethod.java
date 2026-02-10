class AddMethod {
    public static int Add(int n1, int n2) {
        int sum = n1 + n2;
        return sum;
    }
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = Add(a, b);
        System.out.println("Addition:" +c);
    }
}