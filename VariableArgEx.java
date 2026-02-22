class VariableArgEx {
    public static void Number(int...a) {
        System.out.println("Number of integers " + a.length);
        for (int i : a) {
            System.out.println(i + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Number(100);
        Number(1, 2, 3, 4, 5);
        Number(10, 20);
    }
}