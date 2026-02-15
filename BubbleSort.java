class BubbleSort {
    public static void BubbleSort(int[] a) {
        int n = a.length;
        boolean swapped;
        for(int i = 0; i < n - 1; i++) {
            swapped = false;
            for(int j = 0; j < n - i - 1; j++) {
                
                if(a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    swapped = true;
                }
            }
            if(!swapped) break;
        }
        
    }
    public static void main(String[] args) {
        int numbers[] = {12, 1, 8, 15, 19};
        BubbleSort(numbers);
        for(int n : numbers) {
            System.out.print(n + " ");
        }
    }
}