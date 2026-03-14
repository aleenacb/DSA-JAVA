class QuickSort {
    private static int partition(int arr[], int low, int high) {
        int pivot = arr[high];//Choose pivot = last element
        int i = (low - 1);//index for small elements

        for(int j = low; j < high; j++) {
            if(arr[j] <= pivot) {
                i++;
                swap(arr, i, j);//place it in crct order
            }
        }
        swap(arr, i + 1, high);//Place it in correct position
        return i + 1;
    }
    private static void swap(int arr[], int i, int j) {
        var temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void QuickSort(int[] arr, int low, int high) {
        if(low < high) {
            int pi = partition(arr, low, high);
            QuickSort(arr, low, pi - 1);//left index
            QuickSort(arr, pi + 1, high);//right index
        }
    }
    public static void main(String[] args) {
        int[] numbers = {10, 7, 8, 9, 1, 5};
        QuickSort(numbers, 0, numbers.length - 1);
        System.out.println("Sorted array ");
        for(var num: numbers) {
            System.out.print(num + " ");
        }
    }
}
