class quickprac {
    private static int partition(int [] arr, int low, int high) {
        int pivot = arr[high];//choose pivot = last element
        int i = (low - 1);//choose smaller elements

        for(int j = low; j < high; j++) {
            if(arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i+1, high);//place it in crct position
        return i + 1;
    }

 static void swap(int[] arr, int i, int j) {
    var temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}

public static void quickprac(int[] arr, int low, int high) {
    int pi = partition(arr, low, high);
    if(low < high) {
        quickprac(arr, low, pi - 1);//left index
        quickprac(arr, pi + 1, high);//right index
    }
}
public static void main(String[] args) {
    int[] numbers = {10, 7, 8, 9, 1, 5};
    int n = numbers.length - 1;
    quickprac(numbers, 0, n);
    System.out.println("Sorted array:");
    for(int num : numbers) {
        System.out.print(num +" ");
    }
}
}