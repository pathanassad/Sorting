class Quick {

public static int helper(int[] arr, int low, int high){
    int pivot = arr[low];
    int i = low;
    int j = high;
    while(i<j){
        while(arr[i]<=arr[pivot] && i<=high){
            i++;
        }
        while(arr[j]>arr[pivot] && j>=low){
            j--;
        }
        if(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        int temp = arr[j];
        arr[j] = arr[low];
        arr[low] = temp;

        return j;

    }
}
public void quickSort(int[] arr, int low, int high){
    if(low<high)
    {
        int pIndex = helper(arr, low, high);
        quickSort(arr, low, pIndex -1);
        quickSort(arr, pIndex + 1, high);

    }
}
}