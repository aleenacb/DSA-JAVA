class Add {
    static int sum(int num1, int num2) {
        return num1 + num2;
    }
    public static void main(String[] args) {
        int res;
        Add obj = new Add();
        res = obj.sum(20, 10);
        System.out.println(res);
    }
}