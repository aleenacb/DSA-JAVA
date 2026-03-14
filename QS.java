class QS {
    public int partition(int a[], int low, int high) {
        int i = low - 1;
        int pivot = a[high];
        for(int j = low; j < high; j++) {
            if(a[j] <= pivot) {
                i++;
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        int temp = a[i + 1];
        a[i + 1] = a[high];
        a[high] = temp;
        return i + 1;
    }
    void sort(int a[], int l, int h) {
        if(l < h) {
            int pi = partition(a, l, h);
            sort(a, l, pi - 1);
            sort(a, pi + 1, h);
        }
    }
    public static void main(String[] args) {
        int a[] = {6, 3, 5, 9, 2, 8};
        int n = a.length;
        QS ob = new QS();
        ob.sort(a, 0, n - 1);
        for(int i = 0; i < n; i++) 
        System.out.print(a[i] + " ");
    }
}
//6 3 5 9 2 8
//select pivot element we can select any random number but we always choose last element
//pivot = 8
//we can now partition quicksort as low and high
//which means we select pivot as 8 
//In left we choose only low element and right only high element
//Which means pivot is 8 In left of array we can sort arrays as 2, 3, 6, 5 and in right sort it as 9 only one biggest no left there 
// now again we sort in left that is last pivot element that is 5 we choose low parts as 2, 3 and 6 and 9 are there highest part of 5
//now we have 2, 3 and 6, 9
//Now we take 3 everything is right there
//Next 2, 3, 5, 6, 8, 9
//6 3 5 9 2 8
//6 3 5 9 2 |8 = pivot
//2 3 6 5 | 9
//pivot = 5
//2 3 6 | 9
//pivot = 6
//2 3 | 9
//pivot 3 
//2 | 9
//Now we arrange everything in order
2 3 5 6 8 9