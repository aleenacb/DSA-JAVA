class ArrayDatatypes {
    public static void main(String[] args) {
        int num[] = {2, 4, 6, 8, 10};
        String arr[] =  {"As", "Has", "ds"};
        num = new int[5];
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            num[i] = i + 1;
            System.out.println(num[i]);
        }
    }
    System.out.println(num[0]);
    System.out.println(arr[1]);

}